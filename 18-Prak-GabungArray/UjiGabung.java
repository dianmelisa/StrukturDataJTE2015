import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UjiGabung {
    public UjiGabung() { }

    @Before
    public void setUp() { }

    @After
    public void tearDown() { }
    
    @Test
    public void gabungKeduaArrayKosong() {
        int[] hasil = new Gabung().gabung(new int[]{}, new int[]{});
        assertEquals(hasil.length, 0);
        
    }
    
    @Test
    public void gabungArrayKeduaKosong() {
        int[] hasil = new Gabung().gabung(pertama, new int[]{});
        assertEquals(hasil.length, pertama.length);
        for (int cnt = 0; cnt < pertama.length; ++cnt)
            assertEquals(hasil[cnt], pertama[cnt]);
    }
    
    @Test
    public void gabungArrayPertamaKosong() {
        int[] hasil = new Gabung().gabung(new int[]{}, kedua);
        assertEquals(hasil.length, kedua.length);
        for (int cnt = 0; cnt < kedua.length; ++cnt)
            assertEquals(hasil[cnt], kedua[cnt]);
    }
    
    @Test
    public void gabung() {
        int[] hasil = new Gabung().gabung(pertama, kedua);
        assertEquals(hasil.length, pertama.length + kedua.length);
        for (int cnt = 0; cnt < pertama.length; ++cnt)
            assertEquals(hasil[cnt], pertama[cnt]);

        for (int cnt = 0; cnt < kedua.length; ++cnt)
            assertEquals(hasil[pertama.length + cnt], kedua[cnt]);
    }
    
    private int[] pertama = {9, 8, 7, 6};
    private int[] kedua = {1, 2, 3, 4, 5};    
}
