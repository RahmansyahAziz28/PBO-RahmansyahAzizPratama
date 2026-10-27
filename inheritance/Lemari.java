public class Lemari extends Furniture {
    private int jumlahPintu;

    public Lemari() {
    }

    public Lemari(double tinggi, double lebar, double panjang, int jumlahPintu) {
        super(tinggi, lebar, panjang);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }
}