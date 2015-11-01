import java.math.BigDecimal;

public class KoordinatGPS
{
    private BigDecimal lintang, bujur;
   
    
    public KoordinatGPS(){
       this.lintang = new BigDecimal("0");
       this.bujur = new BigDecimal("0");
        
    }
    
    public KoordinatGPS(double bujur, double lintang){
        this.bujur=new BigDecimal(Double.toString(bujur));
        this.lintang=new BigDecimal(Double.toString(lintang));
    }
    
    public KoordinatGPS(String bujur, String lintang){
        this.bujur= new BigDecimal(bujur);
        this.lintang= new BigDecimal(lintang);
    }
    
    public KoordinatGPS(BigDecimal bujur, BigDecimal lintang){
        this.bujur= bujur;
        this.lintang= lintang;
    }
    
    public String lintangStr(){
        return lintang.toString();
    }
    
    public BigDecimal lintang(){
        return lintang;
    }
    
    public String bujurStr(){
        return bujur.toString();
    }
    
    public BigDecimal bujur(){
        return bujur;
    }
}
