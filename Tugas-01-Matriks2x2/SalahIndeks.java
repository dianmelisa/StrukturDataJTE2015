/**
 * Exception jika indeks matriks yang diberikan diluar batas
 */
public class SalahIndeks extends Exception {
    public SalahIndeks(String pesan) {
        super(pesan);
    }
}
