
/**
 * Write a description of class Berita here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Berita
{   
    public Berita(String judul, String[] Penulis){
        this.judul= judul;
        this.Penulis = Penulis;
    }
    
     public String judul(){
         return judul;
    }
    
    public String daftarPenulis (String Penulis){
        return Penulis;
    }   
    private String judul;
    private String[] Penulis;
}