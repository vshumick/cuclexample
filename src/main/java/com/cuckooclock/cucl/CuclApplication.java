package com.cuckooclock.cucl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class CuclApplication {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); //UK

        SpringApplication.run(CuclApplication.class, args);
    }

}

