package com.lseg.homework.homework16;

import java.sql.*;

public class AlbumRepository {

    public final static String insertAlbumStatement = "INSERT INTO album (singerId, name, releaseDate, description) " +
            "VALUES (?, ?, ?, ?)";

    public final static String getAlbumByName = "SELECT * \n" +
            " FROM spotify.album a " +
            " WHERE a.name = ? ";

    public final static String updateAlbumDescription = "UPDATE spotify.album \n" +
            " SET description = ? " +
            " WHERE name = ? ";

    public final static String deleteAlbumByName = "DELETE FROM spotify.album \n" +
            " WHERE name = ? ";


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


    public int createAlbum(Album album) {
        try (Connection connection = createConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(insertAlbumStatement);
            SingerRepository singerRepository = new SingerRepository();
            preparedStatement.setLong(1, singerRepository.getSingerId(album.getSinger()));
            preparedStatement.setString(2, album.getName());
            preparedStatement.setDate(3, Date.valueOf(album.getReleaseDate()));
            preparedStatement.setString(4, album.getDescription());


            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated != 1) {
                throw new IllegalStateException("Only one album row should be inserted!");
            } else {
                System.out.println("Album created");
            }
            return rowsUpdated;
        } catch (SQLException exc) {
            throw new RuntimeException(String.format("Could not execute statement %s %n to database", insertAlbumStatement),
                    exc);
        }
    }

    public void updateAlbumDescription(Album album, String newDescription) {

        try (Connection connection = createConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(updateAlbumDescription);
            preparedStatement.setString(1, newDescription);
            preparedStatement.setString(2, album.getName());
            preparedStatement.executeUpdate();
        } catch (SQLException exc) {
            throw new RuntimeException(String.format("Could not execute query %s %n to database", updateAlbumDescription),
                    exc);
        }
    }

    public Album getAlbumByAlbumName(String name) {
        Album resultedAlbum = new Album();
        SingerRepository singerRepository = new SingerRepository();
        try (Connection connection = createConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(getAlbumByName);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                resultedAlbum = Album.builder().name(name).description(resultSet.getString(5))
                        .releaseDate(resultSet.getDate(4).toLocalDate())
                        .singer(singerRepository.getSingerById(resultSet.getLong(2))).build();
            }
            return resultedAlbum;
        } catch (SQLException exc) {
            throw new RuntimeException(String.format("Could not execute query %s %n to database", getAlbumByName),
                    exc);
        }
    }

    public void deleteAlbum(Album album) {

        try (Connection connection = createConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteAlbumByName);
            preparedStatement.setString(1, album.getName());
            preparedStatement.executeUpdate();
        } catch (SQLException exc) {
            throw new RuntimeException(String.format("Could not execute query %s %n to database", deleteAlbumByName),
                    exc);
        }
    }
}
