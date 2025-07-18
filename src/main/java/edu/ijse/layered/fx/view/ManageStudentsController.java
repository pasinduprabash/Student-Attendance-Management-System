package edu.ijse.layered.fx.view;

import edu.ijse.layered.fx.controller.StudentsController;
import edu.ijse.layered.fx.dto.StudentDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ManageStudentsController {

    private StudentsController studentsController = new StudentsController();

    @FXML
    private TableColumn<?, ?> colContact;

    @FXML
    private TableColumn<?, ?> colCourse;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private Label contactLabel;

    @FXML
    private TextField contactTxt;

    @FXML
    private Button deleteBtn;

    @FXML
    private TableView<?> detailsTabel;

    @FXML
    private Label idLabel;

    @FXML
    private TextField idTxt;

    @FXML
    private Label nameLabel;

    @FXML
    private TextField nameTxt;

    @FXML
    private Button resetBtn;

    @FXML
    private Button saveBtn;

    @FXML
    private Button updateBtn;

    @FXML
    void clear(ActionEvent event) {
            idTxt.setText("");
            nameTxt.setText("");
            contactTxt.setText("");
    }

    @FXML
    void deleteStudents(ActionEvent event) {

        try {
            String rsp = studentsController.deleteStudent(idTxt.getText());
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
    void saveStudents(ActionEvent event) {

        try {
            StudentDto studentDto = new StudentDto(
                    Integer.parseInt(idTxt.getText()),
                    nameTxt.getText(),
                    contactTxt.getText()
            );

            String rsp = studentsController.addStudent(studentDto);
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
    void updateStudents(ActionEvent event) {

        try {
            StudentDto studentDto = new StudentDto(
                    Integer.parseInt(idTxt.getText()),
                            nameTxt.getText(),
                            contactTxt.getText());

            String rsp = studentsController.updateStudents(studentDto);
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
