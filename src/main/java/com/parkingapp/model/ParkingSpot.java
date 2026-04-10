package model;
//Represents a parking spot with ID and availability status.

public class ParkingSpot {


        private String spotId;
        private boolean isAvailable;


    public ParkingSpot(String spotId, boolean isAvailable) {
        this.spotId = spotId;
        this.isAvailable = isAvailable;
    }

    public String getSpotId() {
        return spotId;
    }

    public void setSpotId(String spotId) {
        this.spotId = spotId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "spotId='" + spotId + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}



