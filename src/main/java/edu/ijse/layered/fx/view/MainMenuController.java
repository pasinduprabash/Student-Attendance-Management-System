package edu.ijse.layered.fx.view;

import edu.ijse.layered.fx.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {

    @FXML
    private Button attendenceBtn;

    @FXML
    private Button classesBtn;

    @FXML
    private Button coursesBtn;

    @FXML
    private Button enrollBtn;

    @FXML
    private Button lecturesBtn;

    @FXML
    private Button logOutBtn;

    @FXML
    private Button reportsBtn;

    @FXML
    private Button studentsBtn;

    @FXML
    private Button subjectsBtn;

    @FXML
    private Label titleLabel;

    @FXML
    private Hyperlink tradeMarkLabel;

    @FXML
    void logOut(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainMenuController.class.getResource("/edu/ijse/layered/fx/ManageLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.setResizable(false);
        stage.show();

        ((Stage) logOutBtn.getScene().getWindow()).close();
    }

    @FXML
    void navigateAttendence(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainMenuController.class.getResource("/edu/ijse/layered/fx/ManageAttendance.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Attendance Management");
        stage.setResizable(false);
        stage.show();

        ((Stage) attendenceBtn.getScene().getWindow()).close();
    }

    @FXML
    void navigateClasses(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainMenuController.class.getResource("/edu/ijse/layered/fx/ManageClasses.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Classes Management System");
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void navigateCourses(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainMenuController.class.getResource("/edu/ijse/layered/fx/ManageCourses.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Course Management System");
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void navigateEnroll(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainMenuController.class.getResource("/edu/ijse/layered/fx/ManageEnrollment.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Manage Enrollment");
        stage.setResizable(false);
        stage.show();

        ((Stage) enrollBtn.getScene().getWindow()).close();
    }

    @FXML
    void navigateLectures(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainMenuController.class.getResource("/edu/ijse/layered/fx/ManageLectures.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Lecture Management System");
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void navigateReports(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainMenuController.class.getResource("/edu/ijse/layered/fx/ManageReports.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Reports Management");
        stage.setResizable(false);
        stage.show();

        ((Stage) reportsBtn.getScene().getWindow()).close();
    }

    @FXML
    void navigateStudents(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainMenuController.class.getResource("/edu/ijse/layered/fx/ManageStudents.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Students Management System");
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void navigateSubjects(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainMenuController.class.getResource("/edu/ijse/layered/fx/ManageSubjects.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Subject Management");
        stage.setResizable(false);
        stage.show();
    }

}
