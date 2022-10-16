package com.loicbaillif.codeOrganization.oop.hierar.overrid.polym;

import com.loicbaillif.tools.Print;

public class Theory {
    public static void main() {
        Print.title("Polymorphism - Theory");

        Print.subtitle("1) Kinds of polymorphism");

        Print.subtitle("2) Runtime polymorphic behaviour");
        MythicAnimal chimera1 = new Chimera();
        MythicAnimal dragon1 = new Dragon();
        chimera1.hello();
        dragon1.hello();

        Print.subtitle("3) Polymorphism within a class hierarchy");
        

        Print.subtitle("End of theory", '*', (byte) 80);
    }
}


class MythicAnimal {
    // Attributes
    private String name = "mythic animal";

    // Methods
    public void hello() {
        System.out.println("Hello, I'm sure you don't know me.");
    }
}

class Chimera extends MythicAnimal {
    // Attributes
    private String name = "chimera";

    // Methods
    public void hello() {
        System.out.println("Hello there, 4-in-1 speaking!");
    }
}

class Dragon extends MythicAnimal {
    // Attributes
    private String name = "dragon";

    // Methods
    @Override
    public void hello() {
        System.out.println("Leave at once or you will be burned.");
    }
}

class File {
    protected String fullName;

    // Constructor
    // TODO

    // Getters and Setters

    public void printFileInfo() {
        String info = this.getFileInfo();
        System.out.println(info);
    }

    public String getFileInfo() {
        return String.format("File: %s", fullName);
    }
}

class ImageFile extends File {
    protected int height;
    protected int width;
    protected byte[] content;

    // Constructor
    // TODO

    // Getters and Setters

    @Override
    public String getFileInfo() {
        return String.format("Image: %s (height=%d; width=%d)",
                fullName, height, width);
    }
}