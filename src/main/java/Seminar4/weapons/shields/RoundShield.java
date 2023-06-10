package Seminar4.weapons.shields;

import Seminar4.weapons.Protection;

public class RoundShield implements Protection {

    @Override
    public int blockDamage() {return 1;}

    @Override
    public String toString() {
        return String.format("Щит : %d ", blockDamage());
    }

}
