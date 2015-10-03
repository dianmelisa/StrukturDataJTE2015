import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class UnitTest07.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class UnitTest07 {
    /**
     * Default constructor for test class UnitTest07
     */
    public UnitTest07() { }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() { }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() { }
    
    @Test
    public void mobil() {
        String plat = "BLBLBL";
        Mobil mobil = new Mobil(plat);
        assertTrue(mobil instanceof Kendaraan);
        assertTrue(mobil instanceof Mobil);
        assertEquals(mobil.plat(), plat);
        assertEquals(mobil.tipe(), "Mobil");
    }
    
    @Test
    public void becak() {
        String plat = "BLBLBL";
        Becak becak = new Becak(plat);
        assertTrue(becak instanceof Kendaraan);
        assertTrue(becak instanceof Becak);
        assertEquals(becak.plat(), plat);
        assertEquals(becak.tipe(), "Becak");
    }
    
    @Test
    public void sepedaMotor() {
        String plat = "BLBLBL";
        SepedaMotor sepedaMotor = new SepedaMotor(plat);
        assertTrue(sepedaMotor instanceof Kendaraan);
        assertTrue(sepedaMotor instanceof SepedaMotor);
        assertEquals(sepedaMotor.plat(), plat);
        assertEquals(sepedaMotor.tipe(), "SepedaMotor");
    }
    
    @Test
    public void pool() {
        Pool pool = new Pool(null);
        assertEquals(pool.jumlah(), 0);
        assertNotNull(pool.daftarKendaraan());
        assertEquals(pool.daftarKendaraan().length, 0);

        String plat1 = "BL111";
        Mobil mobil = new Mobil(plat1);
        pool = new Pool(new Kendaraan[] {mobil});
        assertEquals(pool.jumlah(), 1);
        assertNotNull(pool.daftarKendaraan());
        assertEquals(pool.daftarKendaraan().length, 1);
        assertNotNull(pool.daftarKendaraan()[0]);
        assertNotNull(pool.daftarKendaraan()[0].tipe(), "Mobil");
        assertNotNull(pool.daftarKendaraan()[0].plat(), plat1);

        String plat2 = "BL222";
        Becak becak = new Becak(plat2);
        pool = new Pool(new Kendaraan[] {mobil, becak});
        assertEquals(pool.jumlah(), 2);
        assertNotNull(pool.daftarKendaraan());
        assertEquals(pool.daftarKendaraan().length, 2);
        assertNotNull(pool.daftarKendaraan()[0]);
        assertNotNull(pool.daftarKendaraan()[0].tipe(), "Mobil");
        assertNotNull(pool.daftarKendaraan()[0].plat(), plat1);
        assertNotNull(pool.daftarKendaraan()[1]);
        assertNotNull(pool.daftarKendaraan()[1].tipe(), "Becak");
        assertNotNull(pool.daftarKendaraan()[1].plat(), plat2);

        String plat3 = "BL333";
        SepedaMotor sepedaMotor = new SepedaMotor(plat3);
        pool = new Pool(new Kendaraan[] {mobil, becak, sepedaMotor});
        assertEquals(pool.jumlah(), 3);
        assertNotNull(pool.daftarKendaraan());
        assertEquals(pool.daftarKendaraan().length, 3);
        assertNotNull(pool.daftarKendaraan()[0]);
        assertNotNull(pool.daftarKendaraan()[0].tipe(), "Mobil");
        assertNotNull(pool.daftarKendaraan()[0].plat(), plat1);
        assertNotNull(pool.daftarKendaraan()[1]);
        assertNotNull(pool.daftarKendaraan()[1].tipe(), "Becak");
        assertNotNull(pool.daftarKendaraan()[1].plat(), plat2);
        assertNotNull(pool.daftarKendaraan()[2]);
        assertNotNull(pool.daftarKendaraan()[2].tipe(), "SepedaMotor");
        assertNotNull(pool.daftarKendaraan()[2].plat(), plat3);
    }
}