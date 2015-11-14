import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;

public class UjiDaftarTransaksi {
    public UjiDaftarTransaksi() { }

    @Before
    public void setUp() { }

    @After
    public void tearDown() { }
    
    @Test
    public void uji() {
        Date kapan = new Date();
        DaftarTransaksi daftar = new DaftarTransaksi();
        assertNotNull(daftar);
        assertTrue(daftar instanceof DaftarTransaksi);
                   
        // Masih kosong
        assertEquals(daftar.banyakTransaksi(), 0);
        BigInteger saldoAkhir = daftar.saldoAkhir();
        assertEquals(saldoAkhir.toString(), "0");
        assertEquals(daftar.saldoAkhirStr(), "0");        
        daftar.tampilkan();
        System.out.println();
        
        // Debit 4
        Transaksi transaksi = new Transaksi(kapan, "4", "0");
        daftar.tambah(transaksi);
        assertTrue(daftar instanceof DaftarTransaksi);
        assertEquals(daftar.banyakTransaksi(), 1);
        saldoAkhir = daftar.saldoAkhir();
        assertEquals(saldoAkhir.toString(), "4");
        assertEquals(daftar.saldoAkhirStr(), "4");        
        daftar.tampilkan();
        System.out.println();

        // Debit 3
        transaksi = new Transaksi(kapan, "3", "0");
        daftar.tambah(transaksi);
        assertTrue(daftar instanceof DaftarTransaksi);
        assertEquals(daftar.banyakTransaksi(), 2);
        saldoAkhir = daftar.saldoAkhir();
        assertEquals(saldoAkhir.toString(), "7");
        assertEquals(daftar.saldoAkhirStr(), "7");        
        daftar.tampilkan();
        System.out.println();

        // Kredit 2
        transaksi = new Transaksi(kapan, "0", "2");
        daftar.tambah(transaksi);
        assertTrue(daftar instanceof DaftarTransaksi);
        assertEquals(daftar.banyakTransaksi(), 3);
        saldoAkhir = daftar.saldoAkhir();
        assertEquals(saldoAkhir.toString(), "5");
        assertEquals(daftar.saldoAkhirStr(), "5");        
        daftar.tampilkan();
    }
}
