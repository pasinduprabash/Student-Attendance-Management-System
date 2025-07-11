package edu.ijse.layered.fx.controller;

import edu.ijse.layered.fx.dto.CourseDto;
import edu.ijse.layered.fx.services.ServiceFactory;
import edu.ijse.layered.fx.services.custom.CourseService;

public class CourseController {

    private CourseService courseservice = (CourseService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.COURSE);

    public String addCourse(CourseDto courseDto) throws Exception{
        return courseservice.addCourse(courseDto);
    }

    public String updateCourse(CourseDto courseDto) throws Exception{
        return courseservice.updateCourse(courseDto);
    }

}
