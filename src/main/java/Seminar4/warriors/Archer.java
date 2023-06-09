/*
Вид воина Лучник
 */
package Seminar4.warriors;

import Seminar4.weapons.Weapon;
import Seminar4.weapons.rangedWeapon.Ranged;

public class Archer extends Warrior<Ranged>{ // Класс Лучника;
    public Archer(String name, int healthPoint, Ranged weapon) { // Поля берем от воина;
        super(name, healthPoint, weapon);
    }

    public int distance(){
        return super.getWeapon().distance(); // Дальность ведения стрельбы лучника;
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d",super.toString(), distance()); // Вывод лучника;
    }
}