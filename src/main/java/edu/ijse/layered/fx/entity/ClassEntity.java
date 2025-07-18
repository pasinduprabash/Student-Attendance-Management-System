package edu.ijse.layered.fx.entity;

import java.util.Date;

public class ClassEntity {
    private String classId;
    private String subjectId;
    private String courseId;
    private String lectureId;
    private Date date;

    public ClassEntity() {
    }

    public ClassEntity(String classId, String subjectId, String courseId, String lectureId, Date date) {
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
        return "ClassEntity{" +
                "classId='" + classId + '\'' +
                ", subjectId='" + subjectId + '\'' +
                ", courseId='" + courseId + '\'' +
                ", lectureId='" + lectureId + '\'' +
                ", date=" + date +
                '}';
    }
}
