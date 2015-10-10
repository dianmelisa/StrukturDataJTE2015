import java.util.Date;

public class Pemeriksaan
{
   Catatan[] catatan;
   Date tanggalPemeriksaan;
   Resep[] obat;
   
   public Pemeriksaan(Date tanggalPemeriksaan, Catatan[] catatan, Resep[] obat){
       this.tanggalPemeriksaan=tanggalPemeriksaan;
       this.catatan=catatan;
       this.obat=obat;
   }
       
}
