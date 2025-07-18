package edu.ijse.layered.fx.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ManageSubjectsController {

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

    }

    @FXML
    void deleteSubjects(ActionEvent event) {

    }

    @FXML
    void saveSubjects(ActionEvent event) {

    }

    @FXML
    void updateSubjects(ActionEvent event) {

    }

}
