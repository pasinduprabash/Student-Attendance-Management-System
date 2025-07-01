package edu.ijse.layered.fx.entity;

public class CourseEntity {

    private String course_id;
    private String name;
    private String subects;

    public CourseEntity(){

    }

    public CourseEntity(String course_id,String name, String subjects){
        this.course_id = course_id;
        this.name = name;
        this.subects = subjects;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubects() {
        return subects;
    }

    public void setSubects(String subects) {
        this.subects = subects;
    }

    @Override
    public String toString() {
        return "CourseEntity{" +
                "course_id='" + course_id + '\'' +
                ", name='" + name + '\'' +
                ", subects='" + subects + '\'' +
                '}';
    }
}
