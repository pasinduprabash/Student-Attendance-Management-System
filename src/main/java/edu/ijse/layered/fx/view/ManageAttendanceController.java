package edu.ijse.layered.fx.view;

import edu.ijse.layered.fx.custom.AttendanceStatus;
import edu.ijse.layered.fx.controller.AttendanceController;
import edu.ijse.layered.fx.dto.AttendanceDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class ManageAttendanceController {

    private final AttendanceController attendanceController = new AttendanceController();

    @FXML
    private Button clearBtn;

    @FXML
    private TextField courseTxt;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextField lectureTxt;

    @FXML
    private Button menuBtn;

    @FXML
    private ComboBox<AttendanceStatus> statusPicker;

    @FXML
    private TextField studentTxt;

    @FXML
    private TextField subjectTxt;

    @FXML
    public void initialize() {
        statusPicker.getItems().setAll(AttendanceStatus.values());
        statusPicker.getSelectionModel().select(AttendanceStatus.Present);
    }

    @FXML
    void Clear(ActionEvent event) {
        lectureTxt.clear();
        studentTxt.clear();
        courseTxt.clear();
        subjectTxt.clear();
        datePicker.setValue(null);
        statusPicker.setValue(null);
    }

    @FXML
    void navigateDelete(ActionEvent event) {
        try {
            if (datePicker.getValue() == null) {
                throw new IllegalArgumentException("Please select a date to delete.");
            }

            String rsp = attendanceController.deleteAttendance(datePicker.getValue().toString());

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText(rsp);
            alert.showAndWait();

        } catch (IllegalArgumentException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.showAndWait();

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }

    @FXML
    void navigateSave(ActionEvent event) {
        try {
            AttendanceDto attendanceDto = new AttendanceDto(
                    datePicker.getValue(),
                    lectureTxt.getText(),
                    studentTxt.getText(),
                    courseTxt.getText(),
                    subjectTxt.getText(),
                    statusPicker.getValue()
            );

            String rsp = attendanceController.saveAttendance(attendanceDto);
            Clear(event);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText(rsp);
            alert.showAndWait();

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }

    @FXML
    void navigateUpdate(ActionEvent event) {
        try {
            AttendanceDto attendanceDto = new AttendanceDto(
                    datePicker.getValue(),
                    lectureTxt.getText(),
                    studentTxt.getText(),
                    courseTxt.getText(),
                    subjectTxt.getText(),
                    statusPicker.getValue()
            );

            String rsp = attendanceController.updateAttendance(attendanceDto);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText(rsp);
            alert.showAndWait();

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }
}
