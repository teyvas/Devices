package com.alatoo.electronicdevices;

public class Tablet extends Device{
    protected double batteryLife;
    protected boolean hasStylus;

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }
    public double getBatteryLife() {
        return batteryLife;
    }
    public void setHasStylus(boolean hasStylus) {
        this.hasStylus = hasStylus;
    }
    public boolean hasStylus() {
        return hasStylus;
    }

    public Tablet(dtype type, String name, double price, double weight, double batteryLife, boolean hasStylus ) {
        super(type, name, price, weight);
        this.batteryLife = batteryLife;
        this.hasStylus = hasStylus;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", batteryLife=" + batteryLife +
                ", hasStylus=" + hasStylus +
                '}';
    }
}
