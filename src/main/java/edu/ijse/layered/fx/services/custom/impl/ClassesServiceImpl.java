package edu.ijse.layered.fx.services.custom.impl;

import edu.ijse.layered.fx.dao.DaoFactory;
import edu.ijse.layered.fx.dao.custom.ClassesDao;
import edu.ijse.layered.fx.dto.ClassesDto;
import edu.ijse.layered.fx.entity.ClassesEntity;
import edu.ijse.layered.fx.services.custom.ClassesService;

public class ClassesServiceImpl implements ClassesService {

    private ClassesDao classesDao = (ClassesDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CLASSES);

    @Override
    public String addClasses(ClassesDto classesDto) throws Exception {

        ClassesEntity classesEntity = new ClassesEntity(
                classesDto.getClass_id(),
                classesDto.getCourse_name(),
                classesDto.getSubject_name(),
                classesDto.getLecture_name(),
                classesDto.getLecture_date());

        return classesDao.save(classesEntity) ? "Class Schedule Successfully" : "Class Schedule Failed";
    }

    @Override
    public String updateClasses(ClassesDto classesDto) throws Exception {

        ClassesEntity classesEntity = new ClassesEntity(
                classesDto.getClass_id(),
                classesDto.getCourse_name(),
                classesDto.getSubject_name(),
                classesDto.getLecture_name(),
                classesDto.getLecture_date()
        );

        return classesDao.update(classesEntity) ? "Class Schedule Updated" : "Class Schedule Updated Failed";
    }
}
