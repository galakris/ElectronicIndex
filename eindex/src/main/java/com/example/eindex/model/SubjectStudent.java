package com.example.eindex.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class SubjectStudent {

    @EmbeddedId
    private SubjectStudentId id;
    private LocalDate start;
    private int semester;
    private int deficit;
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("subjectId")
    @JsonManagedReference
    @JsonIgnore
    private Subject subject;
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("studentId")
    @JsonManagedReference
    @JsonIgnore
    private Student student;

    public SubjectStudent() {
    }

    public SubjectStudentId getId() {
        return id;
    }

    public void setId(SubjectStudentId id) {
        this.id = id;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getDeficit() {
        return deficit;
    }

    public void setDeficit(int deficit) {
        this.deficit = deficit;
    }
}
