package model;

import java.util.ArrayList;
import java.util.List;

public class HotelChain {
    private List<Hotel> hotels; // UML Association 
    private List<ReserverPayer> customers; // UML Association 

    public HotelChain() {
        this.hotels = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    // Defensive: Hotel add karte waqt null check [cite: 25]
    public void addHotel(Hotel hotel) {
        if (hotel == null) throw new NullPointerException("Hotel cannot be null"); [cite: 27, 28]
        this.hotels.add(hotel);
    }

    // Core Method: Reservation banana [cite: 7, 12]
    public void makeReservation() {
        // Yahan aap logic likhenge jo Hotel.available() check karega [cite: 8]
        System.out.println("Reservation logic initiated...");
    }

    public void cancelReservation() { [cite: 7]
        // Reservation cancel karne ki logic
    }

    public void checkInGuest() { [cite: 7]
        // Guest ko room assign karne ki logic
    }
}