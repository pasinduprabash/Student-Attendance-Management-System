package edu.ijse.layered.fx.services.custom.impl;

import edu.ijse.layered.fx.dao.DaoFactory;
import edu.ijse.layered.fx.dao.custom.EnrollDao;
import edu.ijse.layered.fx.dto.EnrollDto;
import edu.ijse.layered.fx.entity.EnrollEntity;
import edu.ijse.layered.fx.services.custom.EnrollService;

public class EnrollServiceImpl implements EnrollService {

    private EnrollDao enrollDao = (EnrollDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ENROLL);

    @Override
    public String addEnroll(EnrollDto enrollDto) throws Exception {

        EnrollEntity enrollEntity = new EnrollEntity(
                enrollDto.regNum,
                enrollDto.courseId
        );

        return enrollDao.save(enrollEntity) ? "Enroll Added" : "Enroll Failed";
    }

    @Override
    public String updateEnroll(EnrollDto enrollDto) throws Exception {
        return "";
    }

    @Override
    public String deleteEnroll(EnrollDto enrollDto) throws Exception {
        return "";
    }
}
