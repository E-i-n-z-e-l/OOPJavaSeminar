package Seminar4.weapons.shields;

public class NotShield implements Def {

    @Override
    public int blockDamage() {return 0;}

    @Override
    public String toString() {
        return String.format("Щита нет: %d ", blockDamage());
    }
}
