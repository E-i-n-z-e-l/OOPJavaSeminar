package Seminar4.weapons.shields;

import Seminar4.weapons.Protection;

public class HeavyShield implements Protection {

    @Override
    public int blockDamage() {return 5;}

    @Override
    public String toString() {
        return String.format("Щит : %d ", blockDamage());
    }
}
