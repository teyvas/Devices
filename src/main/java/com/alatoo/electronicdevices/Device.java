package com.alatoo.electronicdevices;
public class Device {
    protected dtype type;
    protected String name;
    protected double price;
    protected double weight;

    public Device( dtype type, String name, double price, double weight) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public Device() {

    }

    public void setType(dtype type) {
        this.type = type;
    }

    public dtype getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public double getWeight() {
        return weight;
    }
}
