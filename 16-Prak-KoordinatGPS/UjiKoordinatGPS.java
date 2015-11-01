import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

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
        assertTrue(koordinatGPS.bujur() instanceof BigDecimal);
        assertEquals(koordinatGPS.bujur().doubleValue(), 0.0, 0.01);
        assertEquals(koordinatGPS.bujurStr() , "0");
        assertNotNull(koordinatGPS.lintang());
        assertTrue(koordinatGPS.lintang() instanceof BigDecimal);
        assertEquals(koordinatGPS.lintang().doubleValue(), 0.0, 0.01);
        assertEquals(koordinatGPS.lintangStr() , "0");
    }
    
    @Test
    public void constructorString() {
        koordinatGPS = new KoordinatGPS(Double.toString(bujur), Double.toString(lintang));
        assertNotNull(koordinatGPS);
        assertNotNull(koordinatGPS.bujur());
        assertTrue(koordinatGPS.bujur() instanceof BigDecimal);
        assertEquals(koordinatGPS.bujur().doubleValue(), bujur, 0.01);
        assertEquals(koordinatGPS.bujurStr() , Double.toString(bujur));
        assertNotNull(koordinatGPS.lintang());
        assertTrue(koordinatGPS.lintang() instanceof BigDecimal);
        assertEquals(koordinatGPS.lintang().doubleValue(), lintang, 0.01);
        assertEquals(koordinatGPS.lintangStr() , Double.toString(lintang));
    }
    
    @Test
    public void constructorPrimitive() {
        koordinatGPS = new KoordinatGPS(bujur, lintang);
        assertNotNull(koordinatGPS);
        assertNotNull(koordinatGPS.bujur());
        assertTrue(koordinatGPS.bujur() instanceof BigDecimal);
        assertEquals(koordinatGPS.bujur().doubleValue(), bujur, 0.01);
        assertEquals(Double.valueOf(koordinatGPS.bujurStr()), bujur, 0.01);
        assertNotNull(koordinatGPS.lintang());
        assertTrue(koordinatGPS.lintang() instanceof BigDecimal);
        assertEquals(koordinatGPS.lintang().doubleValue(), lintang, 0.01);
        assertEquals(Double.valueOf(koordinatGPS.lintangStr()), lintang, 0.01);
    }
    
    @Test
    public void constructorObject() {
        koordinatGPS = new KoordinatGPS(new BigDecimal(bujur), new BigDecimal(lintang));
        assertNotNull(koordinatGPS);
        assertNotNull(koordinatGPS.bujur());
        assertTrue(koordinatGPS.bujur() instanceof BigDecimal);
        assertEquals(koordinatGPS.bujur().doubleValue(), bujur, 0.01);
        assertEquals(Double.valueOf(koordinatGPS.bujurStr()), bujur, 0.01);
        assertNotNull(koordinatGPS.lintang());
        assertTrue(koordinatGPS.lintang() instanceof BigDecimal);
        assertEquals(koordinatGPS.lintang().doubleValue(), lintang, 0.01);
        assertEquals(Double.valueOf(koordinatGPS.lintangStr()), lintang, 0.01);
    }
    
    @Test
    public void lintang() {
        koordinatGPS = new KoordinatGPS(bujur, lintang);
        assertNotNull(koordinatGPS);
        assertNotNull(koordinatGPS.lintang());
        assertTrue(koordinatGPS.lintang() instanceof BigDecimal);
        assertEquals(koordinatGPS.lintang().doubleValue(), lintang, 0.01);
        assertEquals(Double.valueOf(koordinatGPS.lintangStr()), lintang, 0.01);
    }
    
    @Test
    public void bujur() {
        koordinatGPS = new KoordinatGPS(bujur, lintang);
        assertNotNull(koordinatGPS);
        assertNotNull(koordinatGPS.bujur());
        assertTrue(koordinatGPS.bujur() instanceof BigDecimal);
        assertEquals(koordinatGPS.bujur().doubleValue(), bujur, 0.01);
        assertEquals(Double.valueOf(koordinatGPS.bujurStr()), bujur, 0.01);
    }
    
    private double bujur = 123.45;
    private double lintang = 987.65;
    private KoordinatGPS koordinatGPS;
}
