package edu.ijse.layered.fx.dto;

public class LecturerDto {

    private String lecture_id;
    private String name;
    private int contact_number;
    private String assigned_subects;

    public LecturerDto() {

    }

    public LecturerDto (String lecture_id, String name, int contact_number, String assigned_subects) {
        this.lecture_id = lecture_id;
        this.name = name;
        this.contact_number = contact_number;
        this.assigned_subects = assigned_subects;
    }

    public String getLecture_id() {
        return lecture_id;
    }

    public void setLecture_id(String lecture_id) {
        this.lecture_id = lecture_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContact_number() {
        return contact_number;
    }

    public void setContact_number(int contact_number) {
        this.contact_number = contact_number;
    }

    public String getAssigned_subects() {
        return assigned_subects;
    }

    public void setAssigned_subects(String assigned_subects) {
        this.assigned_subects = assigned_subects;
    }

    @Override
    public String toString() {
        return "LecturerDto{" +
                "lecture_id='" + lecture_id + '\'' +
                ", name='" + name + '\'' +
                ", contact_number=" + contact_number +
                ", assigned_subects='" + assigned_subects + '\'' +
                '}';
    }
}
