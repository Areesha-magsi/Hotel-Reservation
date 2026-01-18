package Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.Guest;

public class GuestTest {
    @Test
    void testGuest() {
        
        Guest g = new Guest("Areesha", "0300");
        assertEquals("Arbaz", g.getName());
    }

    @Test
    void testGuestContact() {
        
        Guest g = new Guest("Areesha", "0300");
        assertEquals("0300", g.getContact());
    }
}