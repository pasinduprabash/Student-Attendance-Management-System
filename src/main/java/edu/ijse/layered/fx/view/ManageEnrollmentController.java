package edu.ijse.layered.fx.view;

import edu.ijse.layered.fx.controller.EnrollController;
import edu.ijse.layered.fx.dto.EnrollDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class ManageEnrollmentController {

    private EnrollController enrollController = new EnrollController();

    @FXML
    private Button clearBtn;

    @FXML
    private Label idLabel;

    @FXML
    private TextField idTxt;

    @FXML
    private Button menuBtn;

    @FXML
    private Label regLabel;

    @FXML
    private TextField regTxt;

    @FXML
    private Button submitBtn;

    @FXML
    private Label titleLabel;

    @FXML
    private Hyperlink tradeMarkLabel;

    @FXML
    void navigateClear(ActionEvent event) {
        regTxt.setText("");
        idTxt.setText("");
    }

    @FXML
    void navigateMainMenu(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ManageEnrollmentController.class.getResource("/edu/ijse/layered/fx/MainMenu.fxml"));
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

