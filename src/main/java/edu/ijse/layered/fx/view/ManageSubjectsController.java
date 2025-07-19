package edu.ijse.layered.fx.view;

import edu.ijse.layered.fx.controller.SubjectContoller;
import edu.ijse.layered.fx.dto.SubjectDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ManageSubjectsController {

    private SubjectContoller subjectContoller = new SubjectContoller();

    @FXML
    private Label courseLabel;

    @FXML
    private TextField courseTxt;

    @FXML
    private TableColumn<?, ?> course_id;

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
    private TableColumn<?, ?> subject_id;

    @FXML
    private TableColumn<?, ?> subject_name;

    @FXML
    private Button updateBtn;

    @FXML
    void clear(ActionEvent event) {
        idTxt.setText("");
        nameTxt.setText("");
        courseTxt.setText("");
    }

    @FXML
    void deleteSubjects(ActionEvent event) {

            try {
                String rsp = subjectContoller.deleteSubject(idTxt.getText());
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
    void saveSubjects(ActionEvent event) {
        try {
            SubjectDto subjectDto = new SubjectDto(
                    idTxt.getText(),
                    nameTxt.getText(),
                    courseTxt.getText()
            );

            String rsp = subjectContoller.addSubject(subjectDto);
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
    void updateSubjects(ActionEvent event) {

        try {
            SubjectDto subjectDto = new SubjectDto(
                    idTxt.getText(),
                    nameTxt.getText(),
                    courseTxt.getText()
            );

            String rsp = subjectContoller.updateSubject(subjectDto);
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
