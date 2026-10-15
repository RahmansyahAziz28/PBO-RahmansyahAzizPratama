package tugas;

public class PenyidikDemo {
    public static void main(String[] args) {

        Tersangka t1 = new Tersangka("T001", "Joker");
        t1.setNik("3201010101800001");
        t1.setStatusTahanan("Ditahan");

        Tersangka t2 = new Tersangka("T002", "Selina Kyle");
        t2.setNik("3201010202900002");
        t2.setStatusTahanan("Dibebaskan");

        Tersangka t3 = new Tersangka("T003", "Two Face");
        t3.setNik("3271010303850003");
        t3.setStatusTahanan("Ditahan");

        Kasus kasus1 = new Kasus("K001", "Pencurian Bank");
        kasus1.tambahTersangka(t1);
        kasus1.tambahTersangka(t2);

        kasus1.setNameKasus("Perampokan");

        Kasus kasus2 = new Kasus("K002", "Pencurian Berlian");
        kasus2.tambahTersangka(t3);

        Kasus kasus3 = new Kasus("K003", "Pembunuh Berantai");

        Penyidik p1 = new Penyidik("P001", "Jim Gordon");
        p1.setPangkat("Komisaris");
        p1.tambahKasus(kasus1);
        p1.tambahKasus(kasus2);

        Penyidik p2 = new Penyidik("P002", "Harvey Bullock");
        p2.setPangkat("Inspektur");
        p2.tambahKasus(kasus3);

        System.out.println("===DETAIL KASUS===");
        System.out.println(kasus1.getDetail());
        System.out.println(kasus2.getDetail());
        System.out.println(kasus3.getDetail());

        System.out.println("===INFO PENYIDIK===");
        System.out.println(p1.getInfo());
        System.out.println(p2.getInfo());

        System.out.println("===UPDATE STATUS KASUS===");
        p1.tutupKasus("K001");
        kasus2.updateStatus("Sidang");

        System.out.println("\n===SETELAH UPDATE===");
        System.out.println(p1.getInfo());
    }
}
