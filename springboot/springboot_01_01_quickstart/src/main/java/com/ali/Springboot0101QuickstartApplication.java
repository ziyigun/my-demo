package com.ali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication()
public class Springboot0101QuickstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot0101QuickstartApplication.class, args);
        //org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@3eb738bb,
    }
}
