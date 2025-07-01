package edu.ijse.layered.fx.services;

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
                return null;
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

