package com.yammer.dropwizarddemo.com.yammer.dropwizarddemo.dto;

public class Car {
    private String licenseplate;
    private String color;

    public Car(String licenseplate, String color) {
        this.licenseplate = licenseplate;
        this.color = color;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicenseplate() {
        return licenseplate;
    }

    public String getColor() {
        return color;
    }
}
