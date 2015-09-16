import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Matriks2x2UnitTE.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Matriks2x2UnitTest {
    /**
     * Default constructor for test class Matriks2x2UnitTE
     */
    public Matriks2x2UnitTest() { }

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
    public void constructor() throws SalahIndeks {
        Matriks2x2 A = new Matriks2x2(a11, a12, a21, a22);
        assertEquals(A.elemen(1,1), a11);
        assertEquals(A.elemen(2,1), a21);
        assertEquals(A.elemen(1,2), a12);
        assertEquals(A.elemen(2,2), a22);
    }

    @Test
    public void elemen() throws SalahIndeks {
        Matriks2x2 A = new Matriks2x2(a11, a12, a21, a22);
        assertEquals(A.elemen(1,1), a11);
        assertEquals(A.elemen(2,1), a21);
        assertEquals(A.elemen(1,2), a12);
        assertEquals(A.elemen(2,2), a22);
    }

    @Test(expected=SalahIndeks.class)
    public void elemenSalahBaris() throws SalahIndeks {
        Matriks2x2 A = new Matriks2x2(a11, a12, a21, a22);
        A.elemen(3,1);
    }

    @Test(expected=SalahIndeks.class)
    public void elemenSalahKolom() throws SalahIndeks {
        Matriks2x2 A = new Matriks2x2(a11, a12, a21, a22);
        A.elemen(1, 3);
    }

    @Test
    public void tambah() throws SalahIndeks {
        Matriks2x2 A = new Matriks2x2(a11, a12, a21, a22);
        Matriks2x2 B = new Matriks2x2(b11, b12, b21, b22);
        Matriks2x2 C = A.tambah(B);
        
        assertEquals(C.elemen(1,1), a11 + b11);
        assertEquals(C.elemen(2,1), a21 + b21);
        assertEquals(C.elemen(1,2), a12 + b12);
        assertEquals(C.elemen(2,2), a22 + b22);
        
        // Uji immutable
        assertEquals(A.elemen(1,1), a11);
        assertEquals(A.elemen(2,1), a21);
        assertEquals(A.elemen(1,2), a12);
        assertEquals(A.elemen(2,2), a22);
        assertEquals(B.elemen(1,1), b11);
        assertEquals(B.elemen(2,1), b21);
        assertEquals(B.elemen(1,2), b12);
        assertEquals(B.elemen(2,2), b22);
    }

    @Test
    public void kurang() throws SalahIndeks {
        Matriks2x2 A = new Matriks2x2(a11, a12, a21, a22);
        Matriks2x2 B = new Matriks2x2(b11, b12, b21, b22);
        Matriks2x2 C = A.kurang(B);
        
        assertEquals(C.elemen(1,1), a11 - b11);
        assertEquals(C.elemen(2,1), a21 - b21);
        assertEquals(C.elemen(1,2), a12 - b12);
        assertEquals(C.elemen(2,2), a22 - b22);
        
        // Uji immutable
        assertEquals(A.elemen(1,1), a11);
        assertEquals(A.elemen(2,1), a21);
        assertEquals(A.elemen(1,2), a12);
        assertEquals(A.elemen(2,2), a22);
        assertEquals(B.elemen(1,1), b11);
        assertEquals(B.elemen(2,1), b21);
        assertEquals(B.elemen(1,2), b12);
        assertEquals(B.elemen(2,2), b22);
    }

    @Test
    public void kali() throws SalahIndeks {
        Matriks2x2 A = new Matriks2x2(a11, a12, a21, a22);
        Matriks2x2 B = new Matriks2x2(b11, b12, b21, b22);
        Matriks2x2 C = A.kali(B);
        
        assertEquals(C.elemen(1,1), a11 * b11 + a12 * b21);
        assertEquals(C.elemen(1,2), a11 * b12 + a12 * b22);
        assertEquals(C.elemen(2,1), a21 * b11 + a22 * b21);
        assertEquals(C.elemen(2,2), a21 * b12 + a22 * b22);
        
        // Uji immutable
        assertEquals(A.elemen(1,1), a11);
        assertEquals(A.elemen(2,1), a21);
        assertEquals(A.elemen(1,2), a12);
        assertEquals(A.elemen(2,2), a22);
        assertEquals(B.elemen(1,1), b11);
        assertEquals(B.elemen(2,1), b21);
        assertEquals(B.elemen(1,2), b12);
        assertEquals(B.elemen(2,2), b22);
    }
    
    @Test
    public void determinan() {
        Matriks2x2 A = new Matriks2x2(a11, a12, a21, a22);
        assertEquals(A.determinan(), -2.0, 0.01);

        Matriks2x2 B = new Matriks2x2(b11, b12, b21, b22);
        assertEquals(B.determinan(), -2.0, 0.01);

        Matriks2x2 C = new Matriks2x2(2, 2, 1, 1);
        assertEquals(C.determinan(), 0.0, 0.01);
    }
    
    @Test
    public void inverse() throws TanpaInverse, SalahIndeks {
        Matriks2x2 A = new Matriks2x2(a11, a12, a21, a22);
        double detA = A.determinan();
        Matriks2x2 invA = A.inverse();
        // Uji
        assertEquals(invA.elemen(1,1), (int) (a22 / detA));
        assertEquals(invA.elemen(1,2), (int) (-a12 / detA));
        assertEquals(invA.elemen(2,1), (int) (-a21 / detA));
        assertEquals(invA.elemen(2,2), (int) (a11 / detA));
        // Uji immutable
        assertEquals(A.elemen(1,1), a11);
        assertEquals(A.elemen(2,1), a21);
        assertEquals(A.elemen(1,2), a12);
        assertEquals(A.elemen(2,2), a22);
    }

    @Test(expected=TanpaInverse.class)
    public void inverseSingular() throws TanpaInverse {
        Matriks2x2 C = new Matriks2x2(2, 2, 1, 1);
        assertEquals(C.determinan(), 0.0, 0.01);
        C.inverse();
    }

    private int a11 = 1, a12 = 2, 
                a21 = 3, a22 = 4;                
    private int b11 = 5, b12 = 6, 
                b21 = 7, b22 = 8;
}
