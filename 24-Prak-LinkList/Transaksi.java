import java.util.Date;
import java.math.BigInteger;

public class Transaksi {
    public Transaksi() {
        this.kapan = new Date();
        this.debit = new BigInteger("0");
        this.kredit = new BigInteger("0");
    }
    
    public Transaksi(Date kapan, long debit, long kredit) {
        this.kapan = kapan;
        this.debit = new BigInteger(Long.toString(debit));
        this.kredit = new BigInteger(Long.toString(kredit));
    }
    
    public Transaksi(Date kapan, String debit, String kredit) {
        this.kapan = kapan;
        this.debit = new BigInteger(debit);
        this.kredit = new BigInteger(kredit);
    }
    
    public Date kapan() {
        return kapan;
    }
    
    public BigInteger debit() {
        return debit;
    }
    
    public String debitStr() {
        return debit.toString();
    }
    
    public BigInteger kredit() {
        return kredit;
    }
    
    public String kreditStr() {
        return kredit.toString();
    }
    
    public BigInteger saldo(BigInteger saldoAwal) {
        BigInteger hasil = new BigInteger("0");
        hasil = hasil.add(saldoAwal);
        hasil = hasil.add(debit);
        hasil = hasil.subtract(kredit);
        return hasil;
    }
    
    public String saldoStr(BigInteger saldoAwal) {
        BigInteger hasil = new BigInteger("0");
        hasil = hasil.add(saldoAwal);
        hasil = hasil.add(debit);
        hasil = hasil.subtract(kredit);
        return hasil.toString();
    }
    
    private Date kapan;
    private BigInteger debit;
    private BigInteger kredit;
}