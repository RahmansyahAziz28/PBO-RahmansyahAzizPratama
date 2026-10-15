package tugas;
import java.util.ArrayList;

public class Kasus {
    private String idKasus;
    private String judulKasus;
    private String status;
    private ArrayList<Tersangka> daftarTersangka;

    public Kasus(String idKasus, String judulKasus) {
        this.idKasus = idKasus;
        this.judulKasus = judulKasus;
        status = "Aktif";
        daftarTersangka = new ArrayList<Tersangka>();
    }

    public String getIdKasus() {
        return idKasus;
    }

    public void setIdKasus(String idKasus) {
        this.idKasus = idKasus;
    }

    public void setNameKasus(String judulKasus) {
        this.judulKasus = judulKasus;
    }

    public String getJudulKasus() {
        return judulKasus;
    }

    public void setJudulKasus(String judulKasus) {
        this.judulKasus = judulKasus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void tambahTersangka(Tersangka t) {
        daftarTersangka.add(t);
    }

    public ArrayList<Tersangka> getTersangka() {
        return daftarTersangka;
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public String getDetail() {
        String info = "";
        info += "ID Kasus    : " + idKasus + "\n";
        info += "Judul Kasus : " + judulKasus + "\n";
        info += "Status      : " + status + "\n";

        if (!daftarTersangka.isEmpty()) {
            info += "Daftar Tersangka :\n";
            for (Tersangka t : daftarTersangka) {
                info += t.getProfile();
            }
        } else {
            info += "Belum ada tersangka.\n";
        }

        return info;
    }
}
