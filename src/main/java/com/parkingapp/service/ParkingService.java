package service;
//maneges spot availability and retrieval/Aida

import model.ParkingSpot;

import java.util.List;

public class ParkingService {

    // Example initial data
    private List<ParkingSpot> spotsList;

    public ParkingService(List<ParkingSpot> spotsList) {
        this.spotsList = List.of(
                new ParkingSpot(1, true),
                new ParkingSpot(2, true),
                new ParkingSpot(3, true),
                new ParkingSpot(4, true));
    }

    // Show all available spots
    public void showAvailableSpots() {
        System.out.println("Available Parking spots:");
        for (ParkingSpot spot : spotsList) {
            if (spot.isAvailable()) {

                System.out.println("Spot ID:" + spot.getSpotId());
            }
        }
    }

    // Get a specific available spot by ID
    public void getAvailableSpot(int spotId) {
        for (ParkingSpot spot : spotsList) {
            if (spot.getSpotId() = spotId && spot.spot.isAvalilble())
                return spot;

        }
        return null;  // no available spot found
    }

}
