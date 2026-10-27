class BaseWolf {
    protected String nama = "Wolf";
    protected int attackDamage = 4;

    public void lolong() {
        System.out.println("[" + nama + "] *Auuuww...* (Suara serigala normal)");
    }

    public void serangTarget() {
        System.out.println(nama + " menggigit target! Memberikan " + attackDamage + " damage.");
    }
}

class AngryWolf extends BaseWolf {
    
    public AngryWolf() {
        this.nama = "Angry Wolf";
        this.attackDamage = 8;
    }

    @Override
    public void serangTarget() {
        System.out.println(nama + " (Mata Merah) MENERKAM dengan brutal! Memberikan " + attackDamage + " damage.");
    }
}

public class MainMinecraftFullConcrete {
    public static void main(String[] args) {
        System.out.println("=== MINECRAFT: FULL CONCRETE WITH SUPERCLASS ===");

        BaseWolf serigalaBiasa = new BaseWolf();
        AngryWolf serigalaMarah = new AngryWolf();

        serigalaBiasa.lolong();
        serigalaBiasa.serangTarget();

        System.out.println("------------------------------------------------");

        serigalaMarah.lolong();
        serigalaMarah.serangTarget();
    }
}
