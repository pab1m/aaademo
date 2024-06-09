module com.example.aaademo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.aaademo to javafx.fxml;
    exports com.example.aaademo;
}