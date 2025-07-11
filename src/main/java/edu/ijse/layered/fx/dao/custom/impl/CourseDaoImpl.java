package edu.ijse.layered.fx.dao.custom.impl;

import edu.ijse.layered.fx.dao.CrudUtil;
import edu.ijse.layered.fx.dao.custom.CourseDao;
import edu.ijse.layered.fx.entity.CourseEntity;

import java.util.ArrayList;

public class CourseDaoImpl implements CourseDao {

    @Override
    public boolean save(CourseEntity t) throws Exception{
        return CrudUtil.executeUpdate("INSERT INTO course VALUES(?,?,?)",
                t.getCourse_id(),
                t.getName(),
                t.getSubects());
    }

    @Override
    public boolean update(CourseEntity t) throws Exception{
        return CrudUtil.executeUpdate("UPDATE course SET name = ?, subjects = ? WHERE course_id = ?",
                t.getName(),
                t.getSubects(),
                t.getCourse_id());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM course WHERE course_id = ?",id);
    }

    @Override
    public CourseEntity select(String s) throws Exception {
        return null;
    }

    @Override
    public ArrayList<CourseEntity> viewAll() throws Exception {
        return null;
    }


}
