package edu.ijse.layered.fx.dto;

public class EnrollDto {
    public int regNum;
    public String courseId;

    public EnrollDto(){

    }

    public EnrollDto(int regNum, String courseId) {
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
        return "EnrollDto{" +
                "regNum=" + regNum +
                ", courseId='" + courseId + '\'' +
                '}';
    }
}

