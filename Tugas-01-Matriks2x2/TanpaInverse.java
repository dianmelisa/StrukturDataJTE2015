/**
 * Exception jika indeks matriks yang diberikan diluar batas
 */
public class TanpaInverse extends Exception {
    public TanpaInverse(String pesan) {
        super(pesan);
    }
}
