package com.loicbaillif.codeOrganization.oop.hierar.overrid.hidOver;

public class Main {
    public static void main() {
        Theory.main();

        Ex1.main();
        Ex2.main();
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