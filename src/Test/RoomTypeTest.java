package Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.RoomType;

public class RoomTypeTest {
    @Test
    void testRoomKind() {
        RoomType rt = new RoomType("Suite", 2500.0);
        assertEquals("Suite", rt.getKind());
    }

    @Test
    void testRoomPrice() {
        RoomType rt = new RoomType("Suite", 2500.0);
        assertEquals(2500.0, rt.getPrice());
    }
}