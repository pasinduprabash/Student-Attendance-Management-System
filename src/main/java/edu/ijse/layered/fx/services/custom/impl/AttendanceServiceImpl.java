package edu.ijse.layered.fx.services.custom.impl;

import edu.ijse.layered.fx.dao.CrudUtil;
import edu.ijse.layered.fx.dao.DaoFactory;
import edu.ijse.layered.fx.dao.custom.AttendanceDao;
import edu.ijse.layered.fx.dto.AttendanceDto;
import edu.ijse.layered.fx.entity.AttendanceEntity;
import edu.ijse.layered.fx.services.SuperService;
import edu.ijse.layered.fx.services.custom.AttendanceService;

public class AttendanceServiceImpl implements AttendanceService, SuperService {

    private AttendanceDao attendanceDao = (AttendanceDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ATTENDANCE);

    @Override
    public String saveAttendance(AttendanceDto attendanceDto) throws Exception {
        AttendanceEntity attendanceEntity = new AttendanceEntity(
                attendanceDto.getDate(),
                attendanceDto.getLecture_id(),
                attendanceDto.getStudent_name(),
                attendanceDto.getCourse_name(),
                attendanceDto.getSubject_name(),
                attendanceDto.getStatus()
        );
        return attendanceDao.save(attendanceEntity) ? "Attendance Saved" : "Attendance Save Failed";
    }

    @Override
    public String updateAttendance(AttendanceDto attendanceDto) throws Exception {
        AttendanceEntity attendanceEntity = new AttendanceEntity(
                attendanceDto.getDate(),
                attendanceDto.getLecture_id(),
                attendanceDto.getStudent_name(),
                attendanceDto.getCourse_name(),
                attendanceDto.getSubject_name(),
                attendanceDto.getStatus()
        );
        return attendanceDao.update(attendanceEntity) ? "Attendance Updated Successfully" : "Attendance Update Failed";
    }

    @Override
    public String deleteAttendance(String date) throws Exception {
        return attendanceDao.delete(date) ? "Attendance Deleted Successfully" : "Attendance Delete Failed";
    }
}
