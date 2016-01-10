import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

public class UjiTumpukan {
    public UjiTumpukan() { }

    @Before
    public void setUp() { }

    @After
    public void tearDown() { }
    
    @Test
    public void tumpukkanKosong() {
        tumpukan = new Tumpukan();
        
        // uji
        assertNotNull(tumpukan);
        assertNull(tumpukan.atas());
        assertNull(tumpukan.bawah());
    }

    @Test
    public void tumpuk() {
        BigInteger data1 = new BigInteger("123");
        BigInteger data2 = new BigInteger("456");
        BigInteger data3 = new BigInteger("789");
        tumpukan = new Tumpukan();
        
        // uji
        assertNotNull(tumpukan);
        assertNull(tumpukan.atas());
        assertNull(tumpukan.bawah());

        // Tumpuk 1 
        tumpukan.tumpuk(data1);
        // Uji
        assertNotNull(tumpukan);
        assertNotNull(tumpukan.atas());
        assertNotNull(tumpukan.bawah());
        assertEquals(tumpukan.atas(), tumpukan.bawah());
        assertEquals(tumpukan.atas().toString(), data1.toString());

        // Tumpuk 1 lagi menjadi 2
        tumpukan.tumpuk(data2);
        // Uji
        assertNotNull(tumpukan);
        assertNotNull(tumpukan.atas());
        assertNotNull(tumpukan.bawah());
        assertEquals(tumpukan.atas().toString(), data2.toString());
        assertEquals(tumpukan.bawah().toString(), data1.toString());

        // Tumpuk 1 lagi menjadi 3
        tumpukan.tumpuk(data3);
        // Uji
        assertNotNull(tumpukan);
        assertNotNull(tumpukan.atas());
        assertNotNull(tumpukan.bawah());
        assertEquals(tumpukan.atas().toString(), data3.toString());
        assertEquals(tumpukan.bawah().toString(), data1.toString());
    }
        
    @Test
    public void ambil() {
        BigInteger data1 = new BigInteger("123");
        BigInteger data2 = new BigInteger("456");
        BigInteger data3 = new BigInteger("789");
        tumpukan = new Tumpukan();
        tumpukan.tumpuk(data3);
        tumpukan.tumpuk(data2);
        tumpukan.tumpuk(data1);
        
        // Uji
        assertNotNull(tumpukan);
        assertNotNull(tumpukan.atas());
        assertNotNull(tumpukan.bawah());
        assertEquals(tumpukan.atas().toString(), data1.toString());
        assertEquals(tumpukan.bawah().toString(), data3.toString());
        
        // Ambil 1, menjadi 2
        BigInteger ambilan = tumpukan.ambil();
        // Uji
        assertNotNull(ambilan);
        assertEquals(ambilan.toString(), data1.toString());
        assertNotNull(tumpukan);
        assertNotNull(tumpukan.atas());
        assertNotNull(tumpukan.bawah());
        assertEquals(tumpukan.atas().toString(), data2.toString());
        assertEquals(tumpukan.bawah().toString(), data3.toString());

        // Ambil 1, menjadi 1
        ambilan = tumpukan.ambil();
        // Uji
        assertNotNull(ambilan);
        assertEquals(ambilan.toString(), data2.toString());
        assertNotNull(tumpukan);
        assertNotNull(tumpukan.atas());
        assertNotNull(tumpukan.bawah());
        assertEquals(tumpukan.atas(), tumpukan.bawah());
        assertEquals(tumpukan.atas().toString(), data3.toString());

        // Ambil 1, menjadi 0
        ambilan = tumpukan.ambil();
        // Uji
        assertNotNull(ambilan);
        assertEquals(ambilan.toString(), data3.toString());
        assertNotNull(tumpukan);
        assertNull(tumpukan.atas());
        assertNull(tumpukan.bawah());
    }
    
    @Test
    public void ambilDariTumpukanKosong() {
        tumpukan = new Tumpukan();

        // Uji
        assertNotNull(tumpukan);
        assertNull(tumpukan.atas());
        assertNull(tumpukan.bawah());

        // Ambil dari tumpukan kosong
        BigInteger ambilan = tumpukan.ambil();
        // uji
        assertNull(ambilan);
        assertNotNull(tumpukan);
        assertNull(tumpukan.atas());
        assertNull(tumpukan.bawah());
    }

    private Tumpukan tumpukan;
    
}
