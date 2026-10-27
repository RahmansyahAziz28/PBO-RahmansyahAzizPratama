public class FurnitureDemo {
    public static void main(String[] args) {
        Meja meja = new Meja(75.0, 60.0, 120.0, 4, 5);
        Lemari lemari = new Lemari(200.0, 60.0, 150.0, 2);

        System.out.println("Meja:");
        System.out.println("Jumlah Kaki: " + meja.getJumlahKaki());
        System.out.println("Luas Permukaan: " + meja.hitungLuasPermukaan() + " cm²");

        System.out.println("\nLemari:");
        System.out.println("Jumlah Pintu: " + lemari.getJumlahPintu());
        System.out.println("Luas Permukaan: " + lemari.hitungLuasPermukaan() + " cm²");
    }
}