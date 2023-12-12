package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.FEBRUARY;
import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "mariam",
                    "mariam22@gmail.com",
                    LocalDate.of(2000, Month.AUGUST, 12 ),
                    45
            );

            Student mohamed = new Student(
                    "mohamed",
                    "moha33@gmail.com",
                    LocalDate.of(2012, Month.FEBRUARY ,26),
                    12
            );

            repository.saveAll(
                    List.of(mariam,mohamed)
            );
        };
    }
}
