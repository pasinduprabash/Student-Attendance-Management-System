package edu.ijse.layered.fx.entity;

public class LectureEntity {

    private String lecture_id;
    private String name;
    private int contact_number;
    private String assigned_subjects;

    public LectureEntity(){

    }

    public LectureEntity(String lecture_id, String name, int contact_number, String assigned_subjects){
        this.lecture_id = lecture_id;
        this.name = name;
        this.contact_number = contact_number;
        this.assigned_subjects = assigned_subjects;
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

    public String getAssigned_subjects() {
        return assigned_subjects;
    }

    public void setAssigned_subjects(String assigned_subjects) {
        this.assigned_subjects = assigned_subjects;
    }

    @Override
    public String toString() {
        return "LectureEntity{" +
                "lecture_id='" + lecture_id + '\'' +
                ", name='" + name + '\'' +
                ", contact_number=" + contact_number +
                ", assigned_subjects='" + assigned_subjects + '\'' +
                '}';
    }
}
