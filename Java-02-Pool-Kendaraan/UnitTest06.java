import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class UnitTest06.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class UnitTest06 {
    /**
     * Default constructor for test class UnitTest06
     */
    public UnitTest06() { }

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
        assertEquals(mobil.plat(), plat);
        assertEquals(mobil.tipe(), "Mobil");
    }
    
    @Test
    public void pool() {
        Pool pool = new Pool(null);
        assertEquals(pool.jumlah(), 0);
        assertNotNull(pool.daftarKendaraan());
        assertEquals(pool.daftarKendaraan().length, 0);

        String plat1 = "BL111";
        Mobil mobil1 = new Mobil(plat1);
        pool = new Pool(new Mobil[] {mobil1});
        assertEquals(pool.jumlah(), 1);
        assertNotNull(pool.daftarKendaraan());
        assertEquals(pool.daftarKendaraan().length, 1);
        assertNotNull(pool.daftarKendaraan()[0]);
        assertNotNull(pool.daftarKendaraan()[0].tipe(), "Mobil");
        assertNotNull(pool.daftarKendaraan()[0].plat(), plat1);

        String plat2 = "BL222";
        Mobil mobil2 = new Mobil(plat2);
        pool = new Pool(new Mobil[] {mobil1, mobil2});
        assertEquals(pool.jumlah(), 2);
        assertNotNull(pool.daftarKendaraan());
        assertEquals(pool.daftarKendaraan().length, 2);
        assertNotNull(pool.daftarKendaraan()[0]);
        assertNotNull(pool.daftarKendaraan()[0].tipe(), "Mobil");
        assertNotNull(pool.daftarKendaraan()[0].plat(), plat1);
        assertNotNull(pool.daftarKendaraan()[1]);
        assertNotNull(pool.daftarKendaraan()[1].tipe(), "Mobil");
        assertNotNull(pool.daftarKendaraan()[1].plat(), plat2);

        String plat3 = "BL333";
        Mobil mobil3 = new Mobil(plat3);
        pool = new Pool(new Mobil[] {mobil1, mobil2, mobil3});
        assertEquals(pool.jumlah(), 3);
        assertNotNull(pool.daftarKendaraan());
        assertEquals(pool.daftarKendaraan().length, 3);
        assertNotNull(pool.daftarKendaraan()[0]);
        assertNotNull(pool.daftarKendaraan()[0].tipe(), "Mobil");
        assertNotNull(pool.daftarKendaraan()[0].plat(), plat1);
        assertNotNull(pool.daftarKendaraan()[1]);
        assertNotNull(pool.daftarKendaraan()[1].tipe(), "Mobil");
        assertNotNull(pool.daftarKendaraan()[1].plat(), plat2);
        assertNotNull(pool.daftarKendaraan()[2]);
        assertNotNull(pool.daftarKendaraan()[2].tipe(), "Mobil");
        assertNotNull(pool.daftarKendaraan()[2].plat(), plat3);
    }
}