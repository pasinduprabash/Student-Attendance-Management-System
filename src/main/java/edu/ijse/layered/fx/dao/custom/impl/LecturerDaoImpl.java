package edu.ijse.layered.fx.dao.custom.impl;

import edu.ijse.layered.fx.dao.CrudUtil;
import edu.ijse.layered.fx.dao.custom.LecturerDao;
import edu.ijse.layered.fx.entity.LecturerEntity;

import java.util.ArrayList;

public class LecturerDaoImpl implements LecturerDao {

    @Override
    public boolean save(LecturerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO lecture VALUES(?,?,?)",
                t.getLectureId(),
                t.getName(),
                t.getContactDetails());
    }

    @Override
    public boolean update(LecturerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE lecture SET name = ?, contact_details = ? WHERE lecture_id = ?",
                t.getName(),
                t.getContactDetails(),
                t.getLectureId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM lecture WHERE lecture_id = ?",id);
    }

    @Override
    public LecturerEntity select(String s) throws Exception {
        return null;
    }

    @Override
    public ArrayList<LecturerEntity> viewAll() throws Exception {
        return null;
    }
}
