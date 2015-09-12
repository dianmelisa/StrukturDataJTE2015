import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test untuk package KebunBinatang
 */
public class KebunBinatangUnitTest {
    @Before
    public void setUp() { }

    @After
    public void tearDown() { }
    
    /**
     * Uji class Harimau
     */
    @Test
    public void harimau() {
        Harimau harimau = new Harimau();
        assertEquals(harimau.suara(), "Aum");
        assertEquals(harimau.jumlahKaki(), 4);
    }        
    
    /**
     * Uji class Kambing
     */
    @Test
    public void kambing() {
        Kambing kambing = new Kambing();
        assertEquals(kambing.suara(), "Mbek");
        assertEquals(kambing.jumlahKaki(), 4);
    }
    
    /**
     * Uji class Ular
     */
    @Test
    public void ular() {
        Ular ular = new Ular();
        assertEquals(ular.suara(), "Sss");
        assertEquals(ular.merayap(), true);
    }
    
    /**
     * Uji class Komodo
     */
    @Test
    public void komodo() {
        Komodo komodo = new Komodo();
        assertEquals(komodo.suara(), "Sss");
        assertEquals(komodo.merayap(), false);
    }
    
    /**
     * Uji class Mangga
     */
    @Test
    public void mangga() {
        Mangga mangga = new Mangga();
        assertEquals(mangga.berbuah(), true);
    }
    
    /**
     * Uji class Alien
     */
    @Test
    public void alien() {
        Alien alien = new Alien();
        assertEquals(alien.suara(), "Bip");
        assertEquals(alien.berbuah(), true);
    }
}