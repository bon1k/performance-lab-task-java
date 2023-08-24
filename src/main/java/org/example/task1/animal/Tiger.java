package org.example.task1.animal;

import lombok.Getter;

@Getter
public class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    public Tiger() {
    }

    @Override
    public void run(int lengthRun) {
        if (lengthRun <= 700) {
            System.out.println(this.getClass().getSimpleName() + " " + this.getName() + " пробежал " + lengthRun + "м");
        } else {
            System.out.println("Введено недопустимое значение");
        }

    }

    @Override
    public void swim(int lengthSwim) {
        if (lengthSwim <= 12) {
            System.out.println(this.getClass().getSimpleName() + " " + this.getName() + " пробежал " + lengthSwim + "м");
        } else {
            System.out.println("Введено недопустимое значение");
        }

    }
}
