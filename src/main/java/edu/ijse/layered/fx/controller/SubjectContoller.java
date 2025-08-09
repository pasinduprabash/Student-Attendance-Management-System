package edu.ijse.layered.fx.controller;

import edu.ijse.layered.fx.dto.SubjectDto;
import edu.ijse.layered.fx.services.ServiceFactory;
import edu.ijse.layered.fx.services.custom.SubjectService;

public class SubjectContoller {

    private SubjectService subjectService = (SubjectService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.SUBJECT);

    public String addSubject(SubjectDto subjectDto) throws Exception{
        return subjectService.addSubject(subjectDto);
    }

    public String updateSubject(SubjectDto subjectDto) throws Exception{
        return subjectService.updateSubject(subjectDto);
    }

    public String deleteSubject(String id) throws Exception{
        return subjectService.deleteSubject(id);
    }

    public SubjectDto searchSubject(String id) throws Exception{
        return subjectService.searchSubject(id);
    }

}
