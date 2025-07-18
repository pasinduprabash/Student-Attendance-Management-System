package edu.ijse.layered.fx.view;

import edu.ijse.layered.fx.controller.ClassController;
import edu.ijse.layered.fx.dto.ClassDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ManageClassesController {

    private ClassController classesController = new ClassController();

    @FXML
    private TextField courseTxt;

    @FXML
    private Label dateLabel;

    @FXML
    private DatePicker dateTxt;

    @FXML
    private Button deleteBtn;

    @FXML
    private Label idLabel;

    @FXML
    private TextField idTxt;

    @FXML
    private Label lecLabel;

    @FXML
    private TextField lectureTxt;

    @FXML
    private Label nameLabel;

    @FXML
    private Button resetBtn;

    @FXML
    private Button saveBtn;

    @FXML
    private Label subLabel;

    @FXML
    private TextField subjectTxt;

    @FXML
    private Button updateBtn;

    @FXML
    void clear(ActionEvent event) {
        idTxt.setText("");
        courseTxt.setText("");
        subjectTxt.setText("");
        lectureTxt.setText("");
        dateTxt.setValue(null);
    }

    @FXML
    void saveClasses(ActionEvent event) {
        try {

            ClassDto classesDto = new ClassDto(
                    idTxt.getText(),
                    courseTxt.getText(),
                    subjectTxt.getText(),
                    lectureTxt.getText(),
                    dateTxt.getValue()
            );

            String rsp = classesController.addClasses(classesDto);
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
    void updateClasses(ActionEvent event) {
        try{
            ClassDto classesDto = new ClassDto(
                    idTxt.getText(),
                    courseTxt.getText(),
                    subjectTxt.getText(),
                    lectureTxt.getText(),
                    dateTxt.getValue()
            );
            String rsp = classesController.updateClasses(classesDto);
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

    public void deleteClasses(ActionEvent event) {
        try {
            String rsp = classesController.deleteClasses(idTxt.getText());
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
