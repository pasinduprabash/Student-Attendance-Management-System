package edu.ijse.layered.fx.services.custom.impl;

import edu.ijse.layered.fx.dao.DaoFactory;
import edu.ijse.layered.fx.dao.custom.LectureDao;
import edu.ijse.layered.fx.dto.LecturerDto;
import edu.ijse.layered.fx.entity.LectureEntity;
import edu.ijse.layered.fx.services.custom.LectureService;

public class LectureServiceImpl implements LectureService {

    private LectureDao lectureDao = (LectureDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.LECTURE);

    @Override
    public String addLecture(LecturerDto lecturerDto) throws Exception {
        LectureEntity lectureEntity = new LectureEntity(
                lecturerDto.getLecture_id(),
                lecturerDto.getName(),
                lecturerDto.getContact_number(),
                lecturerDto.getAssigned_subects());

        return lectureDao.save(lectureEntity) ? "Lecture Inserted Successfully" : "Lecture Inserted Failed";
    }

    @Override
    public String updateLecture(LecturerDto lecturerDto) throws Exception {
        LectureEntity lectureEntity = new LectureEntity(
                lecturerDto.getLecture_id(),
                lecturerDto.getName(),
                lecturerDto.getContact_number(),
                lecturerDto.getAssigned_subects());

        return lectureDao.update(lectureEntity) ? "Lecture Updated Successfully":"Lecture Updated Failed";
    }

    @Override
    public String deleteLecture(String id) throws Exception{
        return lectureDao.delete(id) ? "Lecture Deleted Successfully" : "Lecture Deleted Failed";
    }
}
