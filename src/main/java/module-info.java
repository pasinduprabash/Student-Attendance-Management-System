module edu.ijse.layered.fx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens edu.ijse.layered.fx to javafx.fxml;
    exports edu.ijse.layered.fx;
}