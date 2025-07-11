package edu.ijse.layered.fx.services;

import edu.ijse.layered.fx.services.custom.impl.ClassesServiceImpl;
import edu.ijse.layered.fx.services.custom.impl.CourseServiceImpl;
import edu.ijse.layered.fx.services.custom.impl.LectureServiceImpl;
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
                return new LectureServiceImpl();
            case COURSE:
                return new CourseServiceImpl();
            case CLASSES:
                return new ClassesServiceImpl();
            default:
                throw new AssertionError();
        }
    }

    public enum ServiceTypes{
        STUDENT,LECTURE,COURSE,CLASSES;
    }
}

