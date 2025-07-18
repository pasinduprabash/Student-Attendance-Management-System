package edu.ijse.layered.fx.services.custom.impl;

import edu.ijse.layered.fx.dao.DaoFactory;
import edu.ijse.layered.fx.dao.custom.ClassDao;
import edu.ijse.layered.fx.dto.ClassDto;
import edu.ijse.layered.fx.entity.ClassEntity;
import edu.ijse.layered.fx.services.custom.ClassService;

public class ClassServiceImpl implements ClassService {

    private ClassDao classDao = (ClassDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CLASSES);

    @Override
    public String addClasses(ClassDto classesDto) throws Exception {

        ClassEntity classesEntity = new ClassEntity(
                classesDto.classId,
                classesDto.courseId,
                classesDto.subjectId,
                classesDto.lectureId,
                classesDto.date);

        return classDao.save(classesEntity) ? "Class Schedule Successfully" : "Class Schedule Failed";
    }

    @Override
    public String updateClasses(ClassDto classesDto) throws Exception {

        ClassEntity classesEntity = new ClassEntity(
                classesDto.classId,
                classesDto.courseId,
                classesDto.subjectId,
                classesDto.lectureId,
                classesDto.date
        );

        return classDao.update(classesEntity) ? "Class Schedule Updated" : "Class Schedule Updated Failed";
    }

    @Override
    public String deleteClasses(String id) throws Exception {
        return classDao.delete(id) ? "Class Deleted" : "Class Deleted Failed";
    }
}
