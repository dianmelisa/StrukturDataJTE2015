import java.util.ArrayList;
import java.math.BigInteger;

public class DaftarTransaksi
{
    private ArrayList<Transaksi> daftar ;
    
    public DaftarTransaksi(){
        daftar = new ArrayList<Transaksi>();
    }
    
    public void tambah(Transaksi baru){
        daftar.add(baru);
    }
    
    public int banyakTransaksi(){
        return daftar.size();
    }
    
    public BigInteger saldoAkhir(){ 
        return saldoAkhir;
        

    }
    
    public String saldoAkhirStr(){
        return saldoAkhir.toString();
    }
    
    
    public void tampilkan(){
       
    }
       
    private BigInteger kredit, debit, saldoAwal, saldoAkhir;

}
