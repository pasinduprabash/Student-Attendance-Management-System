package edu.ijse.layered.fx.dto;

public class CourseDto {
    public String courseId;
    public String name;

    public CourseDto() {

    }

    public CourseDto(String courseId, String name) {
        this.courseId = courseId;
        this.name = name;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CourseDto{" +
                "courseId='" + courseId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

