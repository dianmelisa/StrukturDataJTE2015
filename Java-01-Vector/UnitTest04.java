import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class UnitTest04.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class UnitTest04 {
    /**
     * Default constructor for test class UnitTest04
     */
    public UnitTest04() { }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() { 
        titikAcuan = new Vector3D(titikAcuanX, titikAcuanY, titikAcuanZ);
        arah = new Vector3D(arahX, arahY, arahZ);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() { }
    
    @Test
    public void gaya() {
        Gaya gaya = new Gaya(titikAcuan, arah);
        assertNotNull(gaya);
        assertNotNull(gaya.getTitikAcuan());
        assertEquals(gaya.getTitikAcuan().getX(), titikAcuanX, 0.01);
        assertEquals(gaya.getTitikAcuan().getY(), titikAcuanY, 0.01);
        assertEquals(gaya.getTitikAcuan().getZ(), titikAcuanZ, 0.01);
        assertNotNull(gaya.getArah());
        assertEquals(gaya.getArah().getX(), arahX, 0.01);
        assertEquals(gaya.getArah().getY(), arahY, 0.01);
        assertEquals(gaya.getArah().getZ(), arahZ, 0.01);
   }
    
    private double titikAcuanX = 1.23;
    private double titikAcuanY = 4.56;
    private double titikAcuanZ = 7.89;
    private Vector3D titikAcuan;

    private double arahX = 9.87;
    private double arahY = 6.54;
    private double arahZ = 3.21;
    private Vector3D arah;
}