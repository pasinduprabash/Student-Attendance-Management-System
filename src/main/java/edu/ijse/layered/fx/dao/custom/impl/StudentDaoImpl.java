package edu.ijse.layered.fx.dao.custom.impl;

import edu.ijse.layered.fx.dao.CrudUtil;
import edu.ijse.layered.fx.dao.custom.StudentDao;
import edu.ijse.layered.fx.entity.StudentEntity;

import java.util.ArrayList;

public class StudentDaoImpl implements StudentDao {

    public boolean save(StudentEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO student VALUES (?,?,?,?)",
                t.getReg_number(),
                t.getName(),
                t.getCourse(),
                t.getContact_number());
    }

    public boolean update(StudentEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE student SET name = ? , course = ? , contact_no = ? WHERE reg_number = ?",
                t.getName(),
                t.getCourse(),
                t.getContact_number(),
                t.getReg_number());
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public StudentEntity select(String s) throws Exception {
        return null;
    }

    @Override
    public ArrayList<StudentEntity> viewAll() throws Exception {
        return null;
    }

}
