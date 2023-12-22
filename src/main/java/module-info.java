module com.example.test_nf {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test_nf to javafx.fxml;
    exports com.example.test_nf;
}