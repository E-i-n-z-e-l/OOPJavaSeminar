package Seminar2.animals.base;

import Seminar2.animals.base.Animal;

public abstract class Herbivores extends Animal {

    public Herbivores(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "grass";
    }

}