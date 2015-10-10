public class Menu
{
    private Makanan[] makanan;
    
    public Menu(Makanan[] makanan){
        this.makanan=makanan;
    }
    
    public Makanan[] daftarMakanan(){
        return makanan;
    }
    
}