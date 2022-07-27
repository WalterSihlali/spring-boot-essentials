package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.JULY;
import static java.util.Calendar.SEPTEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository) {
        return args -> {
          Student walter =  new Student(
                    "Walter",
                    "walt@gmail.com",
                    LocalDate.of(1980, SEPTEMBER,1));

            Student alex =  new Student(
                    "Alexr",
                    "alex@gmail.com",
                    LocalDate.of(1990, JULY,1));


            repository.saveAll(
                    List.of(walter,alex)
            );
        };
    }
}
