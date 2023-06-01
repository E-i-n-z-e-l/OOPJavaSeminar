package Seminar2.animals;

import Seminar2.FlySpeed;
import Seminar2.RunSpeed;
import Seminar2.animals.base.Bird;

public class Owl extends Bird implements FlySpeed, RunSpeed {
    public Owl(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Ух-Уух";
    }

    @Override
    public String feed() {
        return "мышки, грызуны";
    }

    @Override
    public int getFlySpeed() {
        return 90;
    }

    @Override
    public int getRunSpeed() {
        return 2;
    }
}