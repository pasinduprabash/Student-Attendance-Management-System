package edu.ijse.layered.fx.view;

import edu.ijse.layered.fx.controller.CourseController;
import edu.ijse.layered.fx.dto.CourseDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ManageCoursesController {

    private CourseController courseController = new CourseController();
    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colSubjects;

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
    private Label subjectsLabel;

    @FXML
    private TextArea subjectsTxt;

    @FXML
    private Button updateBtn;

    @FXML
    void clear(ActionEvent event) {
            idTxt.setText("");
            nameTxt.setText("");
            subjectsTxt.setText("");
    }

    @FXML
    void saveCourse(ActionEvent event) {

        try {
            CourseDto courseDto = new CourseDto(
                    idTxt.getText(),
                    nameTxt.getText(),
                    subjectsTxt.getText()
            );

            String rsp = courseController.addCourse(courseDto);
            clear(event);
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
    void updateCourse(ActionEvent event) {

        try {
            CourseDto courseDto = new CourseDto(
              idTxt.getText(),
              nameTxt.getText(),
              subjectsTxt.getText()
            );

            String rsp = courseController.updateCourse(courseDto);
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
