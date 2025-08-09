package edu.ijse.layered.fx.services.custom;

import edu.ijse.layered.fx.dto.AttendanceDto;

public interface AttendanceService {

    public String saveAttendance(AttendanceDto attendanceDto) throws Exception;
    public String updateAttendance(AttendanceDto attendanceDto) throws Exception;
    public String deleteAttendance(String date) throws Exception;
}
