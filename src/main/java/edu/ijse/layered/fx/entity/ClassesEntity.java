package edu.ijse.layered.fx.entity;

import java.time.LocalDate;

public class ClassesEntity {

    private String class_id;
    private String course_name;
    private String subject_name;
    private String lecture_name;
    private LocalDate lecture_date;

    public ClassesEntity(){

    }

    public ClassesEntity(String class_id, String course_name, String subject_name, String lecture_name, LocalDate lecture_date){
        this.class_id = class_id;
        this.course_name = course_name;
        this.subject_name = subject_name;
        this.lecture_name = lecture_name;
        this.lecture_date = lecture_date;
    }

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public String getLecture_name() {
        return lecture_name;
    }

    public void setLecture_name(String lecture_name) {
        this.lecture_name = lecture_name;
    }

    public LocalDate getLecture_date() {
        return lecture_date;
    }

    public void setLecture_date(LocalDate lecture_date) {
        this.lecture_date = lecture_date;
    }

    @Override
    public String toString() {
        return "ClassesEntity{" +
                "class_id='" + class_id + '\'' +
                ", course_name='" + course_name + '\'' +
                ", subject_name='" + subject_name + '\'' +
                ", lecture_name='" + lecture_name + '\'' +
                ", lecture_date=" + lecture_date +
                '}';
    }
}
