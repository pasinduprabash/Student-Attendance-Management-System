package edu.ijse.layered.fx.dao.custom.impl;

import edu.ijse.layered.fx.dao.CrudUtil;
import edu.ijse.layered.fx.dao.custom.AttendanceDao;
import edu.ijse.layered.fx.entity.AttendanceEntity;

import java.util.ArrayList;

public class AttendanceDaoImpl implements AttendanceDao {

    @Override
    public boolean save(AttendanceEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO attendance VALUES (?,?,?,?,?,?)",
                t.getDate(),
                t.getLecture_id(),
                t.getStudent_name(),
                t.getCourse_name(),
                t.getSubject_name(),
                t.getStatus().name());
    }

    @Override
    public boolean update(AttendanceEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE attendance SET lecture_id = ? , student_name = ? , course_name = ? , subject_name = ? , status = ? WHERE date = ?",
                t.getLecture_id(),
                t.getStudent_name(),
                t.getCourse_name(),
                t.getSubject_name(),
                t.getStatus().name(),
                t.getDate());
    }

    @Override
    public boolean delete(String date) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM attendance WHERE date = ?");
    }

    @Override
    public AttendanceEntity select(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<AttendanceEntity> viewAll() throws Exception {
        return null;
    }
}
