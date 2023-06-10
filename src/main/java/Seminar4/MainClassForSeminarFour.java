/*
Файл Main
 */

package Seminar4;

import Seminar4.warriors.Archer;
import Seminar4.warriors.Infantryman;
import Seminar4.warriors.Warrior;
import Seminar4.weapons.shields.HeavyShield;
import Seminar4.weapons.shields.NotShield;
import Seminar4.weapons.shields.RoundShield;
import Seminar4.weapons.meleeWeapon.Axe;
import Seminar4.weapons.meleeWeapon.Sword;
import Seminar4.weapons.rangedWeapon.Bow;
import Seminar4.weapons.rangedWeapon.CrossBow;

public class MainClassForSeminarFour {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>(); // Создаем команду;
        team1.add(new Archer("Robin", 100, new Bow(), new NotShield()));
        team1.add(new Infantryman("John", 150, new Axe(), new RoundShield()));

        Team<Archer> teamArchers = new Team<>(); // Создаем команду только лучников;
        teamArchers.add(new Archer("Jimmy", 100, new CrossBow(), new NotShield()));
        teamArchers.add(new Archer("Piter",100, new Bow(), new NotShield()));

        Team<Infantryman> teamInfantryman = new Team<>(); // Создаем команду только пехотинцев;
        teamInfantryman.add(new Infantryman("James", 150, new Sword(), new HeavyShield()));

        System.out.println(team1);
        System.out.println("-----------------------------------------------------------------------------\n");
        System.out.println(teamArchers);
        System.out.println("-----------------------------------------------------------------------------\n");
        System.out.println(teamInfantryman);
        System.out.println("-----------------------------------------------------------------------------\n");

        Battle battle1 = new Battle(new Infantryman("John", 150, new Axe(), new RoundShield()),
                        (new Archer("Robin", 100, new Bow(), new NotShield())));

        battle1.fight();

    }
}
