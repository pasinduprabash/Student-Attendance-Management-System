package edu.ijse.layered.fx.services;

import edu.ijse.layered.fx.services.custom.impl.StudentServiceImpl;

public class ServiceFactory {
    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }

    public SuperService getService(ServiceTypes type){
        switch (type) {
            case STUDENT:
                return new StudentServiceImpl();
            case LECTURE:
                return null;
            default:
                throw new AssertionError();
        }
    }

    public enum ServiceTypes{
        STUDENT,LECTURE;
    }
}

