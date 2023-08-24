package org.example.task1.factory;

import org.example.task1.animal.Animal;
import org.example.task1.animal.Cat;
import org.example.task1.animal.Dog;

public class CatFactory implements IAnimalFactory{
    @Override
    public Animal create() {
        return new Cat();
    }
}
