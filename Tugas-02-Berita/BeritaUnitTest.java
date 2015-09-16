import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class BeritaUnitTest {
    /**
     * Default constructor for test class BeritaUnitTest
     */
    public BeritaUnitTest() { }

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
    public void penulis() {
        Penulis penulis = new Penulis(namaLengkap1);
        assertEquals(penulis.namaLengkap, namaLengkap1);
    }
    
    @Test
    public void berita0PenulisTanpJudul() {
        Berita berita = new Berita(null, null);
        assertNotNull(berita);
        assertNull(berita.judul());
        assertNull(berita.daftarPenulis());
    }
    
    @Test
    public void berita0Penulis() {
        Berita berita = new Berita(judul1, null);
        assertNotNull(berita);
        assertEquals(berita.judul(), judul1);
        assertNull(berita.daftarPenulis());
    }
    
    @Test
    public void berita1Penulis() {
        Penulis[] daftarPenulis = {new Penulis(namaLengkap1)};
        
        Berita berita = new Berita(judul1, daftarPenulis);
        assertNotNull(berita);
        assertEquals(berita.judul(), judul1);
        assertNotNull(berita.daftarPenulis());
        assertEquals(berita.daftarPenulis().length, 1);
        assertNotNull(berita.daftarPenulis()[0]);
        assertNotNull(berita.daftarPenulis()[0].namaLengkap);
        assertEquals(berita.daftarPenulis()[0].namaLengkap, namaLengkap1);
    }
    
    @Test
    public void berita2Penulis() {
        Penulis[] daftarPenulis = {new Penulis(namaLengkap1),
                                   new Penulis(namaLengkap2)};
        
        Berita berita = new Berita(judul1, daftarPenulis);
        assertNotNull(berita);
        assertEquals(berita.judul(), judul1);
        assertNotNull(berita.daftarPenulis());
        assertEquals(berita.daftarPenulis().length, 2);
        assertNotNull(berita.daftarPenulis()[0]);
        assertNotNull(berita.daftarPenulis()[0].namaLengkap);
        assertEquals(berita.daftarPenulis()[0].namaLengkap, namaLengkap1);
        assertNotNull(berita.daftarPenulis()[1]);
        assertNotNull(berita.daftarPenulis()[1].namaLengkap);
        assertEquals(berita.daftarPenulis()[1].namaLengkap, namaLengkap2);
    }
    
    @Test
    public void berita3Penulis() {
        Penulis[] daftarPenulis = {new Penulis(namaLengkap1),
                                   new Penulis(namaLengkap2),
                                   new Penulis(namaLengkap3)};
        
        Berita berita = new Berita(judul1, daftarPenulis);
        assertNotNull(berita);
        assertEquals(berita.judul(), judul1);
        assertNotNull(berita.daftarPenulis());
        assertEquals(berita.daftarPenulis().length, 3);
        assertNotNull(berita.daftarPenulis()[0]);
        assertNotNull(berita.daftarPenulis()[0].namaLengkap);
        assertEquals(berita.daftarPenulis()[0].namaLengkap, namaLengkap1);
        assertNotNull(berita.daftarPenulis()[1]);
        assertNotNull(berita.daftarPenulis()[1].namaLengkap);
        assertEquals(berita.daftarPenulis()[1].namaLengkap, namaLengkap2);
        assertNotNull(berita.daftarPenulis()[2]);
        assertNotNull(berita.daftarPenulis()[2].namaLengkap);
        assertEquals(berita.daftarPenulis()[2].namaLengkap, namaLengkap3);
    }
    
    @Test
    public void tulisanTanpaIsi() {
        Tulisan tulisan = new Tulisan(null);
        assertTrue(tulisan instanceof Berita);
        assertTrue(tulisan instanceof Tulisan);
        assertNotNull(tulisan);
        assertNull(tulisan.isi());
        
    }
    
    @Test
    public void tulisan() {
        Tulisan tulisan = new Tulisan(isi1);
        assertNotNull(tulisan);
        assertNull(tulisan.judul());
        assertNull(tulisan.daftarPenulis());
        assertNotNull(tulisan.isi());
        assertEquals(tulisan.isi(), isi1);
    }
    
    @Test
    public void multimedia() {
        Multimedia multimedia = new Multimedia();
        assertTrue(multimedia instanceof Berita);
        assertTrue(multimedia instanceof Multimedia);
        assertNull(multimedia.judul());
        assertNull(multimedia.daftarPenulis());
        assertEquals(multimedia.durasi(), -1);
        assertEquals(multimedia.format(), -1);
    }
    
    @Test
    public void audio() {
        Audio audio = new Audio();
        assertTrue(audio instanceof Berita);
        assertTrue(audio instanceof Multimedia);
        assertTrue(audio instanceof Audio);
        assertNull(audio.judul());
        assertNull(audio.daftarPenulis());
        assertEquals(audio.durasi(), -1);
        assertEquals(audio.format(), -1);
    }
    
    private String namaLengkap1 = "Penulis 1";
    @Test
    public void video() {
        Video video = new Video();
        assertTrue(video instanceof Berita);
        assertTrue(video instanceof Multimedia);
        assertTrue(video instanceof Video);
        assertNull(video.judul());
        assertNull(video.daftarPenulis());
        assertEquals(video.durasi(), -1);
        assertEquals(video.format(), -1);
    }
    
    @Test
    public void siaranTanpaTanggal0Berita() {
        Siaran siaran = new Siaran(null, null);
        assertNotNull(siaran);
        assertNull(siaran.tanggal());
        assertNull(siaran.daftarBerita());
    }
    
    @Test
    public void siaran0Berita() {
        Date tanggal = new Date();
        
        Siaran siaran = new Siaran(tanggal, null);
        assertNotNull(siaran);
        assertNotNull(siaran.tanggal());
        assertEquals(siaran.tanggal(), tanggal);
        assertNull(siaran.daftarBerita());
    }
    
    @Test
    public void siaran1Berita() {
        Date tanggal = new Date();

        Penulis[] daftarPenulis = {new Penulis(namaLengkap1),
                                   new Penulis(namaLengkap2)};
        
        Berita[] berita = {new Berita(judul1, daftarPenulis)};
        
        Siaran siaran = new Siaran(tanggal, berita);
        assertNotNull(siaran);
        assertNotNull(siaran.tanggal());
        assertEquals(siaran.tanggal(), tanggal);
        assertNotNull(siaran.daftarBerita());
        assertEquals(siaran.daftarBerita().length, 1);
        assertNotNull(siaran.daftarBerita()[0]);
        assertNotNull(siaran.daftarBerita()[0].judul());
        assertEquals(siaran.daftarBerita()[0].judul(), judul1);
        assertNotNull(siaran.daftarBerita()[0].daftarPenulis());
        assertEquals(siaran.daftarBerita()[0].daftarPenulis().length, 2);
        assertNotNull(siaran.daftarBerita()[0].daftarPenulis()[0]);
        assertNotNull(siaran.daftarBerita()[0].daftarPenulis()[0].namaLengkap);
        assertEquals(siaran.daftarBerita()[0].daftarPenulis()[0].namaLengkap, namaLengkap1);
        assertNotNull(siaran.daftarBerita()[0].daftarPenulis()[1]);
        assertNotNull(siaran.daftarBerita()[0].daftarPenulis()[1].namaLengkap);
        assertEquals(siaran.daftarBerita()[0].daftarPenulis()[1].namaLengkap, namaLengkap2);
    }
    
    @Test
    public void siaran2Berita() {
        Date tanggal = new Date();

        Penulis[] daftarPenulis1 = {new Penulis(namaLengkap1),
                                    new Penulis(namaLengkap2)};
        Penulis[] daftarPenulis2 = {new Penulis(namaLengkap2),
                                    new Penulis(namaLengkap3)};
        
        Berita[] berita = {new Berita(judul1, daftarPenulis1),
                           new Berita(judul2, daftarPenulis2)};
        
        Siaran siaran = new Siaran(tanggal, berita);
        assertNotNull(siaran);
        assertNotNull(siaran.tanggal());
        assertEquals(siaran.tanggal(), tanggal);
        assertNotNull(siaran.daftarBerita());
        assertEquals(siaran.daftarBerita().length, 2);
        assertNotNull(siaran.daftarBerita()[0]);
        assertNotNull(siaran.daftarBerita()[0].judul());
        assertEquals(siaran.daftarBerita()[0].judul(), judul1);
        assertNotNull(siaran.daftarBerita()[0].daftarPenulis());
        assertEquals(siaran.daftarBerita()[0].daftarPenulis().length, 2);
        assertNotNull(siaran.daftarBerita()[0].daftarPenulis()[0]);
        assertNotNull(siaran.daftarBerita()[0].daftarPenulis()[0].namaLengkap);
        assertEquals(siaran.daftarBerita()[0].daftarPenulis()[0].namaLengkap, namaLengkap1);
        assertNotNull(siaran.daftarBerita()[0].daftarPenulis()[1]);
        assertNotNull(siaran.daftarBerita()[0].daftarPenulis()[1].namaLengkap);
        assertEquals(siaran.daftarBerita()[0].daftarPenulis()[1].namaLengkap, namaLengkap2);
        assertNotNull(siaran.daftarBerita()[1]);
        assertNotNull(siaran.daftarBerita()[1].judul());
        assertEquals(siaran.daftarBerita()[1].judul(), judul2);
        assertNotNull(siaran.daftarBerita()[1].daftarPenulis()[0]);
        assertNotNull(siaran.daftarBerita()[1].daftarPenulis()[0].namaLengkap);
        assertEquals(siaran.daftarBerita()[1].daftarPenulis()[0].namaLengkap, namaLengkap2);
        assertNotNull(siaran.daftarBerita()[1].daftarPenulis()[1]);
        assertNotNull(siaran.daftarBerita()[1].daftarPenulis()[1].namaLengkap);
        assertEquals(siaran.daftarBerita()[1].daftarPenulis()[1].namaLengkap, namaLengkap3);
    }
    
    @Test
    public void siaran3Berita() {
        Date tanggal = new Date();

        Penulis[] daftarPenulis1 = {new Penulis(namaLengkap1),
                                    new Penulis(namaLengkap2)};
        Penulis[] daftarPenulis2 = {new Penulis(namaLengkap2),
                                    new Penulis(namaLengkap3)};
        Penulis[] daftarPenulis3 = {new Penulis(namaLengkap1),
                                    new Penulis(namaLengkap3)};
        
        Berita[] berita = {new Berita(judul1, daftarPenulis1),
                           new Berita(judul2, daftarPenulis2),
                           new Berita(judul3, daftarPenulis3)};
        
        Siaran siaran = new Siaran(tanggal, berita);
        assertNotNull(siaran);
        assertNotNull(siaran.tanggal());
        assertEquals(siaran.tanggal(), tanggal);
        assertNotNull(siaran.daftarBerita());
        assertEquals(siaran.daftarBerita().length, 3);
        assertNotNull(siaran.daftarBerita()[0]);
        assertNotNull(siaran.daftarBerita()[0].judul());
        assertEquals(siaran.daftarBerita()[0].judul(), judul1);
        assertNotNull(siaran.daftarBerita()[0].daftarPenulis());
        assertEquals(siaran.daftarBerita()[0].daftarPenulis().length, 2);
        assertNotNull(siaran.daftarBerita()[0].daftarPenulis()[0]);
        assertNotNull(siaran.daftarBerita()[0].daftarPenulis()[0].namaLengkap);
        assertEquals(siaran.daftarBerita()[0].daftarPenulis()[0].namaLengkap, namaLengkap1);
        assertNotNull(siaran.daftarBerita()[0].daftarPenulis()[1]);
        assertNotNull(siaran.daftarBerita()[0].daftarPenulis()[1].namaLengkap);
        assertEquals(siaran.daftarBerita()[0].daftarPenulis()[1].namaLengkap, namaLengkap2);
        assertNotNull(siaran.daftarBerita()[1]);
        assertNotNull(siaran.daftarBerita()[1].judul());
        assertEquals(siaran.daftarBerita()[1].judul(), judul2);
        assertNotNull(siaran.daftarBerita()[1].daftarPenulis()[0]);
        assertNotNull(siaran.daftarBerita()[1].daftarPenulis()[0].namaLengkap);
        assertEquals(siaran.daftarBerita()[1].daftarPenulis()[0].namaLengkap, namaLengkap2);
        assertNotNull(siaran.daftarBerita()[1].daftarPenulis()[1]);
        assertNotNull(siaran.daftarBerita()[1].daftarPenulis()[1].namaLengkap);
        assertEquals(siaran.daftarBerita()[1].daftarPenulis()[1].namaLengkap, namaLengkap3);
        assertNotNull(siaran.daftarBerita()[2]);
        assertNotNull(siaran.daftarBerita()[2].judul());
        assertEquals(siaran.daftarBerita()[2].judul(), judul3);
        assertNotNull(siaran.daftarBerita()[2].daftarPenulis());
        assertEquals(siaran.daftarBerita()[2].daftarPenulis().length, 2);
        assertNotNull(siaran.daftarBerita()[2].daftarPenulis()[0]);
        assertNotNull(siaran.daftarBerita()[2].daftarPenulis()[0].namaLengkap);
        assertEquals(siaran.daftarBerita()[2].daftarPenulis()[0].namaLengkap, namaLengkap1);
        assertNotNull(siaran.daftarBerita()[2].daftarPenulis()[1]);
        assertNotNull(siaran.daftarBerita()[2].daftarPenulis()[1].namaLengkap);
        assertEquals(siaran.daftarBerita()[2].daftarPenulis()[1].namaLengkap, namaLengkap3);
    }
    
    @Test
    public void podcastTanpaTanggal0Audio() {
        Podcast podcast = new Podcast(null, null);
        assertTrue(podcast instanceof Siaran);
        assertTrue(podcast instanceof Podcast);
        assertNotNull(podcast);
        assertNull(podcast.tanggal());
        assertNull(podcast.daftarBerita());
    }
    
    @Test
    public void podcast0Audio() {
        Date tanggal = new Date();
        
        Podcast podcast = new Podcast(tanggal, null);
        assertNotNull(podcast);
        assertNotNull(podcast.tanggal());
        assertEquals(podcast.tanggal(), tanggal);
        assertNull(podcast.daftarBerita());
    }
    
    @Test
    public void podcast1Audio() {
        Date tanggal = new Date();

        Audio[] audio = {new Audio()};
        
        Podcast podcast = new Podcast(tanggal, audio);
        assertNotNull(podcast);
        assertNotNull(podcast.tanggal());
        assertEquals(podcast.tanggal(), tanggal);
        assertNotNull(podcast.daftarBerita());
        assertEquals(podcast.daftarBerita().length, 1);
        assertNotNull(podcast.daftarBerita()[0]);
        assertTrue(podcast.daftarBerita()[0] instanceof Audio);
        assertNull(podcast.daftarBerita()[0].judul());
        assertNull(podcast.daftarBerita()[0].daftarPenulis());
    }
    
    @Test
    public void podcast2Audio() {
        Date tanggal = new Date();

        Audio[] audio = {new Audio(), new Audio()};
        
        Podcast podcast = new Podcast(tanggal, audio);
        assertNotNull(podcast);
        assertNotNull(podcast.tanggal());
        assertEquals(podcast.tanggal(), tanggal);
        assertNotNull(podcast.daftarBerita());
        assertEquals(podcast.daftarBerita().length, 2);
        assertNotNull(podcast.daftarBerita()[0]);
        assertTrue(podcast.daftarBerita()[0] instanceof Audio);
        assertNull(podcast.daftarBerita()[0].judul());
        assertNull(podcast.daftarBerita()[0].daftarPenulis());
        assertNotNull(podcast.daftarBerita()[1]);
        assertTrue(podcast.daftarBerita()[1] instanceof Audio);
        assertNull(podcast.daftarBerita()[1].judul());
        assertNull(podcast.daftarBerita()[1].daftarPenulis());
    }
    
    @Test
    public void podcast3Audio() {
        Date tanggal = new Date();

        Audio[] audio = {new Audio(), new Audio(), new Audio()};
        
        Podcast podcast = new Podcast(tanggal, audio);
        assertNotNull(podcast);
        assertNotNull(podcast.tanggal());
        assertEquals(podcast.tanggal(), tanggal);
        assertNotNull(podcast.daftarBerita());
        assertEquals(podcast.daftarBerita().length, 3);
        assertNotNull(podcast.daftarBerita()[0]);
        assertTrue(podcast.daftarBerita()[0] instanceof Audio);
        assertNull(podcast.daftarBerita()[0].judul());
        assertNull(podcast.daftarBerita()[0].daftarPenulis());
        assertNotNull(podcast.daftarBerita()[1]);
        assertTrue(podcast.daftarBerita()[1] instanceof Audio);
        assertNull(podcast.daftarBerita()[1].judul());
        assertNull(podcast.daftarBerita()[1].daftarPenulis());
        assertNotNull(podcast.daftarBerita()[2]);
        assertTrue(podcast.daftarBerita()[2] instanceof Audio);
        assertNull(podcast.daftarBerita()[2].judul());
        assertNull(podcast.daftarBerita()[2].daftarPenulis());
    }
    
    @Test
    public void videoPodcastTanpaTanggal0Video() {
        VideoPodcast videoPodcast = new VideoPodcast(null, null);
        assertTrue(videoPodcast instanceof Siaran);
        assertTrue(videoPodcast instanceof VideoPodcast);
        assertNotNull(videoPodcast);
        assertNull(videoPodcast.tanggal());
        assertNull(videoPodcast.daftarBerita());
    }
    
    @Test
    public void videoPodcast0Video() {
        Date tanggal = new Date();
        
        VideoPodcast videoPodcast = new VideoPodcast(tanggal, null);
        assertNotNull(videoPodcast);
        assertNotNull(videoPodcast.tanggal());
        assertEquals(videoPodcast.tanggal(), tanggal);
        assertNull(videoPodcast.daftarBerita());
    }
    
    @Test
    public void videoPodcast1Video() {
        Date tanggal = new Date();

        Video[] video = {new Video()};
        
        VideoPodcast videoPodcast = new VideoPodcast(tanggal, video);
        assertNotNull(videoPodcast);
        assertNotNull(videoPodcast.tanggal());
        assertEquals(videoPodcast.tanggal(), tanggal);
        assertNotNull(videoPodcast.daftarBerita());
        assertEquals(videoPodcast.daftarBerita().length, 1);
        assertNotNull(videoPodcast.daftarBerita()[0]);
        assertTrue(videoPodcast.daftarBerita()[0] instanceof Video);
        assertNull(videoPodcast.daftarBerita()[0].judul());
        assertNull(videoPodcast.daftarBerita()[0].daftarPenulis());
    }

    @Test
    public void videoPodcast2Video() {
        Date tanggal = new Date();

        Video[] video = {new Video(), new Video()};
        
        VideoPodcast videoPodcast = new VideoPodcast(tanggal, video);
        assertNotNull(videoPodcast);
        assertNotNull(videoPodcast.tanggal());
        assertEquals(videoPodcast.tanggal(), tanggal);
        assertNotNull(videoPodcast.daftarBerita());
        assertEquals(videoPodcast.daftarBerita().length, 2);
        assertNotNull(videoPodcast.daftarBerita()[0]);
        assertTrue(videoPodcast.daftarBerita()[0] instanceof Video);
        assertNull(videoPodcast.daftarBerita()[0].judul());
        assertNull(videoPodcast.daftarBerita()[0].daftarPenulis());
        assertNotNull(videoPodcast.daftarBerita()[1]);
        assertTrue(videoPodcast.daftarBerita()[1] instanceof Video);
        assertNull(videoPodcast.daftarBerita()[1].judul());
        assertNull(videoPodcast.daftarBerita()[1].daftarPenulis());
    }
    
    @Test
    public void videoPodcast3Video() {
        Date tanggal = new Date();

        Video[] video = {new Video(), new Video(), new Video()};
        
        VideoPodcast videoPodcast = new VideoPodcast(tanggal, video);
        assertNotNull(videoPodcast);
        assertNotNull(videoPodcast.tanggal());
        assertEquals(videoPodcast.tanggal(), tanggal);
        assertNotNull(videoPodcast.daftarBerita());
        assertEquals(videoPodcast.daftarBerita().length, 3);
        assertNotNull(videoPodcast.daftarBerita()[0]);
        assertTrue(videoPodcast.daftarBerita()[0] instanceof Video);
        assertNull(videoPodcast.daftarBerita()[0].judul());
        assertNull(videoPodcast.daftarBerita()[0].daftarPenulis());
        assertNotNull(videoPodcast.daftarBerita()[1]);
        assertTrue(videoPodcast.daftarBerita()[1] instanceof Video);
        assertNull(videoPodcast.daftarBerita()[1].judul());
        assertNull(videoPodcast.daftarBerita()[1].daftarPenulis());
        assertNotNull(videoPodcast.daftarBerita()[2]);
        assertTrue(videoPodcast.daftarBerita()[2] instanceof Video);
        assertNull(videoPodcast.daftarBerita()[2].judul());
        assertNull(videoPodcast.daftarBerita()[2].daftarPenulis());
    }
    
    private String namaLengkap2 = "Penulis 2";
    private String namaLengkap3 = "Penulis 3";
    
    private String judul1 = "Judul 1";
    private String judul2 = "Judul 2";
    private String judul3 = "Judul 3";
    
    private String isi1 = "Isi 1";
}
