
/**
 * Write a description of class Bab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bab
{
   String isiBab = "", bab1="", bab2 = "";
   int jumlahParagraf;
   private Paragraf paragraf1;
   
   public String tampilkan(){
       return isiBab;
   }
   
   public String tampilkanUnit(int babPertama){
       return bab1;
   }
   
   public int jumlahUnit(){
       return jumlahParagraf;
   }
   
   public Paragraf ambilUnit(int paragrafPertama){
       return paragraf1;
   }
}
