package edu.ijse.layered.fx.dto;

public class StudentDto {
    private int regNum;
    private String name;
    private String contactDetails;

    public StudentDto() {
    }

    public StudentDto(int regNum, String name, String contactDetails) {
        this.regNum = regNum;
        this.name = name;
        this.contactDetails = contactDetails;
    }

    public int getRegNum() {
        return regNum;
    }

    public void setRegNum(int regNum) {
        this.regNum = regNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "regNum=" + regNum +
                ", name='" + name + '\'' +
                ", contactDetails='" + contactDetails + '\'' +
                '}';
    }
}
