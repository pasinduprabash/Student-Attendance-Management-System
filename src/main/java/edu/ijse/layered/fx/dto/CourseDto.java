package edu.ijse.layered.fx.dto;

public class CourseDto {

    private String course_id;
    private String name;
    private String subjects;

    public CourseDto(){

    }

    public CourseDto(String course_id, String name, String subjects){
        this.course_id = course_id;
        this.name = name;
        this.subjects = subjects;
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

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "CourseDto{" +
                "course_id='" + course_id + '\'' +
                ", name='" + name + '\'' +
                ", subjects='" + subjects + '\'' +
                '}';
    }
}
