public class AbstractClassDemo {
    public static void main(String[] args) {
        System.out.println("===== LEBAH =====");
        Lebah lebah1 = new Lebah("Ratu", 0.05, "Nektar", "Hutan");
        lebah1.cetakInfo();
        System.out.println("--- Bergerak ---");
        lebah1.bergerak();
        System.out.println("--- Bernapas ---");
        lebah1.bernapas();

        System.out.println("\n===== ULAR =====");
        Ular ular1 = new Ular(true, 2.5, "Tikus", "Hutan");
        ular1.cetakInfo();
        System.out.println("--- Bergerak ---");
        ular1.bergerak();
        System.out.println("--- Bernapas ---");
        ular1.bernapas();
    }
}