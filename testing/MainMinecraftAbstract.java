import java.util.ArrayList;
import java.util.List;

abstract class AbstractSuperWolf {
    protected String nama;
    protected int attackDamage;

    public AbstractSuperWolf(String nama, int attackDamage) {
        this.nama = nama;
        this.attackDamage = attackDamage;
    }

    public void lolong() {
        System.out.println("[" + nama + "] *Auuuww...* (Suara serigala terpusat)");
    }

    public abstract void serangTarget();
}

class ConcreteNormalWolf extends AbstractSuperWolf {
    public ConcreteNormalWolf() {
        super("Normal Wolf", 4);
    }

    @Override
    public void serangTarget() {
        System.out.println(nama + " menggigit target! Memberikan " + attackDamage + " damage.");
    }
}

class ConcreteAngryWolf extends AbstractSuperWolf {
    public ConcreteAngryWolf() {
        super("Angry Wolf", 8);
    }

    @Override
    public void serangTarget() {
        System.out.println(nama + " (Mata Merah) MENERKAM dengan brutal! Memberikan " + attackDamage + " damage.");
    }
}

public class MainMinecraftAbstract {
    public static void main(String[] args) {
        System.out.println("=== MINECRAFT: ABSTRACT + CONCRETE WITH SUPERCLASS ===");

        List<AbstractSuperWolf> wolfPack = new ArrayList<>();
        wolfPack.add(new ConcreteNormalWolf());
        wolfPack.add(new ConcreteAngryWolf());

        for (AbstractSuperWolf wolf : wolfPack) {
            wolf.lolong();
            wolf.serangTarget();
            System.out.println("------------------------------------------------");
        }
    }
}
