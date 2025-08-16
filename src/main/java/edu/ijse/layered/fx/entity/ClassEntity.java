package edu.ijse.layered.fx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClassEntity {
    private String classId;
    private String subjectId;
    private String courseId;
    private String lectureId;
    private Date date;

}
