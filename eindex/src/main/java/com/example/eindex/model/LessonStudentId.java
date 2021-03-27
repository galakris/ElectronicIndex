package com.example.eindex.model;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class LessonStudentId implements Serializable {

    private Long lessonId;
    private Long studentId;

    public LessonStudentId() {
    }

    public Long getLessonId() {
        return lessonId;
    }

    public void setLessonId(Long lessonId) {
        this.lessonId = lessonId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, lessonId);
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;

        LessonStudentId that = (LessonStudentId) obj;
        return Objects.equals(studentId, that.lessonId) && Objects.equals(lessonId, that.lessonId);
    }
}
