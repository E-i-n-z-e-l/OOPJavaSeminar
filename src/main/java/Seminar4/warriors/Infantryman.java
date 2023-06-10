/*
Вид воина Пехотинец.
 */
package Seminar4.warriors;

import Seminar4.weapons.Protection;
import Seminar4.weapons.meleeWeapon.Melee;

public class Infantryman extends Warrior<Melee, Protection>{ // Класс Пехотинец;

    public Infantryman(String name, int healthPoint, Melee weapon, Protection protection) { // Поля как у воина;
        super(name, healthPoint, weapon, protection);
    }

    @Override
    public String toString() {
        return String.format("Пехотинец: %s", super.toString());
    }
}
