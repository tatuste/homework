package com.lseg.homework.homework16;

import com.mysql.cj.Query;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class SingerRepository {

    public final static String getSingersByFirstNameQuery = "SELECT s.id as sid, \n" +
            "       lastName,\n" +
            "       firstName,\n" +
            "       birthDate,\n" +
            "       a.id as aid,\n" +
            "       singerId,\n" +
            "       name,\n" +
            "       releaseDate,\n" +
            "       description" +
            " FROM singer s" +
            " LEFT JOIN album a on s.id = a.singerId\n" +
            " WHERE s.firstName LIKE ?";

    public final static String getSingerIdByFirstAndLastName = "SELECT s.id \n" +
            " FROM spotify.singer s" +
            " WHERE s.firstName = ?  AND s.lastName = ? ";

    public final static String getSingerById = "SELECT * \n" +
            " FROM spotify.singer s" +
            " WHERE s.id = ? ";

    public final static String insertSingerStatement = "INSERT INTO singer (firstName, lastName, birthDate) " +
            "VALUES (?, ?, ?)";

    public static void main(String... args) {
        SingerRepository repository = new SingerRepository();
        /*repository.getSingerByFirstName("John")
                  .forEach(System.out::println);*/

        Singer singer = Singer.builder()
                .firstName("Johnny")
                .lastName("Cash")
                .birthDate(LocalDate.of(1950, 6, 12))
                .build();
//        repository.createSinger(singer);


    }

    public long getSingerId(Singer singer) {
        try (Connection connection = createConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(getSingerIdByFirstAndLastName);
            preparedStatement.setString(1, singer.getFirstName());
            preparedStatement.setString(2, singer.getLastName());
            ResultSet resultSet = preparedStatement.executeQuery();
            long result = 0;
            if (resultSet.next()) {
                result = resultSet.getLong(1);
            }
            return result;

        } catch (SQLException exc) {
            throw new RuntimeException(String.format("Could not execute query %s %n to database", getSingerIdByFirstAndLastName),
                    exc);
        }

    }

    public Singer getSingerById(long id) {
        try (Connection connection = createConnection()) {
            Singer resultedSinger = new Singer();
            PreparedStatement preparedStatement = connection.prepareStatement(getSingerById);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                resultedSinger = Singer.builder().firstName(resultSet.getString(2)).lastName(resultSet.getString(3)).birthDate(resultSet.getDate(4).toLocalDate()).build();
            }

            return resultedSinger;

        } catch (SQLException exc) {
            throw new RuntimeException(String.format("Could not execute query %s %n to database", getSingerById),
                    exc);
        }
    }

    public int createSinger(Singer singer) {
        try (Connection connection = createConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(insertSingerStatement);

            preparedStatement.setString(1, singer.getFirstName());
            preparedStatement.setString(2, singer.getLastName());
            preparedStatement.setDate(3, Date.valueOf(singer.getBirthDate()));

            int rowsUpdated = preparedStatement.executeUpdate();//toate statementurile de write
            if (rowsUpdated != 1) {
                throw new IllegalStateException("Only one singer row should be inserted!!!");
            } else {
                System.out.println("Singer created");
            }
            return rowsUpdated;
        } catch (SQLException exc) {
            throw new RuntimeException(String.format("Could not execute statement %s %n to database", insertSingerStatement),
                    exc);
        }
    }

    public List<Singer> getSingerFilter(String firstName, String lastName, LocalDate birthDate) {
        StringBuilder getSingerFilter = new StringBuilder("SELECT s.id, s.firstName, s.lastName, s.birthDate \n" +
                " FROM spotify.singer s ");
        if (!(firstName == null)) {
            getSingerFilter.append("WHERE firstName = " + "'" + firstName + "'");
        }
        if (!(lastName == null) && (firstName == null)) {
            getSingerFilter.append("WHERE lastName = " + "'" + lastName + "'");
        } else if (!(lastName == null)) {
            getSingerFilter.append("AND lastName = " + "'" + lastName + "'");
        }
        if ((firstName == null) && (lastName == null)) {
            getSingerFilter.append("WHERE birthDate = " + "'" + birthDate.getYear() + "-" + birthDate.getMonth().getValue() + "-" + birthDate.getDayOfMonth() + "'");
        } else {
            getSingerFilter.append("AND birthDate = " + "'" + birthDate.getYear() + "-" + birthDate.getMonth().getValue() + "-" + birthDate.getDayOfMonth() + "'");
        }

        try (Connection connection = createConnection()) {
            Singer currentSinger = new Singer();
            List<Singer> resultedSingers = new ArrayList<>();
            PreparedStatement preparedStatement = connection.prepareStatement(String.valueOf(getSingerFilter));
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                currentSinger = Singer.builder().id(resultSet.getLong(1)).firstName(resultSet.getString(2)).lastName(resultSet.getString(3)).birthDate(resultSet.getDate(4).toLocalDate()).build();
                resultedSingers.add(currentSinger);
            }

            return resultedSingers;

        } catch (SQLException exc) {
            throw new RuntimeException(String.format("Could not execute query %s %n to database", getSingerFilter),
                    exc);
        }
    }


    private Connection createConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3321/spotify?useSsl=true&serverTimezone=EET",
                    "root",
                    "secret-pass");
        } catch (SQLException exc) {
            throw new RuntimeException("Could not connect to database", exc);
        }
    }
}
