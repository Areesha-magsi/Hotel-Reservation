package Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.HowMany;

public class HowManyTest {
    @Test
    void testGuestCountValue() {
        HowMany h = new HowMany();
        assertEquals(1, h.getGuestCount());
    }

    @Test
    void testInstanceCheck() {
        HowMany h = new HowMany();
        assertNotNull(h);
    }
}
