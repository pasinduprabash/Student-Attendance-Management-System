package edu.ijse.layered.fx.dto;

public class LecturerDto {
    public String lectureId;
    public String name;
    public String contactDetails;

    public LecturerDto(){

    }

    public LecturerDto(String lectureId, String name, String contactDetails) {
        this.lectureId = lectureId;
        this.name = name;
        this.contactDetails = contactDetails;
    }

    public String getLectureId() {
        return lectureId;
    }

    public void setLectureId(String lectureId) {
        this.lectureId = lectureId;
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
        return "LectureDto{" +
                "lectureId='" + lectureId + '\'' +
                ", name='" + name + '\'' +
                ", contactDetails='" + contactDetails + '\'' +
                '}';
    }
}

