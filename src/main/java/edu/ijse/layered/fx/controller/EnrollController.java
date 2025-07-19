package edu.ijse.layered.fx.controller;

import edu.ijse.layered.fx.dto.EnrollDto;
import edu.ijse.layered.fx.services.ServiceFactory;
import edu.ijse.layered.fx.services.custom.EnrollService;

public class EnrollController {

    private EnrollService enrollservice = (EnrollService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.ENROLL);

    public String addEnroll(EnrollDto enrollDto) throws Exception{
        return enrollservice.addEnroll(enrollDto);
    }

}
