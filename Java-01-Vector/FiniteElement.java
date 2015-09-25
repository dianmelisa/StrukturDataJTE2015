
/**
 * Write a description of class FiniteElement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FiniteElement
{
    private Gaya[] gaya;
    
    public FiniteElement(){
    
    }
    
    public FiniteElement(Gaya[] gaya){
        this.gaya=gaya;
    }
    
    public Gaya[] daftarGaya(){
        return gaya;
    }
}
