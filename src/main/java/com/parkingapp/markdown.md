```mermaid
classDiagram
    direction LR

    class Customer {
        -name: String
        -phoneNumber: String
        -vehicle: Vehicle
    }
    
    class Vehicle {
        -plateNumber: String
    }

    class ParkingSpot {
        -spotId: int
        -isAvailable: Boolean
    }
    
    class ReservationStatus {
        <<enumeration>>
        ACTIVE
        COMLPLETED
    }
    
    class Reservation {
        -customer: Customer
        -spot: ParkingSpot
        -startTime: LocalDateTime
        -endTime: LocalDateTime
        -status: ReservationStatus
    }

    class ParkingService {
        -spotsList: List<ParkingSpot>
        +showAvailableSpots: void
        +getAvailableSpot(spotId int):
    }

    class ReservationService {
        -reservations: HashMap<String, Reservation>
        +createReservation(customer Customer, spot ParkingSpot, hours int): Reservation
        +completeReservation(id String): void
    }
    
    class IdGenerator {
        +generateId() String
    }

    Customer --> Vehicle
    Reservation --> ReservationStatus
    Reservation --> ParkingSpot
```