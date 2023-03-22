module com.example.minige {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.minige to javafx.fxml;
    exports com.example.minige;
}