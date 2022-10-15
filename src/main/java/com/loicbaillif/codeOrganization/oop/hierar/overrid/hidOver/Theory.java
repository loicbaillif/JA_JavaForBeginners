package com.loicbaillif.codeOrganization.oop.hierar.overrid.hidOver;

import com.loicbaillif.tools.Print;

public class Theory {
    public static void main() {
        Print.title("Hiding and Overriding - Theory");

        Print.subtitle("1) Overriding instance methods");
        

        Print.subtitle("End of theory", '*', (byte) 80);
    }
}

class Mammal {
    // Attributes

    // Methods
    public String sayHello() {
        return "bwofofofofolololalo";
    }
}

class Dog extends Mammal {
    // Attributes

    // Methods
    @Override
    public String sayHello() {
        return "Woof woof!";
    }
}

class Human extends Mammal {
    // Attributes

    // Methods
    @Override
    public String sayHello() {
        return "Good morning.";
    }
}