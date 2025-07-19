package edu.ijse.layered.fx.services.custom;

import edu.ijse.layered.fx.dto.EnrollDto;
import edu.ijse.layered.fx.services.SuperService;

public interface EnrollService extends SuperService {

    public String addEnroll(EnrollDto enrollDto) throws Exception;
    public String updateEnroll(EnrollDto enrollDto) throws Exception;
    public String deleteEnroll(EnrollDto enrollDto) throws Exception;

}
