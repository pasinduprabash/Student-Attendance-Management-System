package edu.ijse.layered.fx.dto;

public class SubjectDto {
    public String subjectId;
    public String courseId;
    public String name;

    public SubjectDto(String subjectId, String courseId, String name) {
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
        return "SubjectDto{" +
                "subjectId='" + subjectId + '\'' +
                ", courseId='" + courseId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

