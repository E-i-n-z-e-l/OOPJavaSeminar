/*
Арбалет и его методы
 */
package Seminar4.weapons.rangedWeapon;

public class CrossBow implements Ranged{ // Класс Арбалет;
    @Override
    public int damage() { // Урон Арбалета;
        return 10;
    }

    @Override
    public int distance() { // Дальность стрельбы арбалета;
        return 100;
    }

    @Override
    public String toString() {
        return String.format("Арбалет: %d ", damage());
    }

}