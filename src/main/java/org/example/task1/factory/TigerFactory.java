package org.example.task1.factory;

import org.example.task1.animal.Animal;
import org.example.task1.animal.Dog;
import org.example.task1.animal.Tiger;

public class TigerFactory implements IAnimalFactory{
    @Override
    public Animal create() {
        return new Tiger();
    }
}
