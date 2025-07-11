package edu.ijse.layered.fx.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ManageLoginController {

    @FXML
    private Button clearBtn;

    @FXML
    private Button loginBtn;

    @FXML
    private Label nameLabel;

    @FXML
    private Label passwordLabel;

    @FXML
    private PasswordField passwordTxt;

    @FXML
    private Label roleLabel;

    @FXML
    private ChoiceBox<?> rolePicker;

    @FXML
    private Label titleLabel;

    @FXML
    private Hyperlink tradeMarkLabel;

    @FXML
    private TextField userTxt;

    @FXML
    void navigateClear(ActionEvent event) {
            userTxt.setText("");
            passwordTxt.setText("");
            rolePicker.setValue(null);
    }

    @FXML
    void navigateLogin(ActionEvent event) {
            try {
                String username = userTxt.getText();
                String password = passwordTxt.getText();
                String role = String.valueOf(rolePicker.getValue());

                if(username.equals("admin") && password.equals("123") && role.equals("Admin")){
                    FXMLLoader fxmlLoader = new FXMLLoader(ManageLoginController.class.getResource("/edu/ijse/layered/fx/MainMenu.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("Main Menu");
                    stage.setResizable(false);
                    stage.show();

                    ((Stage) loginBtn.getScene().getWindow()).close();

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText("Admin Login Successfully");
                    alert.showAndWait();

                } else if (username.equals("lecture") && password.equals("123") && role.equals("Lecture")){
                    FXMLLoader fxmlLoader = new FXMLLoader(ManageLoginController.class.getResource("/edu/ijse/layered/fx/ManageAttendance.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("Main Menu");
                    stage.setResizable(false);
                    stage.show();

                    ((Stage) loginBtn.getScene().getWindow()).close();

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText("Lecture Login Successfully");
                    alert.showAndWait();

                } else {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setContentText("Invalid Username or Password");
                    alert.showAndWait();
                }
            } catch (Exception e) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setContentText("Login Failed");
                alert.showAndWait();
            }
    }

}
