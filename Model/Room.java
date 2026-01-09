package model;

public class Room {
    private int number; // UML: number 
    private RoomType type; // UML Association 

    public Room(int number, RoomType type) {
        if (number <= 0) throw new IllegalArgumentException("Invalid room number"); [cite: 25]
        this.number = number;
        this.type = type;
    }
}