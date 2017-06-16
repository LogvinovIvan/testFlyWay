package com.epam.test.config;

import org.flywaydb.core.Flyway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlyWayConfig {

    @Bean(initMethod = "migrate")
    public Flyway getFlyWay(){
        Flyway flyway = new Flyway();
        flyway.setBaselineOnMigrate(true);
        flyway.setDataSource("jdbc:oracle:thin:@evbyminsd385e.minsk.epam.com:1521:ORADB1","ivanlohvinau", "ivanlohvinau");
        flyway.setLocations("/db");
        flyway.migrate();
        return flyway;

    }
}
