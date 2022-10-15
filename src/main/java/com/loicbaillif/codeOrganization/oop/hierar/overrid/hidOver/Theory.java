package com.loicbaillif.codeOrganization.oop.hierar.overrid.hidOver;

import com.loicbaillif.tools.Print;

public class Theory {
    public static void main() {
        Print.title("Hiding and Overriding - Theory");

        Print.subtitle("1) Overriding instance methods");
        Mammal mammal1 = new Mammal();
        Dog dog1 = new Dog();
        Human human1 = new Human();
        System.out.println(mammal1.sayHello());
        System.out.println(dog1.sayHello());
        System.out.println(human1.sayHello());

        Print.subtitle("2) Rules for overriding methods");

        Print.subtitle(("3) Forbidding overriding"));
        System.out.println("Use the keyword _final_ to forbid overriding");

        Print.subtitle("4) Overriding and Overloading");
        System.out.println(mammal1.play());
        System.out.println(dog1.play());
        System.out.println(dog1.play(human1));
        System.out.println(human1.play());
        System.out.println(human1.play(dog1));


        Print.subtitle("End of theory", '*', (byte) 80);
    }
}

class Mammal {
    // Attributes

    // Methods
    public String sayHello() {
        return "bwofofofofolololalo";
    }

    public final String sleep() {
        return "zzzZZZzzzZZZzzz";
    }

    public String play() {
        return "tutututlultutlu";
    }
}

class Dog extends Mammal {
    // Attributes

    // Methods
    @Override
    public String sayHello() {
        return "Woof woof!";
    }

    /* following overriding is not allowed
    @Override
    public String sleep() {
        return "woozzzzzwooozzzz";
    }
    */

    @Override
    public String play() {
        return "The dog digs a hole looking for a bone.";
    }

    public String play(Human human1) {
        return "The dog runs to the ball and returns it to the human.";
    }
}

class Human extends Mammal {
    // Attributes

    // Methods
    @Override
    public String sayHello() {
        return "Good morning.";
    }

    @Override
    public String play() {
        return "The human switches on the Playstation to play.";
    }

    public String play(Dog dog1) {
        return "The human throws the ball at the dog.";
    }
}