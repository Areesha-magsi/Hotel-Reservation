package Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import main.Main;

public class MainTest {
    @Test
    void testMainApp() {
        Main.main(new String[]{});
    }

    @Test
    void testMainInstance() {
        
        Main m = new Main();
        assertNotNull(m);
    }
}