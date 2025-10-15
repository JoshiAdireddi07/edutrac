package com.edutrack.model;

import jakarta.persistence.*;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String rollNo;
    private String studentClass;
    private int marks;
    private int attendance;

    public Student() {}
    public Student(String name, String rollNo, String studentClass, int marks, int attendance){
        this.name = name;
        this.rollNo = rollNo;
        this.studentClass = studentClass;
        this.marks = marks;
        this.attendance = attendance;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getRollNo() { return rollNo; }
    public String getStudentClass() { return studentClass; }
    public int getMarks() { return marks; }
    public int getAttendance() { return attendance; }
}
