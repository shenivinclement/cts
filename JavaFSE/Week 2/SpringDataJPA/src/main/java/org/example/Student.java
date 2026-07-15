package org.example;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String course;

    public Student() {}

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getCourse() { return course; }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', course='" + course + "'}";
    }
}