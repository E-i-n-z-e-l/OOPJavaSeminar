/*
Оружие меч
 */
package Seminar4.weapons.meleeWeapon;

public class Sword implements Melee{ // Меч;
    @Override
    public int damage() { // Урон меча;
        return 4;
    }

    @Override
    public String toString() {
        return String.format("Sword: %d ", damage()); // Меч наносит столько-то урона(вывод в терминал);
    }
}
