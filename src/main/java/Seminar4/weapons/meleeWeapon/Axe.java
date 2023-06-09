/*
Оружие топор
 */
package Seminar4.weapons.meleeWeapon;

public class Axe implements Melee{ // класс оружия - топор;
    @Override
    public int damage() { // урон топора;
        return 5;
    }

    @Override
    public String toString() {
        return String.format("Axe: %d ", damage()); // Топор наносит столько-то урона(вывод в терминал);
    }
}