package edu.ijse.layered.fx.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ManageAttendanceController {

    @FXML
    private Button clearBtn;

    @FXML
    private Label dateLabel;

    @FXML
    private DatePicker datePicker;

    @FXML
    private Label lectureLabel;

    @FXML
    private TextField lectureTxt;

    @FXML
    private Button menuBtn;

    @FXML
    private Label statusLabel;

    @FXML
    private ComboBox<?> statusPicker;

    @FXML
    private Label studentLabel;

    @FXML
    private TextField studentTxt;

    @FXML
    private Label subjectLabel;

    @FXML
    private TextField subjectTxt;

    @FXML
    private Button submitBtn;

    @FXML
    private Label titleLabel;

    @FXML
    private Hyperlink tradeMarkLabel;

    @FXML
    void navigateClear(ActionEvent event) {

    }

    @FXML
    void navigateMainMenu(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainMenuController.class.getResource("/edu/ijse/layered/fx/MainMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Main Menu");
        stage.setResizable(false);
        stage.show();

        ((Stage) menuBtn.getScene().getWindow()).close();
    }

    @FXML
    void navigateSubmit(ActionEvent event) {

    }

}
