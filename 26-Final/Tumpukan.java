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
       //cek sudah ada node sebelumny
       if(bawah ==null && atas == null){
            bawah = nodeBaru;
            atas = nodeBaru;
       }
       else{
           while (atas.berikut !=null){
                atas = atas.berikut;
                atas.berikut = nodeBaru;
            }
          // size = size.add(BigInteger.ONE);
           
       } 
       
       
       
       
   }
   
   public BigInteger ambil(){
       if(atas == null){
           return null;        
        }
        else{
            BigInteger hasil = atas.data;
            atas = atas.berikut;
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
