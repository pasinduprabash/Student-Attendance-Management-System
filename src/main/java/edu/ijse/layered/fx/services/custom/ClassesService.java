package edu.ijse.layered.fx.services.custom;

import edu.ijse.layered.fx.dto.ClassesDto;
import edu.ijse.layered.fx.services.SuperService;

public interface ClassesService extends SuperService {

    public String addClasses(ClassesDto classesDto) throws Exception;
    public String updateClasses(ClassesDto classesDto) throws Exception;

}
