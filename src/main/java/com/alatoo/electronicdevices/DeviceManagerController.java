package com.alatoo.electronicdevices;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class DeviceManagerController {

    @FXML private TextField nameFieldSmartphone, priceFieldSmartphone, weightFieldSmartphone, screenSizeFieldSmartphone, cameraResolutionFieldSmartphone;
    @FXML private TextField nameFieldLaptop, priceFieldLaptop, weightFieldLaptop, processorTypeFieldLaptop, ramSizeFieldLaptop;
    @FXML private TextField nameFieldTablet, priceFieldTablet, weightFieldTablet, batteryLifeFieldTablet;
    @FXML private ChoiceBox<Boolean> stylusChoiceBox;
    @FXML private Button saveSmartphoneButton, saveTabletButton, saveLaptopButton, removeButton;
    @FXML private ListView<Device> listView;
    @FXML private Label selectedText;

    private final ObservableList<Device> devices = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        listView.setItems(devices);
        stylusChoiceBox.setItems(FXCollections.observableArrayList(true, false));
        stylusChoiceBox.setValue(false);
        listView.setOnMouseClicked(event -> displaySelectedDevice());
    }

    @FXML
    void clickSmartphone() {
        try {
            devices.add(new Smartphone(
                    dtype.SMARTPHONE,
                    nameFieldSmartphone.getText(),
                    Double.parseDouble(priceFieldSmartphone.getText()),
                    Double.parseDouble(weightFieldSmartphone.getText()),
                    Double.parseDouble(screenSizeFieldSmartphone.getText()),
                    Double.parseDouble(cameraResolutionFieldSmartphone.getText())
            ));
            clearFields(nameFieldSmartphone, priceFieldSmartphone, weightFieldSmartphone, screenSizeFieldSmartphone, cameraResolutionFieldSmartphone);
        } catch (Exception e) {
            showAlert("Invalid Input", "Please enter valid data for all fields.");
        }
    }

    @FXML
    void clickLaptop() {
        try {
            devices.add(new Laptop(
                    dtype.LAPTOP,
                    nameFieldLaptop.getText(),
                    Double.parseDouble(priceFieldLaptop.getText()),
                    Double.parseDouble(weightFieldLaptop.getText()),
                    processorTypeFieldLaptop.getText(),
                    Integer.parseInt(ramSizeFieldLaptop.getText())
            ));
            clearFields(nameFieldLaptop, priceFieldLaptop, weightFieldLaptop, processorTypeFieldLaptop, ramSizeFieldLaptop);
        } catch (Exception e) {
            showAlert("Invalid Input", "Please enter valid data for all fields.");
        }
    }

    @FXML
    void clickTablet() {
        try {
            devices.add(new Tablet(
                    dtype.TABLET,
                    nameFieldTablet.getText(),
                    Double.parseDouble(priceFieldTablet.getText()),
                    Double.parseDouble(weightFieldTablet.getText()),
                    Double.parseDouble(batteryLifeFieldTablet.getText()),
                    stylusChoiceBox.getValue()
            ));
            clearFields(nameFieldTablet, priceFieldTablet, weightFieldTablet, batteryLifeFieldTablet);
        } catch (Exception e) {
            showAlert("Invalid Input", "Please enter valid data for all fields.");
        }
    }

    @FXML
    private void removeSelectedDevice() {
        Device selectedDevice = listView.getSelectionModel().getSelectedItem();
        if (selectedDevice != null) {
            devices.remove(selectedDevice);
            selectedText.setText("");
        } else {
            showAlert("No Selection", "Please select a device to remove.");
        }
    }

    private void displaySelectedDevice() {
        Device selectedDevice = listView.getSelectionModel().getSelectedItem();
        selectedText.setText(selectedDevice != null ? selectedDevice.toString() : "No device selected");
    }

    private void clearFields(TextField... fields) {
        for (TextField field : fields) {
            field.clear();
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
