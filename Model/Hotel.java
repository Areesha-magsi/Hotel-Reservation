package model;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name; [cite: 7]
    private List<Room> rooms; // Association with Room [cite: 7, 13]

    public Hotel(String name) {
        // Defensive Programming: Name khali nahi hona chahiye [cite: 25, 73]
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Hotel name cannot be empty"); [cite: 27]
        }
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        if (room == null) throw new NullPointerException("Room cannot be null"); [cite: 28]
        this.rooms.add(room);
    }

    public boolean available() {
        return !rooms.isEmpty(); [cite: 7]
    }
}