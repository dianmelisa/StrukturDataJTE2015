
/**
 * Write a description of class Elips here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elips extends BendaBulat
{
    private double radiusPendek;
    private double radiusPanjang;
    
    public Elips(double radiusPendek, double radiusPanjang){
        this.radiusPendek=radiusPendek;
        this.radiusPanjang=radiusPanjang;
    }
    
    public String tipe(){
       return "Elips";
    }
    
    public double radiusPendek(){
        return radiusPendek;
    }
    
    public double radiusPanjang(){
        return radiusPanjang;
    }
    
}
