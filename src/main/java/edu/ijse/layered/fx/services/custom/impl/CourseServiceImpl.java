package edu.ijse.layered.fx.services.custom.impl;

import edu.ijse.layered.fx.dao.DaoFactory;
import edu.ijse.layered.fx.dao.custom.CourseDao;
import edu.ijse.layered.fx.dto.CourseDto;
import edu.ijse.layered.fx.entity.CourseEntity;
import edu.ijse.layered.fx.services.custom.CourseService;

public class CourseServiceImpl implements CourseService {

    private CourseDao courseDao = (CourseDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.COURSE);

    @Override
    public String addCourse(CourseDto courseDto) throws Exception {

        CourseEntity courseEntity = new CourseEntity(
                courseDto.getCourse_id(),
                courseDto.getName(),
                courseDto.getSubjects()
        );

        return courseDao.save(courseEntity) ? "Course Added Successfully" : "Course Added Failed";
    }

    @Override
    public String updateCourse(CourseDto courseDto) throws Exception {

        CourseEntity courseEntity = new CourseEntity(
                courseDto.getCourse_id(),
                courseDto.getName(),
                courseDto.getSubjects()
        );

        return courseDao.update(courseEntity) ? "Course Updated Successfully" : "Course Updated Failed";
    }
}
