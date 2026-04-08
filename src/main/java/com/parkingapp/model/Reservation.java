package com.parkingapp.model;

import java.time.LocalDateTime;

public class Reservation {
    private String reservationId;
    private Customer customer;
    private ParkingSpot spot;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private ReservationStatus status;

    public Reservation(String reservationId, Customer customer, ParkingSpot spot, int hours) {
        this.reservationId = reservationId;
        this.customer = customer;
        this.spot = spot;
        this.startTime = LocalDateTime.now();
        this.endTime = startTime.plusHours(hours);
        this.status = ReservationStatus.ACTIVE;
    }

    public String getReservationId() {
        return reservationId;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void completeReservation() {
        this.status = ReservationStatus.COMPLETED;
        spot.vacate();
    }
}
