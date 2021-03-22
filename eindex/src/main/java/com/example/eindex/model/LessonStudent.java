package com.example.eindex.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class LessonStudent {

    @EmbeddedId
    private LessonStudentId id;
    private float mark;

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
}
