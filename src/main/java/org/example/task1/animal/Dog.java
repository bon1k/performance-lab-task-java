package org.example.task1.animal;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name) {
        super(name);

    }

    @Override
    public void run(int lengthRun) {
        if (lengthRun <= 500) {
            System.out.println(this.getClass().getSimpleName() + " " + this.getName() + " пробежал " + lengthRun + "м");

        } else {
            System.out.println("Введено недопустимое значение");
        }

    }

    @Override
    public void swim(int lengthSwim) {
        if (lengthSwim <= 10) {
            System.out.println(this.getClass().getSimpleName() + " " + this.getName() + " проплыл " + lengthSwim + "м");
        } else {
            System.out.println("Введено недопустимое значение");
        }
    }
}
