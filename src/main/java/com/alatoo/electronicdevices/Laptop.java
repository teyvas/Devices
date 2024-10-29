package com.alatoo.electronicdevices;

public class Laptop extends Device {
     protected String processorType;
     protected int ramSize;


    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }
    public String getProcessorType() {
        return processorType;
    }
    public int getRamSize() {
        return ramSize;
    }

    public Laptop(dtype type, String name, double price, double weight, String processorType, int ramSize) {
        super( type, name, price, weight);
        this.processorType = processorType;
        this.ramSize = ramSize;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", processorType=" + processorType +
                ", ramSize=" + ramSize +
                '}';
    }
}
