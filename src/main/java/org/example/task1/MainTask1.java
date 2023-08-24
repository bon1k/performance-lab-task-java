package org.example.task1;

import org.apache.commons.lang.RandomStringUtils;
import org.example.task1.animal.Animal;
import org.example.task1.factory.CatFactory;
import org.example.task1.factory.DogFactory;
import org.example.task1.factory.RandomFactory;
import org.example.task1.factory.TigerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class MainTask1 {
    public static void main(String[] args) {
        RandomFactory factory = new RandomFactory(List.of(
                new CatFactory(),
                new DogFactory(),
                new TigerFactory()));

        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Animal animal = factory.create();
            animal.setName(RandomStringUtils.randomAlphabetic(5));
            animals.add(animal);
        }

        animals.forEach(animal -> animal
                .run(new Random().ints(1, 1000)
                        .iterator()
                        .nextInt()));
        animals.forEach(animal -> animal
                .swim(new Random().ints(1, 1000)
                        .iterator()
                        .nextInt()));

        Map<String, Long> countTypeAnimal =
                animals.stream()
                        .collect(Collectors
                                .groupingBy(animal -> animal.getClass().getSimpleName(), Collectors.counting()));

        System.out.println(countTypeAnimal);
    }


}
