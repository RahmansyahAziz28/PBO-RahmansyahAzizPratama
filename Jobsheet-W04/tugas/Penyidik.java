package tugas;
import java.util.ArrayList;

public class Penyidik {
    private String idPenyidik;
    private String nama;
    private String pangkat;
    private ArrayList<Kasus> daftarKasus;

    public Penyidik(String id, String nama) {
        this.idPenyidik = id;
        this.nama = nama;
        this.pangkat = "-";
        this.daftarKasus = new ArrayList<Kasus>();
    }

    public String getIdPenyidik() {
        return idPenyidik;
    }

    public void setIdPenyidik(String idPenyidik) {
        this.idPenyidik = idPenyidik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPangkat() {
        return pangkat;
    }

    public void setPangkat(String pangkat) {
        this.pangkat = pangkat;
    }

    public void tambahKasus(Kasus k) {
        daftarKasus.add(k);
    }

    public ArrayList<Kasus> getKasusDitangani() {
        return daftarKasus;
    }

    public void tutupKasus(String nomorKasus) {
        for (Kasus k : daftarKasus) {
            if (k.getIdKasus().equals(nomorKasus)) {
                k.updateStatus("Ditutup");
                System.out.println("Kasus [" + nomorKasus + "] telah ditutup oleh " + nama + ".");
                return;
            }
        }
        System.out.println("Kasus dengan ID [" + nomorKasus + "] tidak ditemukan.");
    }

    public void hapusKasusPenyidik(String nomorKasus) {
        for (Kasus k : daftarKasus) {
            if (k.getIdKasus().equals(nomorKasus)) {
                daftarKasus.remove(k);
                System.out.println("Kasus [" + nomorKasus + "] telah dihapus dari daftar kasus " + nama + ".");
                return;
            }
        }
        System.out.println("Kasus dengan ID [" + nomorKasus + "] tidak ditemukan.");
    }

    public String getInfo() {
        String info = "";
        info += "ID Penyidik : " + idPenyidik + "\n";
        info += "Nama        : " + nama + "\n";
        info += "Pangkat     : " + pangkat + "\n";

        if (!daftarKasus.isEmpty()) {
            info += "Kasus yang Ditangani :\n";
            for (Kasus k : daftarKasus) {
                info += "  [" + k.getIdKasus() + "] " + k.getJudulKasus()
                        + " - Status: " + k.getStatus() + "\n";
                
            }
        } else {
            info += "Belum menangani kasus.\n";
        }

        return info;
    }
}
