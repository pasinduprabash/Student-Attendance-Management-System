package edu.ijse.layered.fx.view;

import edu.ijse.layered.fx.controller.EnrollController;
import edu.ijse.layered.fx.dto.EnrollDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ManageEnrollmentController {

    final private EnrollController enrollController = new EnrollController();

    @FXML
    private TableColumn<?, ?> colCourseId;

    @FXML
    private TableColumn<?, ?> colRegNum;

    @FXML
    private Button deleteBtn;

    @FXML
    private TableView<?> detailsTable;

    @FXML
    private Label idLabel;

    @FXML
    private TextField idTxt;

    @FXML
    private Label regLabel;

    @FXML
    private TextField regTxt;

    @FXML
    private Button resetBtn;

    @FXML
    private Button saveBtn;

    @FXML
    private Button updateBtn;

    @FXML
    void saveEnrollment(ActionEvent event) {
        try {
            EnrollDto enrollDto = new EnrollDto(
                    Integer.parseInt(regTxt.getText()),
                    idTxt.getText()
            );

            String rsp = enrollController.addEnroll(enrollDto);
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
