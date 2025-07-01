package edu.ijse.layered.fx.dao;

import edu.ijse.layered.fx.dao.custom.impl.CourseDaoImpl;
import edu.ijse.layered.fx.dao.custom.impl.LectureDaoImpl;
import edu.ijse.layered.fx.dao.custom.impl.StudentDaoImpl;

public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory(){}

    public static DaoFactory getInstance(){
        if(daoFactory == null){
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDao getDao(DaoTypes type){
        switch (type) {
            case STUDENT:
                return new StudentDaoImpl();
            case LECTURE:
                return new LectureDaoImpl();
            case COURSE:
                return new CourseDaoImpl();
            default:
                return null;
        }
    }

    public enum DaoTypes{
        STUDENT,LECTURE,COURSE;
    }

}
