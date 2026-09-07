package Tugas;

public class Anggota {
    private String noKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String noKTP, String nama, int limitPinjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int jumlah) {
        if (jumlah <= limitPinjaman) {
            jumlahPinjaman += jumlah;
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
    }

    public void angsur(int jumlah) {
        if (jumlah <= jumlahPinjaman) {
            int Minimum = (int) (jumlahPinjaman * 0.1);
            if (jumlah < Minimum) {
                System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
            } else {
                jumlahPinjaman -= jumlah;
            } 
        } else {
            System.out.println("Maaf, jumlah angsuran melebihi jumlah pinjaman.");
        }
    }
}
