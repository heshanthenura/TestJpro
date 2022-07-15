module com.heshan.testjpro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.heshan.testjpro to javafx.fxml;
    exports com.heshan.testjpro;
}