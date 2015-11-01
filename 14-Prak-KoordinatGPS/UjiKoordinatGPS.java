import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UjiKoordinatGPS {
    public UjiKoordinatGPS() { }

    @Before
    public void setUp() { }

    @After
    public void tearDown() { }
    
    @Test
    public void constructorDefault() {
        koordinatGPS = new KoordinatGPS();
        assertNotNull(koordinatGPS);
        assertNotNull(koordinatGPS.bujur());
        assertTrue(koordinatGPS.bujur() instanceof Double);
        assertEquals(koordinatGPS.bujur() , 0, 0.01);
        assertNotNull(koordinatGPS.lintang());
        assertTrue(koordinatGPS.lintang() instanceof Double);
        assertEquals(koordinatGPS.lintang() , 0, 0.01);
    }
    
    @Test
    public void constructorNonObject() {
        koordinatGPS = new KoordinatGPS(bujur, lintang);
        assertNotNull(koordinatGPS);
        assertNotNull(koordinatGPS.bujur());
        assertTrue(koordinatGPS.bujur() instanceof Double);
        assertEquals(koordinatGPS.bujur() , bujur, 0.01);
        assertNotNull(koordinatGPS.lintang());
        assertTrue(koordinatGPS.lintang() instanceof Double);
        assertEquals(koordinatGPS.lintang() , lintang, 0.01);
    }
    
    @Test
    public void constructorObject() {
        koordinatGPS = new KoordinatGPS(new Double(bujur), new Double(lintang));
        assertNotNull(koordinatGPS);
        assertNotNull(koordinatGPS.bujur());
        assertTrue(koordinatGPS.bujur() instanceof Double);
        assertEquals(koordinatGPS.bujur() , bujur, 0.01);
        assertNotNull(koordinatGPS.lintang());
        assertTrue(koordinatGPS.lintang() instanceof Double);
        assertEquals(koordinatGPS.lintang() , lintang, 0.01);
    }
    
    private double bujur = 123.45;
    private double lintang = 987.65;
    private KoordinatGPS koordinatGPS;
}
