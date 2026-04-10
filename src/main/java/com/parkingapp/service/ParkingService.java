//package service;
//maneges spot availability and retrieval/Aida
//changed to correct package name by Manjula
package com.parkingapp.service;

//import model.ParkingSpot;
//import root directory properly by manjula
import com.parkingapp.model.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class ParkingService {

    // Example initial data
   // private List<ParkingSpot> spotsList;

    //created a list for Sports with object by Manjula
    private List<ParkingSpot> spotsList = new ArrayList<>();


//    public ParkingService(List<ParkingSpot> spotsList) {
//        this.spotsList = List.of(
//                new ParkingSpot(1, true),
//                new ParkingSpot(2, true),
//                new ParkingSpot(3, true),
//                new ParkingSpot(4, true));
//    }

    //code for total sports by Manjula
      public ParkingService(int totalSpots) {
                for (int i = 1; i <= totalSpots; i++) {
                    spotsList.add(new ParkingSpot(i));
                }
                }

    // Show all available spots
    public void showAvailableSpots() {
        System.out.println("Available Parking spots:");
        for (ParkingSpot spot : spotsList) {
            if (spot.isAvailable()) {
            //Added a text for available spot and also add else for Occupied by Manjula
                System.out.println("Spot ID:" + spot.getSpotId()+ "- Available");
            }
            else{
                System.out.println("Spot ID:" + spot.getSpotId()+ "- Occupied");
            }
        }
    }

    // Get a specific available spot by ID

    //public void getAvailableSpot(int spotId) {
        //changed return type as ParkingSpot by Manjula
        public ParkingSpot  getAvailableSpot(int spotId) {
        for (ParkingSpot spot : spotsList) {
            if (spot.getSpotId() == spotId && spot.isAvailable()) {
                return spot;
            }
        }
        return null;  // no available spot found
    }

}
