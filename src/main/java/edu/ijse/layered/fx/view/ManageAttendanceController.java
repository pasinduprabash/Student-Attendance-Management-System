package edu.ijse.layered.fx.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ManageAttendanceController {

    @FXML
    private Label attendanceLabel;

    @FXML
    private Label classLabel;

    @FXML
    private ChoiceBox<?> classPicker;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colPresent;

    @FXML
    private TableColumn<?, ?> colRegNo;

    @FXML
    private Label dateLabel;

    @FXML
    private DatePicker datePicker;

    @FXML
    private Button loadBtn;

    @FXML
    private Button submitBtn;

    @FXML
    private TableView<?> tblAttendance;

    @FXML
    void loadStudents(ActionEvent event) {

    }

    @FXML
    void submitAttendance(ActionEvent event) {

    }

}
