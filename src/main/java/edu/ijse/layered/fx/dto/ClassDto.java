package edu.ijse.layered.fx.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

public class ClassDto {
    public String classId;
    public String subjectId;
    public String courseId;
    public String lectureId;
    public Date date;

    public ClassDto(String text, String courseTxtText, String subjectTxtText, String lectureTxtText, LocalDate value) {

    }

    public ClassDto(String classId, String subjectId, String courseId, String lectureId, Date date) {
        this.classId = classId;
        this.subjectId = subjectId;
        this.courseId = courseId;
        this.lectureId = lectureId;
        this.date = date;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getLectureId() {
        return lectureId;
    }

    public void setLectureId(String lectureId) {
        this.lectureId = lectureId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ClassDto{" +
                "classId='" + classId + '\'' +
                ", subjectId='" + subjectId + '\'' +
                ", courseId='" + courseId + '\'' +
                ", lectureId='" + lectureId + '\'' +
                ", date=" + date +
                '}';
    }
}

