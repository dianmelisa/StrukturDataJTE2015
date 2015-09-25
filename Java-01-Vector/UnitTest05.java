import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UnitTest05 {
    /**
     * Default constructor for test class UnitTest05
     */
    public UnitTest05() { }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() { 
        titikAcuan1 = new Vector3D(titikAcuanX1, titikAcuanY1, titikAcuanZ1);
        arah1 = new Vector3D(arahX1, arahY1, arahZ1);
        gaya1 = new Gaya(titikAcuan1, arah1);

        titikAcuan2 = new Vector3D(titikAcuanX2, titikAcuanY2, titikAcuanZ2);
        arah2 = new Vector3D(arahX2, arahY2, arahZ2);
        gaya2 = new Gaya(titikAcuan2, arah2);

        titikAcuan3 = new Vector3D(titikAcuanX3, titikAcuanY3, titikAcuanZ3);
        arah3 = new Vector3D(arahX3, arahY3, arahZ3);
        gaya3 = new Gaya(titikAcuan3, arah3);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() { }
    
    @Test
    public void constructorDefault() {
        FiniteElement finiteElement = new FiniteElement();
        assertNotNull(finiteElement);
        assertNull(finiteElement.daftarGaya());
    }

    @Test
    public void constructor1Gaya() {
        Gaya[] gaya = {gaya1};
        FiniteElement finiteElement = new FiniteElement(gaya);
        assertNotNull(finiteElement);
        assertNotNull(finiteElement.daftarGaya());
        assertEquals(finiteElement.daftarGaya().length, 1);
        assertNotNull(finiteElement.daftarGaya()[0]);
        assertNotNull(finiteElement.daftarGaya()[0].getArah());
        assertEquals(finiteElement.daftarGaya()[0].getArah().getX(), arah1.getX(), 0.01);
        assertEquals(finiteElement.daftarGaya()[0].getArah().getY(), arah1.getY(), 0.01);
        assertEquals(finiteElement.daftarGaya()[0].getArah().getZ(), arah1.getZ(), 0.01);
        assertNotNull(finiteElement.daftarGaya()[0].getTitikAcuan());
        assertEquals(finiteElement.daftarGaya()[0].getTitikAcuan().getX(), titikAcuan1.getX(), 0.01);
        assertEquals(finiteElement.daftarGaya()[0].getTitikAcuan().getY(), titikAcuan1.getY(), 0.01);
        assertEquals(finiteElement.daftarGaya()[0].getTitikAcuan().getZ(), titikAcuan1.getZ(), 0.01);
    }
    
    @Test
    public void constructor2Gaya() {
        Gaya[] gaya = {gaya1, gaya2};
        FiniteElement finiteElement = new FiniteElement(gaya);
        assertNotNull(finiteElement);
        assertNotNull(finiteElement.daftarGaya());
        assertEquals(finiteElement.daftarGaya().length, 2);
        assertNotNull(finiteElement.daftarGaya()[0]);
        assertNotNull(finiteElement.daftarGaya()[0].getArah());
        assertEquals(finiteElement.daftarGaya()[0].getArah().getX(), arah1.getX(), 0.01);
        assertEquals(finiteElement.daftarGaya()[0].getArah().getY(), arah1.getY(), 0.01);
        assertEquals(finiteElement.daftarGaya()[0].getArah().getZ(), arah1.getZ(), 0.01);
        assertNotNull(finiteElement.daftarGaya()[0].getTitikAcuan());
        assertEquals(finiteElement.daftarGaya()[0].getTitikAcuan().getX(), titikAcuan1.getX(), 0.01);
        assertEquals(finiteElement.daftarGaya()[0].getTitikAcuan().getY(), titikAcuan1.getY(), 0.01);
        assertEquals(finiteElement.daftarGaya()[0].getTitikAcuan().getZ(), titikAcuan1.getZ(), 0.01);
        assertNotNull(finiteElement.daftarGaya()[1]);
        assertNotNull(finiteElement.daftarGaya()[1].getArah());
        assertEquals(finiteElement.daftarGaya()[1].getArah().getX(), arah2.getX(), 0.01);
        assertEquals(finiteElement.daftarGaya()[1].getArah().getY(), arah2.getY(), 0.01);
        assertEquals(finiteElement.daftarGaya()[1].getArah().getZ(), arah2.getZ(), 0.01);
        assertNotNull(finiteElement.daftarGaya()[1].getTitikAcuan());
        assertEquals(finiteElement.daftarGaya()[1].getTitikAcuan().getX(), titikAcuan2.getX(), 0.01);
        assertEquals(finiteElement.daftarGaya()[1].getTitikAcuan().getY(), titikAcuan2.getY(), 0.01);
        assertEquals(finiteElement.daftarGaya()[1].getTitikAcuan().getZ(), titikAcuan2.getZ(), 0.01);
    }
    
    @Test
    public void constructor3Gaya() {
        Gaya[] gaya = {gaya1, gaya2, gaya3};
        FiniteElement finiteElement = new FiniteElement(gaya);
        assertNotNull(finiteElement);
        assertNotNull(finiteElement.daftarGaya());
        assertEquals(finiteElement.daftarGaya().length, 3);
        assertNotNull(finiteElement.daftarGaya()[0]);
        assertNotNull(finiteElement.daftarGaya()[0].getArah());
        assertEquals(finiteElement.daftarGaya()[0].getArah().getX(), arah1.getX(), 0.01);
        assertEquals(finiteElement.daftarGaya()[0].getArah().getY(), arah1.getY(), 0.01);
        assertEquals(finiteElement.daftarGaya()[0].getArah().getZ(), arah1.getZ(), 0.01);
        assertNotNull(finiteElement.daftarGaya()[0].getTitikAcuan());
        assertEquals(finiteElement.daftarGaya()[0].getTitikAcuan().getX(), titikAcuan1.getX(), 0.01);
        assertEquals(finiteElement.daftarGaya()[0].getTitikAcuan().getY(), titikAcuan1.getY(), 0.01);
        assertEquals(finiteElement.daftarGaya()[0].getTitikAcuan().getZ(), titikAcuan1.getZ(), 0.01);
        assertNotNull(finiteElement.daftarGaya()[1]);
        assertNotNull(finiteElement.daftarGaya()[1].getArah());
        assertEquals(finiteElement.daftarGaya()[1].getArah().getX(), arah2.getX(), 0.01);
        assertEquals(finiteElement.daftarGaya()[1].getArah().getY(), arah2.getY(), 0.01);
        assertEquals(finiteElement.daftarGaya()[1].getArah().getZ(), arah2.getZ(), 0.01);
        assertNotNull(finiteElement.daftarGaya()[1].getTitikAcuan());
        assertEquals(finiteElement.daftarGaya()[1].getTitikAcuan().getX(), titikAcuan2.getX(), 0.01);
        assertEquals(finiteElement.daftarGaya()[1].getTitikAcuan().getY(), titikAcuan2.getY(), 0.01);
        assertEquals(finiteElement.daftarGaya()[1].getTitikAcuan().getZ(), titikAcuan2.getZ(), 0.01);
        assertNotNull(finiteElement.daftarGaya()[2]);
        assertNotNull(finiteElement.daftarGaya()[2].getArah());
        assertEquals(finiteElement.daftarGaya()[2].getArah().getX(), arah3.getX(), 0.01);
        assertEquals(finiteElement.daftarGaya()[2].getArah().getY(), arah3.getY(), 0.01);
        assertEquals(finiteElement.daftarGaya()[2].getArah().getZ(), arah3.getZ(), 0.01);
        assertNotNull(finiteElement.daftarGaya()[2].getTitikAcuan());
        assertEquals(finiteElement.daftarGaya()[2].getTitikAcuan().getX(), titikAcuan3.getX(), 0.01);
        assertEquals(finiteElement.daftarGaya()[2].getTitikAcuan().getY(), titikAcuan3.getY(), 0.01);
        assertEquals(finiteElement.daftarGaya()[2].getTitikAcuan().getZ(), titikAcuan3.getZ(), 0.01);
    }
    
    private Gaya gaya1, gaya2, gaya3;
    
    private double titikAcuanX1 = 1.23;
    private double titikAcuanY1 = 4.56;
    private double titikAcuanZ1 = 7.89;
    private Vector3D titikAcuan1;

    private double titikAcuanX2 = 2.23;
    private double titikAcuanY2 = 5.56;
    private double titikAcuanZ2 = 8.89;
    private Vector3D titikAcuan2;
    
    private double titikAcuanX3 = 0.23;
    private double titikAcuanY3 = 3.56;
    private double titikAcuanZ3 = 6.89;
    private Vector3D titikAcuan3;

    private double arahX1 = 9.87;
    private double arahY1 = 6.54;
    private double arahZ1 = 3.21;
    private Vector3D arah1;

    private double arahX2 = 8.87;
    private double arahY2 = 5.54;
    private double arahZ2 = 2.21;
    private Vector3D arah2;

    private double arahX3 = 10.87;
    private double arahY3 = 7.54;
    private double arahZ3 = 4.21;
    private Vector3D arah3;
}
