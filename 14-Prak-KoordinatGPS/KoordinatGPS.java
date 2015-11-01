
/**
 * Write a description of class KoordinatGPS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class KoordinatGPS
{
    private double lintang, bujur;
   
    
    public KoordinatGPS(){
       
        
    }
    
    public KoordinatGPS(double bujur, double lintang){
        this.bujur=bujur;
        this.lintang=lintang;
    }
    
    public KoordinatGPS(Double bujur, Double lintang){
        this.bujur= bujur;
        this.lintang= lintang;
    }
    
    public Double lintang(){
        return lintang;
    }
    
    public Double bujur(){
        return bujur;
    }
}
