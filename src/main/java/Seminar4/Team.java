/*
Класс команд и методы команд
 */

package Seminar4;

import Seminar4.warriors.Archer;
import Seminar4.warriors.Warrior;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Team<T extends Warrior> implements Iterable<T> { // Класс команды;
    private List<T> team = new ArrayList<>(); // Список команды;

    public void add(T element) { // Метод заполнения команды;
        team.add(element);
    }

    @Override
    public Iterator<T> iterator() { // Описываем Итератор;
        return team.iterator();
    }

    public int getTeamHealth() { // Метод подсчета общего здоровья команды;
        int teamHealth = 0;
        for (T t : this) { // Пишем this потому что есть Итератор "Т";
            teamHealth += t.getHealthPoint(); // Складываем здоровье каждого персонажа в общее здоровье;
        }
        return teamHealth;
    }

    public int maxAttackDistance() { // Метод максимальной дистанции для атаки;
        int maxDistance = 0;
        for (T t : this) { // Пишем this потому что есть Итератор "Т";
            if (!(t instanceof Archer)) { // Если у нас не лучники, то идем к следующей записи;
                continue;
            }
            int currentDistance = ((Archer) t).distance(); // Создаем новую переменную;
            if (maxDistance < currentDistance) { // Сравниваем дистанцию стрельбы лучника с максимальной;
                maxDistance = currentDistance;
            }
        }
        return maxDistance;
    }

    public int getTeamAttack() { // Метод подсчета максимальной атаки команд;
        int teamAttack = 0;
        for (T t : this) { // Пишем this потому что есть Итератор "Т";
            teamAttack += t.getWeapon().damage(); // Обращение к оружию и получение его урона;
        }
        return teamAttack;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T t : this) { // Пишем this потому что есть Итератор "Т";
            builder.append(t).append('\n');
        }
        builder.append(String.format("TeamAttack: %d ", getTeamAttack()));
        builder.append(String.format("TeamHealth: %d ", getTeamHealth()));
        builder.append(String.format("TeamRange: %d ", maxAttackDistance()));
        return builder.toString();
    }
}
