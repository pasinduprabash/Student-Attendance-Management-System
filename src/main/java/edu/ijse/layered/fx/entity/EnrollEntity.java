package edu.ijse.layered.fx.entity;

public class EnrollEntity {
    private int regNum;
    private String courseId;

    public EnrollEntity() {
    }

    public EnrollEntity(int regNum, String courseId) {
        this.regNum = regNum;
        this.courseId = courseId;
    }

    public int getRegNum() {
        return regNum;
    }

    public void setRegNum(int regNum) {
        this.regNum = regNum;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "EnrollEntity{" +
                "regNum=" + regNum +
                ", courseId='" + courseId + '\'' +
                '}';
    }
}

