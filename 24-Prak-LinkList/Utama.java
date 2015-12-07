import java.util.Date;

public class Utama {
    public static void tampilkan(LinkList ll) {
        // Iterate
        Node nodeSekarang = ll.kepala();
        while (nodeSekarang != null) {
            Transaksi transaksi = nodeSekarang.data;
            System.out.printf("%28s %6s %6s\n", transaksi.kapan().toString(), 
                                                transaksi.debitStr(), 
                                                transaksi.kreditStr());
            
            nodeSekarang = nodeSekarang.berikut;
        }
    }
    
    public static void main(String[] args) {
        // Buat transaksi-nya
        Date kapan = new Date();
        Transaksi transaksi1 = new Transaksi(kapan, "1", "0");
        Transaksi transaksi2 = new Transaksi(kapan, "2", "0");
        Transaksi transaksi3 = new Transaksi(kapan, "3", "0");
        Transaksi transaksi4 = new Transaksi(kapan, "0", "1");
        Transaksi transaksi5 = new Transaksi(kapan, "0", "2");
        Transaksi transaksi6 = new Transaksi(kapan, "0", "3");
        
        LinkList ll = new LinkList();
        
        ll.tambah(transaksi1);
        ll.tambah(transaksi2);
        ll.tambah(transaksi3);
        ll.tambah(transaksi4);
        ll.tambah(transaksi5);
        ll.tambah(transaksi6);
        tampilkan(ll);
    }
}