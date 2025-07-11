package edu.ijse.layered.fx.services.custom.impl;

import edu.ijse.layered.fx.dao.DaoFactory;
import edu.ijse.layered.fx.dao.custom.StudentDao;
import edu.ijse.layered.fx.dto.StudentDto;
import edu.ijse.layered.fx.entity.StudentEntity;
import edu.ijse.layered.fx.services.custom.StudentService;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao = (StudentDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.STUDENT);

    @Override
    public String addStudent(StudentDto studentDto) throws Exception {
        StudentEntity studentEntity = new StudentEntity(
                studentDto.getReg_number(),
                studentDto.getName(),
                studentDto.getCourse(),
                studentDto.getContact_number());

        return studentDao.save(studentEntity) ? "Student Added Successfully" : "Student Added Failed";
    }

    @Override
    public String updateStudent(StudentDto studentDto) throws Exception {
        StudentEntity studentEntity = new StudentEntity(
                studentDto.getReg_number(),
                studentDto.getName(),
                studentDto.getCourse(),
                studentDto.getContact_number());

        return studentDao.update(studentEntity) ? "Student Updated Successfully" : "Student Updated Failed";
    }

    @Override
    public String deleteStudent(String id) throws Exception {
        return studentDao.delete(id) ? "Student Deleted Successfully" : "Student Deleted Failed";
    }
}
