public class Meja extends Furniture {
    private int jumlahKaki;
    private int lebarKaki;

    public Meja() {
    }

    public Meja(double tinggi, double lebar, double panjang, int jumlahKaki, int lebarKaki) {
        super(tinggi, lebar, panjang);
        this.jumlahKaki = jumlahKaki;
        this.lebarKaki = lebarKaki;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasAtas = panjang * lebar;
        double luasKaki = jumlahKaki * (lebarKaki * lebarKaki * (tinggi - lebarKaki));
        return luasAtas + luasKaki;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }
}