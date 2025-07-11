package edu.ijse.layered.fx.dao.custom.impl;

import edu.ijse.layered.fx.dao.CrudUtil;
import edu.ijse.layered.fx.dao.custom.ClassesDao;
import edu.ijse.layered.fx.entity.ClassesEntity;

import java.util.ArrayList;

public class ClassesDaoImpl implements ClassesDao {

    @Override
    public boolean save(ClassesEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO class VALUES (?,?,?,?,?)",
                t.getClass_id(),
                t.getCourse_name(),
                t.getSubject_name(),
                t.getLecture_name(),
                t.getLecture_date());
    }

    @Override
    public boolean update(ClassesEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE class SET course_name = ? , subject_name = ? , lecture_name = ? , lecture_date = ? WHERE class_id = ?",
                t.getCourse_name(),
                t.getSubject_name(),
                t.getLecture_name(),
                t.getLecture_date(),
                t.getClass_id());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM class WHERE class_id = ?",id);
    }

    @Override
    public ClassesEntity select(String s) throws Exception {
        return null;
    }

    @Override
    public ArrayList<ClassesEntity> viewAll() throws Exception {
        return null;
    }
}
