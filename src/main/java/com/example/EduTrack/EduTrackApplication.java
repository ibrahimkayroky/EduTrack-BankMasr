package com.example.EduTrack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EduTrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduTrackApplication.class, args);
	}

}

//local
// mvn spring-boot:run -Dspring-boot.run.profiles=local

//testing/UAT
// mvn spring-boot:run -Dspring-boot.run.profiles=test

//production
// mvn spring-boot:run -Dspring-boot.run.profiles=prod
