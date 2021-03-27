package com.example.eindex.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
public class LessonStudent {

    @EmbeddedId
    private LessonStudentId id;
    private float mark;
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("studentId")
    @JsonManagedReference
    @JsonIgnore
    private Student student;
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("lessonId")
    @JsonManagedReference
    @JsonIgnore
    private Lesson lesson;

    public LessonStudent() {
    }

    public LessonStudentId getId() {
        return id;
    }

    public void setId(LessonStudentId id) {
        this.id = id;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
}
