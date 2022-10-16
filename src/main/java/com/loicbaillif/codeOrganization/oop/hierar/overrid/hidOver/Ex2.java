package com.loicbaillif.codeOrganization.oop.hierar.overrid.hidOver;

import com.loicbaillif.tools.Print;

public class Ex2 {
    /* https://hyperskill.org/learn/step/2200
     *
     * You have four classes: Animal, Cat, Dog, and Duck.
     * The class animal has a method say().
     *
     * Override the method in all subclasses. Overridden methods should output
     * what these animals say (using System.out.println).
     *
     *      - Cat: "meow-meow"
     *      - Dog: "arf-arf"
     *      - Duck: "Quack-quack"
     */

    public static void main() {
        Print.title("Hiding and Overriding - Exercise: Saying Animals");

        Cat cat1 = new Cat();
        Dog2 dog2 = new Dog2();
        Duck duck1 = new Duck();
        cat1.say();
        dog2.say();
        duck1.say();

        Print.subtitle("End of exercise", '*', (byte) 80);
    }
}

class Animal {
    public void say() {
        System.out.println("...An incomprehensible sound...");
    }
}

class Cat extends Animal {
    @Override
    public void say() {
        System.out.println("meow-meow");
    }
}

class Dog2 extends Animal {
    @Override
    public void say() {
        System.out.println("arf-arf");
    }
}

class Duck extends Animal {
    @Override
    public void say() {
        System.out.println("quack-quack");
    }
}
