package com.example.eindex.model;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;


//https://vladmihalcea.com/the-best-way-to-map-a-many-to-many-association-with-extra-columns-when-using-jpa-and-hibernate/
@Embeddable
public class SubjectStudentId implements Serializable {

    private Long subjectId;
    private Long studentId;

    public SubjectStudentId() {
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, subjectId);
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;

        SubjectStudentId that = (SubjectStudentId) obj;

        return Objects.equals(studentId, that.studentId) && Objects.equals(subjectId, that.subjectId);
    }
}
