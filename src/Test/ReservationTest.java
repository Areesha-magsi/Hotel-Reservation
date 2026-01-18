package Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.Reservation;

public class ReservationTest {
    @Test
    void testConfirmationMessage() {
        Reservation r = new Reservation();
        assertEquals("Confirmed", r.getConfirmation());
    }

    @Test
    void testConfirmationNotNull() {
        Reservation r = new Reservation();
        assertNotNull(r.getConfirmation());
    }
}