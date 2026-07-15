package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppMain {

    public static void main(String[] args) {
        SpringApplication.run(AppMain.class, args);
    }

    @Bean
    CommandLineRunner run(StudentRepository repository) {
        return args -> {
            repository.save(new Student("Shenivi", "Java FSE"));
            repository.save(new Student("Arjun", "Data Science"));

            System.out.println("All students:");
            repository.findAll().forEach(System.out::println);
        };
    }
}