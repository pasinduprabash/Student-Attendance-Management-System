package edu.ijse.layered.fx.dao.custom.impl;

import edu.ijse.layered.fx.dao.CrudUtil;
import edu.ijse.layered.fx.dao.custom.EnrollDao;
import edu.ijse.layered.fx.entity.EnrollEntity;

import java.util.ArrayList;

public class EnrollDaoImpl implements EnrollDao {

    @Override
    public boolean save(EnrollEntity t) throws Exception{
        return CrudUtil.executeUpdate("INSERT INTO enroll VALUES(?,?)",
                t.getRegNum(),
                t.getRegNum());
    }

    @Override
    public boolean update(EnrollEntity t) throws Exception{
        return false;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public EnrollEntity select(String s) throws Exception {
        return null;
    }

    @Override
    public ArrayList<EnrollEntity> viewAll() throws Exception {
        return null;
    }
}
