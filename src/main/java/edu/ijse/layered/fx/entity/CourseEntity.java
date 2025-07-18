package edu.ijse.layered.fx.entity;

public class CourseEntity {
    private String courseId;
    private String name;

    public CourseEntity() {
    }

    public CourseEntity(String courseId, String name) {
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
        return "CourseEntity{" +
                "courseId='" + courseId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
