//package model;
//changed to correct package name by Manjula
package com.parkingapp.model;

public class Vehicle {

    //-plateNumber:String
    private final String plateNumber;

    // Constructor for adding Vehicle
    public Vehicle(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    // Getter - to read platenumbers
    public String getPlateNumber() {
        return plateNumber;
    }

    // toString
    @Override
    public String toString() {
        return "Vehicle{" + "plateNumber='" + plateNumber + '\'' + '}';
    }
}