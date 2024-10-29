package com.alatoo.electronicdevices;

public class Smartphone extends Device{
    protected double screenSize;
    protected double cameraResolution;


    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    public void setCameraResolution(double cameraResolution) {
        this.cameraResolution = cameraResolution;
    }
    public double getScreenSize() {
        return screenSize;
    }
    public double getCameraResolution() {
        return cameraResolution;
    }

    public Smartphone(dtype type, String name, double price, double weight, double screenSize, double cameraResolution) {
        super(type ,name, price, weight);
        this.screenSize = screenSize;
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", screenSize=" + screenSize +
                ", resolution=" + cameraResolution +
                '}';
    }
}


