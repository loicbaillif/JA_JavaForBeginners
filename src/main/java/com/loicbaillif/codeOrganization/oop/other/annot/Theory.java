package com.loicbaillif.codeOrganization.oop.other.annot;

import com.loicbaillif.tools.Print;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;
// import org.jetbrains.annotations.NotNull;

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

        Print.subtitle("5) Custom annotations");
        System.out.println("Examples of non built-in annotations:");
        System.out.println("\t- @NotNull\n\t- @Range");
        GameCharacter gameCh1 = new GameCharacter("rain", 120);
        // GameCharacter gameCh2 = new GameCharacter(null, 33);
        System.out.println(gameCh1.getLogin());
        System.out.println(gameCh1.getLevel());



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

class GameCharacter {
    // Attributes
    @NotNull
    private String login;

    @Range(from = 1, to = 100)
    private int level = 1;

    public GameCharacter(
            @NotNull String login,
            @Range(from = 1, to = 100) int level) {
        this.login = login;
        this.level = level;
    }

    @NotNull
    public String getLogin() {
        return this.login;
    }

    @Range(from = 1, to = 100)
    public int getLevel() {
        return this.level;
    }

}
