package com.parkingapp;

import com.parkingapp.model.*;
import com.parkingapp.service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ParkingService parkingService = new ParkingService(10);
        ReservationService reservationService = new ReservationService();

        System.out.println("=== Parking Management System ===");

        while (true) {
            System.out.println("\n1. Register & Book Spot");
            System.out.println("2. View Spots");
            System.out.println("3. Complete Reservation");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = scanner.nextLine();

                    System.out.print("Enter Vehicle Plate: ");
                    String plate = scanner.nextLine();

                    Vehicle vehicle = new Vehicle(plate);
                    Customer customer = new Customer(name, phone, vehicle);

                    parkingService.showAvailableSpots();

                    System.out.print("Select Spot ID: ");
                    int spotId = scanner.nextInt();

                    ParkingSpot spot = parkingService.getAvailableSpot(spotId);

                    if (spot == null) {
                        System.out.println("Invalid or occupied spot!");
                        break;
                    }

                    System.out.print("Enter hours: ");
                    int hours = scanner.nextInt();

                    Reservation res = reservationService.createReservation(customer, spot, hours);

                    System.out.println("Reservation Created! ID: " + res.getReservationId());
                    break;

                case 2:
                    parkingService.showAvailableSpots();
                    break;

                case 3:
                    scanner.nextLine();
                    System.out.print("Enter Reservation ID: ");
                    String id = scanner.nextLine();

                    reservationService.completeReservation(id);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
