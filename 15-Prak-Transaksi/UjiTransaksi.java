import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.math.BigInteger;

public class UjiTransaksi {
    public UjiTransaksi() { }

    @Before
    public void setUp() { 
        this.kapan = new Date();
    }

    @After
    public void tearDown() { }
    
    @Test
    public void consructorDefault() {
        transaksi = new Transaksi();
        assertNotNull(transaksi);
        assertEquals(transaksi.debitStr(), "0");
        assertEquals(transaksi.kreditStr(), "0");
        assertNotNull(transaksi.debit());
        assertTrue(transaksi.debit() instanceof BigInteger);
        assertEquals(transaksi.debit().toString(), "0");
        assertNotNull(transaksi.kredit());
        assertTrue(transaksi.kredit() instanceof BigInteger);
        assertEquals(transaksi.kredit().toString(), "0");
    }
    
    @Test
    public void consructorString() {
        transaksi = new Transaksi(kapan, debitStr, kreditStr);
        assertNotNull(transaksi);
        assertEquals(transaksi.debitStr(), debitStr);
        assertEquals(transaksi.kreditStr(), kreditStr);
        assertNotNull(transaksi.debit());
        assertTrue(transaksi.debit() instanceof BigInteger);
        assertEquals(transaksi.debit().toString(), debitStr);
        assertNotNull(transaksi.kredit());
        assertTrue(transaksi.kredit() instanceof BigInteger);
        assertEquals(transaksi.kredit().toString(), kreditStr);
    }
    
    @Test
    public void consructorPrimitive() {
        transaksi = new Transaksi(kapan, Long.valueOf(debitStr), Long.valueOf(kreditStr));
        assertNotNull(transaksi);
        assertEquals(transaksi.debitStr(), debitStr);
        assertEquals(transaksi.kreditStr(), kreditStr);
        assertNotNull(transaksi.debit());
        assertTrue(transaksi.debit() instanceof BigInteger);
        assertEquals(transaksi.debit().toString(), debitStr);
        assertNotNull(transaksi.kredit());
        assertTrue(transaksi.kredit() instanceof BigInteger);
        assertEquals(transaksi.kredit().toString(), kreditStr);
    }
    
    @Test
    public void kapan() {
        transaksi = new Transaksi(kapan, debitStr, kreditStr);
        assertNotNull(transaksi);
        assertNotNull(transaksi.kapan());
        assertTrue(transaksi.kapan() instanceof Date);
        assertEquals(transaksi.kapan().toString(), kapan.toString());
    }
    
    @Test
    public void debit() {
        transaksi = new Transaksi(kapan, debitStr, kreditStr);
        assertNotNull(transaksi);
        assertNotNull(transaksi.debit());
        assertTrue(transaksi.debit() instanceof BigInteger);
        assertEquals(transaksi.debit().toString(), debitStr);
        assertEquals(transaksi.debitStr(), debitStr);
    }
    
    @Test
    public void kredit() {
        transaksi = new Transaksi(kapan, debitStr, kreditStr);
        assertNotNull(transaksi);
        assertNotNull(transaksi.kredit());
        assertTrue(transaksi.kredit() instanceof BigInteger);
        assertEquals(transaksi.kreditStr(), kreditStr);
    }
    
    private String debitStr = "123";
    private String kreditStr = "456";
    private Date kapan;
    private Transaksi transaksi;
}
