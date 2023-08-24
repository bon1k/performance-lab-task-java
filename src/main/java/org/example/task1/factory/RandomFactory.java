package org.example.task1.factory;

import org.example.task1.animal.Animal;

import java.util.List;
import java.util.Random;

public class RandomFactory implements IAnimalFactory {

    List<IAnimalFactory> animals;

    public RandomFactory(List<IAnimalFactory> animals) {
        this.animals = animals;
    }

    Random random = new Random();

    @Override
    public Animal create() {
        return animals.get(random.nextInt(animals.size())).create();
    }
}
