package com.lseg.homework.homework16;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.time.LocalDate;


public class JDBCConfig {

    private static final DriverManagerDataSource dataSource;

    private static final JdbcTemplate jdbcTemplate;

    static {
        dataSource = new DriverManagerDataSource();
        dataSource.setPassword("secret-pass");
        dataSource.setUsername("root");
        dataSource.setUrl("jdbc:mysql://localhost:3321/spotify?useSsl=true&serverTimezone=EET");
        jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
    }


    public static void main(String... args) {
        AlbumRepository albumRepository = new AlbumRepository();
        SingerRepository singerRepository = new SingerRepository();

        Singer singer1 = Singer.builder().firstName("John").lastName("Snow").birthDate(LocalDate.of(1980, 2, 3)).build();
        singerRepository.createSinger(singer1);
        System.out.println(singer1.getId());
        System.out.println(singerRepository.getSingerId(singer1));


        Album album1 = Album.builder().name("ABC").description("dsdfsfds").releaseDate(LocalDate.of(2021, 1, 1)).singer(singer1).build();
        albumRepository.createAlbum(album1);

        System.out.println(albumRepository.getAlbumByAlbumName("Thriller").toString());
        System.out.println(singerRepository.getSingerById(3));

        albumRepository.updateAlbumDescription(album1, "new descp");
        System.out.println(albumRepository.getAlbumByAlbumName(album1.getName()).getDescription());

        albumRepository.deleteAlbum(album1);

        System.out.println(singerRepository.getSingerFilter(null, null, LocalDate.of(1940, 10, 9)));

    }
}

