package model;

public class Guest {
    private String name; // UML attribute 
    private String addressDetails; // UML attribute 

    public Guest(String name, String address) {
        // Defensive: Name null nahi hona chahiye [cite: 25]
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Guest name is required"); [cite: 27]
        }
        this.name = name;
        this.addressDetails = address;
    }
}