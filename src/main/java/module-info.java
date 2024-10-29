module com.alatoo.electronicdevices {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.alatoo.electronicdevices to javafx.fxml;
    exports com.alatoo.electronicdevices;
}