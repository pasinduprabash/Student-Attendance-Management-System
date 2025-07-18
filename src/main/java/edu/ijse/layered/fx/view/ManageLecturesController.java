package edu.ijse.layered.fx.view;

import edu.ijse.layered.fx.controller.LectureController;
import edu.ijse.layered.fx.dto.LecturerDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ManageLecturesController {

    private LectureController lectureController = new LectureController();

    @FXML
    private TableColumn<?, ?> contactColmn;

    @FXML
    private Label contactLabel;

    @FXML
    private TextField contactTxt;

    @FXML
    private Button deleteBtn;

    @FXML
    private TableView<?> detailsTabel;

    @FXML
    private TableColumn<?, ?> idColmn;

    @FXML
    private Label idLabel;

    @FXML
    private TextField idTxt;

    @FXML
    private TableColumn<?, ?> nameColmn;

    @FXML
    private Label nameLabel;

    @FXML
    private TextField nameTxt;

    @FXML
    private Button resetBtn;

    @FXML
    private Button saveBtn;

    @FXML
    private TableColumn<?, ?> subjectsColmn;

    @FXML
    private Label subjectsLabel;

    @FXML
    private TextArea subjectsTxt;

    @FXML
    private Button updateBtn;

    //@FXML
    //void deleteLecture(ActionEvent event) {

    //}

    @FXML
    void clear(ActionEvent event) {
            idTxt.setText("");
            nameTxt.setText("");
            contactTxt.setText("");
    }

    @FXML
    void saveLecture(ActionEvent event) {
            try {
                LecturerDto lecturerDto = new LecturerDto(
                        idTxt.getText(),
                        nameTxt.getText(),
                        contactTxt.getText()
                );

                String rsp = lectureController.addLecture(lecturerDto);
                clear(event);
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText(rsp);
                alert.showAndWait();
            } catch (Exception e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText(e.getMessage());
                alert.showAndWait();
            }
    }

    @FXML
    void updateLecture(ActionEvent event) {
            try{
                LecturerDto lecturerDto = new LecturerDto(
                        idTxt.getText(),
                        nameTxt.getText(),
                        contactTxt.getText()
                );

                String rsp = lectureController.updateLecture(lecturerDto);
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText(rsp);
                alert.showAndWait();
            } catch (Exception e) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setContentText(e.getMessage());
                alert.showAndWait();
            }

    }

    public void deleteLectures(ActionEvent event) {
        try {
            String rsp = lectureController.deleteLecture(idTxt.getText());
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
}

