public class Node {
    public Transaksi data;
    public Node berikut;

    public Node(Transaksi data) {
        this.data = data;
        this.berikut = null;
    }
}
