package model;

public class RoomType {
    private String kind; // UML: kind (e.g., Single/Double) 
    private double cost; // UML: cost 

    public RoomType(String kind, double cost) {
        if (cost < 0) throw new IllegalArgumentException("Cost cannot be negative"); [cite: 25]
        this.kind = kind;
        this.cost = cost;
    }
}