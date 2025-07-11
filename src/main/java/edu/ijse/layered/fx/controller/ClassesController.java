package edu.ijse.layered.fx.controller;

import edu.ijse.layered.fx.dto.ClassesDto;
import edu.ijse.layered.fx.services.ServiceFactory;
import edu.ijse.layered.fx.services.custom.ClassesService;

public class ClassesController {

    private ClassesService classesService = (ClassesService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.CLASSES);

    public String addClasses(ClassesDto classesDto) throws Exception{
        return classesService.addClasses(classesDto);
    }

    public String updateClasses(ClassesDto classesDto) throws Exception{
        return classesService.updateClasses(classesDto);
    }
}
