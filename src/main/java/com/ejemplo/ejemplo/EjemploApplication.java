package com.ejemplo.ejemplo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.ejemplo.student.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
public class EjemploApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemploApplication.class, args);
	}

	@GetMapping
	public List<Student> HelloWorld(){		
		return List.of(
			new Student(
				1L,
				"Luis",
				"luisoerizo@gmail.com",
				LocalDate.of(2000,Month.JANUARY, 5),
				21
			)
		);
	}

}
