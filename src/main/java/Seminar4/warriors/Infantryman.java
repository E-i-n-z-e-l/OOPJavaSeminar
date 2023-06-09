package Seminar4.warriors;

import Seminar4.weapons.meleeWeapon.Melee;

public class Infantryman extends Warrior<Melee>{ // Класс Пехотинец;

    public Infantryman(String name, int healthPoint, Melee weapon) { // Поля как у воина;
        super(name, healthPoint, weapon);
    }

    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}
