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
       nodeBaru.berikut = atas;
       atas = nodeBaru;
       size = size.add(BigInteger.ONE);
       
       /**
       if(bawah ==null && atas == null)
            bawah=atas;
       else{
           Node nodeBaru = new Node(data);
           Node sekarang = atas;
           while (sekarang.berikut !=null)
                sekarang = sekarang.berikut;
                sekarang.berikut = atas;
          
           size = size.add(BigInteger.ONE);
           dd
       } **/
       
       
       
       
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
