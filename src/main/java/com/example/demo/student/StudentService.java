package com.example.demo.student;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "mohmaed",
                        "moha>gmail.com",
                        LocalDate.of(2012, Month.FEBRUARY ,12),
                        12
                )
        );
    }
}
