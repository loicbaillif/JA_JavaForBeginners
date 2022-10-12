package com.loicbaillif.codeOrganization.oop.other.annot;

import com.loicbaillif.tools.Print;

public class Theory {
    public static void main() {
        Print.title("Annotations - Theory");

        Print.subtitle("1) Annotation, where are you?");
        System.out.println("Line of code starting with @");
        System.out.println("Won't be interpreted, but similar to metadata.");

        Print.subtitle("2) Built-in annotations");
        System.out.println("There are 3 built-in annotations:");
        System.out.println("\t- @Deprecated");
        deprecatedMethod();
        System.out.println("\t- @SuppressWarnings");
        System.out.println("\t- @Override");

        Print.subtitle("3) Annotation elements");

        Print.subtitle("4) @Deprecated annotations");

        Print.subtitle("End of theory", '*', (byte) 80);
    }

    @Deprecated(since = "0.8", forRemoval = true)
    public static void deprecatedMethod() {
        System.out.println("\t\tI am deprecated.");
    }

    @SuppressWarnings("unused")
    public static void unusedMethod() {
        System.out.println("\t\tI am not used.");
    }

    @Override
    public String toString() {
        return "This is Theory for Annotations.";
    }
}
