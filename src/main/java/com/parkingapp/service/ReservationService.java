package com.parkingapp.service;

import com.parkingapp.model.*;
import com.parkingapp.util.IdGenerator;

import java.util.HashMap;
import java.util.Map;

public class ReservationService {
    private Map<String, Reservation> reservations = new HashMap<>();

    public Reservation createReservation(Customer customer, ParkingSpot spot, int hours) {
        String id = IdGenerator.generateId();
        spot.occupy();
        Reservation reservation = new Reservation(id, customer, spot, hours);
        reservations.put(id, reservation);
        return reservation;
    }

    public void completeReservation(String id) {
        Reservation reservation = reservations.get(id);
        if (reservation != null && reservation.getStatus() == ReservationStatus.ACTIVE) {
            reservation.completeReservation();
            System.out.println("Reservation completed!");
        } else {
            System.out.println("Invalid reservation ID!");
        }
    }
}
