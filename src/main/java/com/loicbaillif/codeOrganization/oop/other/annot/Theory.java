package com.loicbaillif.codeOrganization.oop.other.annot;

import com.loicbaillif.tools.Print;

public class Theory {
    public static void main() {
        Print.title("Annotations - Theory");

        Print.subtitle("1) Annotation, where are you?");
        System.out.println("Line of code starting with @");
        System.out.println("Won't be interpreted, but similar to metadata.");


        Print.subtitle("End of theory", '*', (byte) 80);
    }
}
