package org.example.task1.factory;

import org.example.task1.animal.Animal;
import org.example.task1.animal.Dog;

public class DogFactory implements IAnimalFactory{
    @Override
    public Animal create() {
        return new Dog();
    }
}
