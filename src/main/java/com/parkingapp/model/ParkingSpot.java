//package model;
//changed to correct package name by Manjula
package com.parkingapp.model;
//Represents a parking spot with ID and availability status.

public class ParkingSpot {


        private int  spotId;
        private boolean isAvailable;


    public ParkingSpot(int spotId) {
        this.spotId = spotId;
        //isAvailable value set as true by Manjula
        //this.isAvailable = isAvailable;
        this.isAvailable = true;
    }

    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

//    public void setAvailable(boolean available) {
//        isAvailable = available;
//    }
    //Added a method for Occupy and vacate
        public void occupy() {
            this.isAvailable = false;
        }

            public void vacate() {
                this.isAvailable = true;
            }



    @Override
    public String toString() {
        return "ParkingSpot{" +
                "spotId='" + spotId + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}



