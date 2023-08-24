package org.example.task1.animal;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public Cat() {
    }

    @Override
    public void run(int lengthRun) {
        if (lengthRun <= 200) {
            System.out.println(this.getClass().getSimpleName() + " " + this.getName() + " пробежал " + lengthRun + "м");

        } else {
            System.out.println("Введено недопустимое значение");
        }
    }


    @Override
    public void swim(int lengthSwim) {
        System.out.println("Я не умею плавать");
    }
}
