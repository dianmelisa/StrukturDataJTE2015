/**
 * Ujian Final Struktur Data
 * diselesaikan dengan bantuan Reza Muttaqin
 * pada method tumpuk
 */

import java.math.BigInteger;
import java.util.ArrayList;

public class Tumpukan
{
   private Node atas;
   private Node bawah;
   BigInteger size = new BigInteger("0");
    
   public Tumpukan(){  
              
   }
    
   public void tumpuk(BigInteger data){ 
       Node nodeBaru = new Node(data);
       nodeBaru.berikut = null; 
       //cek sudah ada node sebelumny
       if(bawah == null && atas == null){
            bawah = nodeBaru;
            atas = nodeBaru;
       }
       //tumpuk ke atas
       else{          
           atas.berikut = atas;
           atas=nodeBaru;
        }
          // size = size.add(BigInteger.ONE);
   }
   
   public BigInteger ambil(){
       if(atas == null){
           return null;        
           
        }
        else{
            BigInteger hasil = atas.data;
            atas.berikut = atas;
            return size = size.subtract(BigInteger.ONE);
        }
            
    
   }
     
   public BigInteger atas(){
       return (atas != null) ? atas.data : null;
   }
   
   public BigInteger bawah(){
       return (bawah != null) ? bawah.data : null;
   }
   
   
}
