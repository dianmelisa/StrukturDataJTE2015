import java.math.BigInteger;
import java.util.Date;

public class Utama {
    public static void main(String[] argumen) {
        BigInteger saldo = new BigInteger("0");
        Transaksi trans1 = new Transaksi(new Date(), "0", "100000");
        Transaksi trans2 = new Transaksi(new Date(), "0", "200000");
        Transaksi trans3 = new Transaksi(new Date(), "500000", "0");
        
        System.out.println("Tanggal                      Debit  Kredit  Saldo");
        System.out.println("==================================================");
        
        saldo = trans1.saldo(saldo);
        System.out.printf("%28s %6s %6s %7s\n", trans1.kapan().toString(), 
                                                trans1.debitStr(), 
                                                trans1.kreditStr(),
                                                saldo.toString());
        saldo = trans2.saldo(saldo);
        System.out.printf("%28s %6s %6s %7s\n", trans2.kapan().toString(), 
                                                trans2.debitStr(), 
                                                trans2.kreditStr(),
                                                saldo.toString());
        saldo = trans3.saldo(saldo);
        System.out.printf("%28s %6s %6s %7s\n", trans3.kapan().toString(), 
                                                trans3.debitStr(), 
                                                trans3.kreditStr(),
                                                saldo.toString());
    }
}
