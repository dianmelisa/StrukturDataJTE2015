import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class UjiPrak22 {
    public UjiPrak22() { }

    @Before
    public void setUp() {
        ll = new LinkList();
    }

    @After
    public void tearDown() { }
    
    @Test
    public void kosong() {
        assertNull(ll.elemenKe(-3));
        assertNull(ll.elemenKe(-2));
        assertNull(ll.elemenKe(-1));
        assertNull(ll.elemenKe(0));
        assertNull(ll.elemenKe(1));
        assertNull(ll.elemenKe(2));
        assertNull(ll.elemenKe(3));
    }
    
    @Test
    public void satu() {
        Date kapan = new Date();
        Transaksi transaksi1 = new Transaksi(kapan, "1", "0");
        ll.tambah(transaksi1);
        
        assertNull(ll.elemenKe(-3));
        assertNull(ll.elemenKe(-2));
        assertNull(ll.elemenKe(-1));

        assertNotNull(ll.elemenKe(0));
        assertEquals(ll.elemenKe(0).data.kapan().toString(), kapan.toString());
        assertEquals(ll.elemenKe(0).data.debitStr(), transaksi1.debitStr());
        assertEquals(ll.elemenKe(0).data.kreditStr(), transaksi1.kreditStr());
        
        assertNull(ll.elemenKe(1));
        assertNull(ll.elemenKe(2));
        assertNull(ll.elemenKe(3));
    }
    
    @Test
    public void dua() {
        Date kapan = new Date();
        Transaksi transaksi1 = new Transaksi(kapan, "1", "0");
        ll.tambah(transaksi1);
        Transaksi transaksi2 = new Transaksi(kapan, "2", "0");
        ll.tambah(transaksi2);
        
        assertNull(ll.elemenKe(-3));
        assertNull(ll.elemenKe(-2));
        assertNull(ll.elemenKe(-1));

        assertNotNull(ll.elemenKe(0));
        assertEquals(ll.elemenKe(0).data.kapan().toString(), kapan.toString());
        assertEquals(ll.elemenKe(0).data.debitStr(), transaksi1.debitStr());
        assertEquals(ll.elemenKe(0).data.kreditStr(), transaksi1.kreditStr());
        
        assertNotNull(ll.elemenKe(1));
        assertEquals(ll.elemenKe(1).data.kapan().toString(), kapan.toString());
        assertEquals(ll.elemenKe(1).data.debitStr(), transaksi2.debitStr());
        assertEquals(ll.elemenKe(1).data.kreditStr(), transaksi2.kreditStr());

        assertNull(ll.elemenKe(2));
        assertNull(ll.elemenKe(3));
    }
    
    @Test
    public void tiga() {
        Date kapan = new Date();
        Transaksi transaksi1 = new Transaksi(kapan, "1", "0");
        ll.tambah(transaksi1);
        Transaksi transaksi2 = new Transaksi(kapan, "2", "0");
        ll.tambah(transaksi2);
        Transaksi transaksi3 = new Transaksi(kapan, "3", "0");
        ll.tambah(transaksi3);
        
        assertNull(ll.elemenKe(-3));
        assertNull(ll.elemenKe(-2));
        assertNull(ll.elemenKe(-1));

        assertNotNull(ll.elemenKe(0));
        assertEquals(ll.elemenKe(0).data.kapan().toString(), kapan.toString());
        assertEquals(ll.elemenKe(0).data.debitStr(), transaksi1.debitStr());
        assertEquals(ll.elemenKe(0).data.kreditStr(), transaksi1.kreditStr());
        
        assertNotNull(ll.elemenKe(1));
        assertEquals(ll.elemenKe(1).data.kapan().toString(), kapan.toString());
        assertEquals(ll.elemenKe(1).data.debitStr(), transaksi2.debitStr());
        assertEquals(ll.elemenKe(1).data.kreditStr(), transaksi2.kreditStr());

        assertNotNull(ll.elemenKe(2));
        assertEquals(ll.elemenKe(2).data.kapan().toString(), kapan.toString());
        assertEquals(ll.elemenKe(2).data.debitStr(), transaksi3.debitStr());
        assertEquals(ll.elemenKe(2).data.kreditStr(), transaksi3.kreditStr());

        assertNull(ll.elemenKe(3));
    }
    
    private LinkList ll;
}
