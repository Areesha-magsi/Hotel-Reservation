package model;

public class ReserverPayer {
    private String creditCardDetails; // UML: creditCardDetails 
    private String id; // UML: id 

    public ReserverPayer(String id, String ccDetails) {
        if (id == null || ccDetails == null) {
            throw new IllegalArgumentException("ID and Credit Card details are required"); [cite: 25, 27]
        }
        this.id = id;
        this.creditCardDetails = ccDetails;
    }
}