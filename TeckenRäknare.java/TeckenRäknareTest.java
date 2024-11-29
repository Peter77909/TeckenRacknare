import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TeckenRäknareTest {


    TeckenRäknare räknare = new TeckenRäknare();

    // Testa uppdatera-metoden
    @Test
    public void test1() {
        räknare.uppdatera("Hej på dig");
        assertEquals(10, räknare.getTecken());
        assertEquals(1, räknare.getRader());
        assertEquals(3, räknare.getOrd());
        assertEquals("Hej", räknare.getLängstaOrd());
    }

    @Test
    public void teststop() {
        assertEquals(true, räknare.ärStop("stop"));
        assertEquals(false, räknare.ärStop("fortsätt"));
    }

}