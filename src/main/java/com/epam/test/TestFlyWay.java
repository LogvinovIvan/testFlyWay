package com.epam.test;

import org.flywaydb.core.Flyway;

/**
 * Created by Ivan_Lohvinau on 6/15/2017.
 */
public class TestFlyWay {

    public static void main(String[] args) {
        Flyway flyway = new Flyway();
        flyway.setDataSource("jdbc:oracle:thin:@evbyminsd385e.minsk.epam.com:1521:ORADB1","ivanlohvinau", "ivanlohvinau");
        flyway.setLocations("/db");

        flyway.migrate();
        System.out.println("Migration finished");
    }
}
