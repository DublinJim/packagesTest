module com.example.packagestest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.packagestest to javafx.fxml;
    exports com.example.packagestest;
}