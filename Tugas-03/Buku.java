
/**
 * Write a description of class Buku here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buku
{
   String isiBuku = "", buku1="", buku2 = "";
   int jumlahBab;
   private Bab bab1;
   
   public String tampilkan(){
       return isiBuku;
   }
   
   public String tampilkanUnit(int bukuPertama){
       return buku1;
   }
   
   public int jumlahUnit(){
       return jumlahBab;
   }
   
   public Bab ambilUnit(int babPertama){
       return bab1;
   }
}
