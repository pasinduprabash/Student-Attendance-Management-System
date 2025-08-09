module edu.ijse.layered.fx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires static lombok;
    requires jdk.compiler;

    exports edu.ijse.layered.fx;

    opens edu.ijse.layered.fx to javafx.fxml;
    opens edu.ijse.layered.fx.view to javafx.fxml;
    exports edu.ijse.layered.fx.view;
}
