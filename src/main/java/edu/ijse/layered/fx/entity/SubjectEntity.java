package edu.ijse.layered.fx.entity;

public class SubjectEntity {
    private String subjectId;
    private String courseId;
    private String name;

    public SubjectEntity() {
    }

    public SubjectEntity(String subjectId, String courseId, String name) {
        this.subjectId = subjectId;
        this.courseId = courseId;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SubjectEntity{" +
                "subjectId='" + subjectId + '\'' +
                ", courseId='" + courseId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
