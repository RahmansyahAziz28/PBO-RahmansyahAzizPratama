package tugas;
public class Tersangka {
    private String idTersangka;
    private String nama;
    private String nik;
    private String statusTahanan;

    public Tersangka(String id, String nama) {
        this.idTersangka = id;
        this.nama = nama;
        this.nik = "-";
        this.statusTahanan = "Bebas";
    }

    public String getIdTersangka() {
        return idTersangka;
    }

    public void setIdTersangka(String idTersangka) {
        this.idTersangka = idTersangka;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getStatusTahanan() {
        return statusTahanan;
    }

    public void setStatusTahanan(String s) {
        this.statusTahanan = s;
    }

    public String getProfile() {
        String info = "";
        info += "  ID Tersangka    : " + idTersangka + "\n";
        info += "  Nama            : " + nama + "\n";
        info += "  NIK             : " + nik + "\n";
        info += "  Status Tahanan  : " + statusTahanan + "\n";
        return info;
    }
}
