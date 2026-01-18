package Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.Guest;

public class GuestTest {
    @Test
    void testGuest() {
        
<<<<<<< HEAD
        Guest g = new Guest("Areesha", "0300");
=======
        Guest g = new Guest("Arbaz", "0300");
>>>>>>> 0237f53 ("Initial Domain Implementation")
        assertEquals("Arbaz", g.getName());
    }

    @Test
    void testGuestContact() {
        
<<<<<<< HEAD
        Guest g = new Guest("Areesha", "0300");
=======
        Guest g = new Guest("Arbaz", "0300");
>>>>>>> 0237f53 ("Initial Domain Implementation")
        assertEquals("0300", g.getContact());
    }
}