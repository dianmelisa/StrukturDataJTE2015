import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test untuk package Gambar.
 */
public class BendaBulatTest {
    @Before
    public void setUp() { }

    @After
    public void tearDown() { }
    
    @Test
    public void bendaBulat() {
        BendaBulat bendaBulat = new BendaBulat();
        
        assertTrue(bendaBulat instanceof BendaBulat);
        assertFalse(bendaBulat instanceof Lingkaran);
        assertFalse(bendaBulat instanceof Elips);
        
        assertEquals(bendaBulat.tipe(), "BendaBulat");
    }

    @Test
    public void lingkaran() {
        double radius = 5.67;
        Lingkaran lingkaran = new Lingkaran(radius);
        
        assertTrue(lingkaran instanceof BendaBulat);
        assertTrue(lingkaran instanceof Lingkaran);
        
        assertEquals(lingkaran.tipe(), "Lingkaran");
        assertEquals(lingkaran.radius(), radius, 0.01);
    }

    @Test
    public void elips() {
        double radiusPendek = 5.67;
        double radiusPanjang = 8.91;
        Elips elips = new Elips(radiusPendek, radiusPanjang);
        
        assertTrue(elips instanceof BendaBulat);
        assertTrue(elips instanceof Elips);
        
        assertEquals(elips.tipe(), "Elips");
        assertEquals(elips.radiusPendek(), radiusPendek, 0.01);
        assertEquals(elips.radiusPanjang(), radiusPanjang, 0.01);
    }
    
    @Test
    public void KeranjangBendaBulat() {
        double radius1 = 5.67;
        Lingkaran lingkaran1 = new Lingkaran(radius1);
        double radiusPendek1 = 5.67;
        double radiusPanjang1 = 8.91;
        Elips elips1 = new Elips(radiusPendek1, radiusPanjang1);
        
        KeranjangBendaBulat keranjang = new KeranjangBendaBulat(new BendaBulat[0]);
        assertTrue(keranjang instanceof KeranjangBendaBulat);
        assertEquals(keranjang.jumlah(), 0);
        BendaBulat[] isi = keranjang.isi();
        assertNotNull(isi);
        assertEquals(isi.length, 0);
        
        keranjang = new KeranjangBendaBulat(new BendaBulat[] {lingkaran1});
        assertTrue(keranjang instanceof KeranjangBendaBulat);
        assertEquals(keranjang.jumlah(), 1);
        isi = keranjang.isi();
        assertNotNull(isi);
        assertEquals(isi.length, 1);
        assertNotNull(isi[0]);
        assertTrue(isi[0] instanceof BendaBulat);
        assertTrue(isi[0] instanceof Lingkaran);
        assertFalse(isi[0] instanceof Elips);
        assertEquals(((Lingkaran) isi[0]).radius(), radius1, 0.01);

        keranjang = new KeranjangBendaBulat(new BendaBulat[] {lingkaran1, elips1});
        assertTrue(keranjang instanceof KeranjangBendaBulat);
        assertEquals(keranjang.jumlah(), 2);
        isi = keranjang.isi();
        assertNotNull(isi);
        assertEquals(isi.length, 2);
        assertNotNull(isi[0]);
        assertTrue(isi[0] instanceof BendaBulat);
        assertTrue(isi[0] instanceof Lingkaran);
        assertFalse(isi[0] instanceof Elips);
        assertEquals(((Lingkaran) isi[0]).radius(), radius1, 0.01);
        assertNotNull(isi[1]);
        assertTrue(isi[1] instanceof BendaBulat);
        assertFalse(isi[1] instanceof Lingkaran);
        assertTrue(isi[1] instanceof Elips);
        assertEquals(((Elips) isi[1]).radiusPendek(), radiusPendek1, 0.01);
        assertEquals(((Elips) isi[1]).radiusPanjang(), radiusPanjang1, 0.01);
    }
}