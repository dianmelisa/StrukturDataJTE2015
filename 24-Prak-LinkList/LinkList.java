public class LinkList {
    private Node kepala;
    
    public LinkList() {
        kepala = null;
    }
    
    public Node kepala() {
        return kepala;
    }
    
    public void tambah(Transaksi data) {
        Node nodeBaru = new Node(data);
        
        if (kepala == null)
            kepala = nodeBaru;
        else {
            // Iterate ke ujung
            Node sekarang = kepala;
            while (sekarang.berikut != null)
                sekarang = sekarang.berikut;
            sekarang.berikut = nodeBaru;
        }        
    }
    
    public Node elemenKe(int indeks){
        if(indeks < 0)
            return null;
        
        Node sekarang = kepala;
        for(int cnt = 0; cnt< indeks; cnt++)
        {
            if(sekarang== null)
                return null;
            
            sekarang = sekarang.berikut;
        }
        return sekarang;        
        
    }
    
    public void sisip(int setelah, Transaksi data) {
        // Indeks negatif tidak ada
        if (setelah < 0)
        return;
        // Cari node tempat sisip
        Node sekarang = elemenKe(setelah);
        if (sekarang == null)
        // Tidak ketemu, batal
        return;
        // Sisip
        Node baru = new Node(data);
        baru.berikut = sekarang.berikut;
        sekarang.berikut = baru;
    }
    
    public void hapus(int indeksSebelum){
        // Indeks negatif tidak ada
        if (indeksSebelum < 0)
        return;
        // Cari node akan diahpus
        Node sekarang = elemenKe(indeksSebelum);
        if (sekarang == null)
        // Tidak ketemu, batal
        return;
        // Sisip
        Node baru = sekarang;
        baru.berikut = sekarang.berikut.berikut;
        sekarang.berikut = baru;
        
    }
}
