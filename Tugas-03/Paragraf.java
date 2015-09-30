
/**
 * Write a description of class Paragraf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paragraf
{
    String isiParagraf = "", paragraf1 = "", paragraf2 ="" ;
   int jumlahKalimat;
   private Kalimat kalimat1;
   
   public String tampilkan(){
       return isiParagraf;
   }
   
   public String tampilkanUnit(int paragrafPertama){
       return paragraf1;
   }
   
   public int jumlahUnit(){
       return jumlahKalimat;
   }
   
   public Kalimat ambilUnit(int kalimatPertama){
       return kalimat1;
   }
}
