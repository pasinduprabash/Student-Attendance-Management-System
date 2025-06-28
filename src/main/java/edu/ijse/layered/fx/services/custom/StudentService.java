package edu.ijse.layered.fx.services.custom;

import edu.ijse.layered.fx.dto.StudentDto;
import edu.ijse.layered.fx.services.SuperService;

public interface StudentService extends SuperService {

    public String addStudent(StudentDto studentDto) throws Exception;
    public String updateStudent(StudentDto studentDto) throws Exception;

}
