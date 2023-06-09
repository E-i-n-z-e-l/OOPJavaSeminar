package Seminar4.warriors;

import Seminar4.weapons.Weapon;

import java.util.Random;
/*
Создаем абстрактный метод "Warrior" (так называемый скелет всех будущих подклассов, чтобы избежать копирования кода);
 */
public abstract class Warrior<W extends Weapon> { // Создаем поля - имя, здоровье, оружие;
    private final String name; // "final" не позволяет более изменять поле;
    private int healthPoint; // с помощью "private" защищаем наши переменные от внешнего воздействия;
    private W weapon;

    public Warrior(String name, int healthPoint, W weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
    }

    public String getName() { // метод получения имени;
        return name;
    }

    public int getHealthPoint() { // метод получения здоровья;
        return healthPoint;
    }

    public W getWeapon() { // метод получения оружия;
        return weapon;
    } // Этот метод используем в классе Archer;

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }
/*
Метод нанесения урона - "hit()";
 */
    public int hit() {
        Random rnd = new Random();

        return rnd.nextInt(0, weapon.damage() + 1); // урон от оружия от 0 до урона самого оружия;
    }
/*
Метод получения урона - "reduceHealth(int damage)";
 */
    public void reduceHealth(int damage) {
        healthPoint -= damage;
        if (healthPoint < 0) { // Чтобы при получении урона здоровье не уходило в минус;
            healthPoint = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Weapon: %s, HealthPoint: %d", name, weapon, healthPoint);
    }
}
