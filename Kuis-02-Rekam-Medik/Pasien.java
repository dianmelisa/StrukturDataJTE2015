public class Pasien
{
   Pemeriksaan[] pemeriksaan;
   String nama;
   
   public Pasien(String nama){
       this.nama=nama;
   }
    
   public Pemeriksaan[] getPemeriksaan(Pemeriksaan[] pemeriksaan){
       return pemeriksaan;
   }
}
