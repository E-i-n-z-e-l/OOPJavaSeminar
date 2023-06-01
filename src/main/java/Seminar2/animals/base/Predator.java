package Seminar2.animals.base;

import Seminar2.animals.base.Animal;

public abstract class Predator extends Animal {

    public Predator(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "meat";
    }

}