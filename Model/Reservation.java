package model;
import java.util.Date;

public class Reservation {
    private Date reservationDate; [cite: 7]
    private Date startDate; [cite: 7]
    private Date endDate; [cite: 7]
    private int number; [cite: 7]

    public Reservation(Date start, Date end, int resNumber) {
        // Defensive: Check for nulls and logic errors [cite: 25, 28]
        if (start == null || end == null) {
            throw new IllegalArgumentException("Dates cannot be null"); [cite: 27]
        }
        if (end.before(start)) {
            throw new IllegalArgumentException("End date must be after start date"); [cite: 26]
        }
        if (resNumber <= 0) {
            throw new IllegalArgumentException("Reservation number must be positive"); [cite: 25]
        }
        
        this.startDate = start;
        this.endDate = end;
        this.number = resNumber;
        this.reservationDate = new Date(); // Current date 
    }
}