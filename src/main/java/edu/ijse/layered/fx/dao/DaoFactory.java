package edu.ijse.layered.fx.dao;

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
            default:
                return null;
        }
    }

    public enum DaoTypes{
        STUDENT;
    }

}
