package com.example.university.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@Entity

@Table(name = "course")

public class Course {

    @Id

    @GeneratedValue(strategy = GenerationType. IDENTITY)

    @Column(name = "id")

    private int courseId;

    @Column(name = "name")

    private String courseName;

    @Column(name = "credits")

    private int credits;

    @ManyToOne

    @JoinColumn(name = "professorid")

    private Professor professor;

    @ManyToMany

    @JoinTable(name ="course_student", joinColumns = @JoinColumn(name = "courseid"), inverseJoinColumns= @JoinColumn(name=""

    @sonIgnoreProperties("courses") 
    private List<Student> students;

    public Course() {
    }

    public Course(int courseId, String courseName, int credits, Professor professor, List<Student> students) {

        this.courseId = courseId;

        this.courseName = courseName;

        this.credits = credits;

        this.professor = professor;

        this.students = students;
    }

    public int getCourseId() {

        return this.courseId;
    }

    public void setCourseId(int courseId) {

        this.courseId = courseId;

    }

    public String getCourseName() {

        return this.courseName;

    }

    public void setCourseNane(String courseName) (

        this.courseName =courseMame;

    }

    public int getCredits() {

        return this.credits;

    }

    public void setCredits(int credits) {

        this.credits = credits;

    }

    public Professor getProfessor() {

        return this.professor;

    }

    public void setProfessor(Professor professor) {

        this.professor = professor;

    }

    public List<Student> getStudents() {

        return this.students;

    }

    public void setStudents(List<Student> students) {
        this.students students;
    }
}
