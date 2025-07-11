package edu.ijse.layered.fx.dao.custom.impl;

import edu.ijse.layered.fx.dao.CrudUtil;
import edu.ijse.layered.fx.dao.custom.LectureDao;
import edu.ijse.layered.fx.entity.LectureEntity;

import java.util.ArrayList;

public class LectureDaoImpl implements LectureDao {

    @Override
    public boolean save(LectureEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO lecture VALUES(?,?,?,?)",
                t.getLecture_id(),
                t.getName(),
                t.getContact_number(),
                t.getAssigned_subjects());
    }

    @Override
    public boolean update(LectureEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE lecture SET name = ?, contact_no = ?, assigned_sub = ? WHERE lecture_id = ?",
                t.getName(),
                t.getContact_number(),
                t.getAssigned_subjects(),
                t.getLecture_id());
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public LectureEntity select(String s) throws Exception {
        return null;
    }

    @Override
    public ArrayList<LectureEntity> viewAll() throws Exception {
        return null;
    }
}
