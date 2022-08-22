package com.exemplo.nathandg.helloWorld.models;

public class Device {

    private String name;
    private String brand;
    private Boolean wifi;
    private String macAddress;

    public Device() {}

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", wifi=" + wifi +
                ", macAddress='" + macAddress + '\'' +
                '}';
    }
}
