package Seminar2.zoo;

import Seminar2.FlySpeed;
import Seminar2.Radio;
import Seminar2.RunSpeed;
import Seminar2.SwimSpeed;
import Seminar2.animals.base.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final Radio radio = new Radio();
    private final List<Animal> zoo = new ArrayList<>();

    public Zoo addAnimal(Animal someAnimal){
        zoo.add(someAnimal);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("В зоопарке:\n");
        for (Animal animal: zoo) {
            builder.append(animal)
                    .append('\n');
        }
        return builder.toString();
    }

    private List<Soundable> getSoundable() {
        List<Soundable> result = new ArrayList<>(zoo);
        result.add(radio);
        return result;
    }

    public String getSound() {
        StringBuilder builder = new StringBuilder();
        for (Soundable soundable: getSoundable()) {
            builder.append(soundable.sound()).append('\n');
        }
        return builder.toString();
    }

    public List<RunSpeed> runners(){
        List<RunSpeed> runners = new ArrayList<>();
        for (Animal animal: zoo) {
            if (animal instanceof RunSpeed) {
                runners.add((RunSpeed) animal);
            }
        }
        return runners;
    }

    public RunSpeed getRunnerChampion(){
        List<RunSpeed> runners = runners();
        RunSpeed champ = runners.get(0);
        for (RunSpeed runner: runners) {
            if (champ.getRunSpeed() < runner.getRunSpeed()) {
                champ = runner;
            }
        }
        return champ;
    }

    public List<FlySpeed> flyers() {
        List<FlySpeed> flyers = new ArrayList<>();
        for (Animal animal: zoo) {
            if (animal instanceof FlySpeed) {
                flyers.add((FlySpeed) animal);
            }
        }
        return flyers;
    }

    public List<SwimSpeed> swimmers() {
        List<SwimSpeed> swimmer = new ArrayList<>();
        for (Animal animal: zoo) {
            if (animal instanceof SwimSpeed) {
                swimmer.add((SwimSpeed) animal);
            }
        }
        return swimmer;
    }

    public SwimSpeed getSwimmerChampion(){
        List<SwimSpeed> swimmers = swimmers();
        SwimSpeed champ = swimmers.get(0);
        for (SwimSpeed runner: swimmers) {
            if (champ.getSwimSpeed() < runner.getSwimSpeed()) {
                champ = runner;
            }
        }
        return champ;
    }

    public FlySpeed getFlyerChampion(){
        List<FlySpeed> flyers = flyers();
        FlySpeed champ = flyers.get(0);
        for (FlySpeed runner: flyers) {
            if (champ.getFlySpeed() < runner.getFlySpeed()) {
                champ = runner;
            }
        }
        return champ;
    }

}
