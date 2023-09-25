module com.example.session {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.session to javafx.fxml;
    exports com.example.session;
}