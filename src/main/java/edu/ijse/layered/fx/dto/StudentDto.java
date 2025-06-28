package edu.ijse.layered.fx.dto;

public class StudentDto {

    private int reg_number;
    private String name;
    private String course;
    private int contact_number;

    public StudentDto(){

    }

    public StudentDto(int reg_number,String name,String course, int contact_number){
        this.reg_number = reg_number;
        this.name = name;
        this.contact_number = contact_number;
        this.course = course;
    }

    public int getReg_number() {
        return reg_number;
    }

    public void setReg_number(int reg_number) {
        this.reg_number = reg_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getContact_number() {
        return contact_number;
    }

    public void setContact_number(int contact_number) {
        this.contact_number = contact_number;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "reg_number=" + reg_number +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", contact_number=" + contact_number +
                '}';
    }
}


