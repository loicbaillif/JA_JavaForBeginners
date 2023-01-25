package com.loicbaillif.amazingNumbers;

import com.loicbaillif.tools.Print;

import java.util.Objects;
import java.util.Scanner;

public class Stage6 {
    /* https://hyperskill.org/projects/184/stages/936/implement
     *
     * Stage 6 : Sunny and Square Numbers
     */

    // Static Variables
    static String instructions = """
            Welcome to Amazing Numbers!
            
            Supported requests:
            - enter a natural number to know its properties;
            - enter two natural numbers to obtain the properties of the list:
              * the first parameter represents a starting number;
              * the second parameter shows how many consecutive \
            numbers are to be printed;
            - two natural numbers and a property to search for;
            - two natural numbers and two properties to search for;
            - separate the parameters with one space;
            - enter 0 to exit.
            """;
    static String askRequest = "Enter a request:";
    static String errorEmpty = "Error: User input cannot be empty.";
    static String errorInvalidProperties = """
            Error: The properties [%s, %s] are wrong.
            Available properties: ["BUZZ", "DUCK", "EVEN", "GAPFUL", \
            "ODD", "PALINDROMIC", "SPY", "SQUARE", "SUNNY"]
            """;
    static String errorInvalidProperty = """
            Error: the property [%s] is wrong.
            Available properties: ["BUZZ", "DUCK", "EVEN", "GAPFUL", \
            "ODD", "PALINDROMIC", "SPY", "SQUARE", "SUNNY"]
            """;
    static String errorLen = "Error: The second parameter should be " +
            "a natural number";
    static String errorIncompatible = """
            Error: The request contains mutually exclusive properties: [%s, %s]
            There are no numbers with these properties.
            """;
    static String errorNotNatural = "Error: The first parameter should be a " +
            "natural number or zero";
    static String errorNbArgs = "Error: The program needs 1 to 3 arguments";
    static String farewell = "Thanks for using Amazing Numbers, goodbye!";
    static String numberStatus = """
            Properties of %d
                       even: %b
                        odd: %b
                       buzz: %b
                       duck: %b
                palindromic: %b
                     gapful: %b
                        spy: %b
                     square: %b
                      sunny: %b
            """;
    static String[] listProperties =
            {"BUZZ", "DUCK", "EVEN", "GAPFUL", "ODD", "PALINDROMIC", "SPY",
            "SQUARE", "SUNNY"};
    static ProjectNumber projectNumber = new ProjectNumber(1);

    public static void main() {
        Print.subtitle("Stage 6 : Sunny and Square Numbers", '*', (byte) 80);

        // Variables
        boolean exitCondition = false;
        String[] userInput;

        System.out.println(instructions);

        while (!exitCondition) {
            System.out.println(askRequest);
            userInput = getUserInput();
            exitCondition = treatRequest(userInput);
        }

        System.out.println(farewell);

        Print.subtitle("End of Stage 6", '*', (byte) 80);
    }


    private static String[] getUserInput() {
        // Variables
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        while (userInput.length() == 0) {
            System.out.println(errorEmpty);
            userInput = scanner.nextLine();
        }

        return userInput.split(" ");
    }


    private static boolean hasProperty(String property) {
        switch (property) {
            case "BUZZ" -> {
                projectNumber.setBuzz();
                if (projectNumber.isBuzz()) return true;
            }
            case "DUCK" -> {
                projectNumber.setDuck();
                if (projectNumber.isDuck()) return true;
            }
            case "EVEN" -> {
                projectNumber.setEven();
                if (projectNumber.isEven()) return true;
            }
            case "GAPFUL" -> {
                projectNumber.setGapful();
                if (projectNumber.isGapful()) return true;
            }
            case "ODD" -> {
                projectNumber.setOdd();
                if (projectNumber.isOdd()) return true;
            }
            case "PALINDROMIC" -> {
                projectNumber.setPalindromic();
                if (projectNumber.isPalindromic()) return true;
            }
            case "SPY" -> {
                projectNumber.setSpy();
                if (projectNumber.isSpy()) return true;
            }
            case "SQUARE" -> {
                projectNumber.setSquare();
                if (projectNumber.isSquare()) return true;
            }
            case "SUNNY" -> {
                projectNumber.setSunny();
                if (projectNumber.isSunny()) return true;
            }
            default -> {
                return false; // unknown property
            }
        }

        return false;
    }


    private static boolean isValidProperty(String property) {
        boolean result = false;
        for (String listProperty : listProperties) {
            if (Objects.equals(listProperty, property)) {
                result = true;
                break;
            }
        }

        return result;
    }


    private static boolean treat1Input(String userInput) {
        // Exit condition
        if (Objects.equals("0", userInput)) return true;

        // Variable
        long firstValue = verifyFirstValue(userInput);
        if (firstValue == -1) return false;

        projectNumber.setNumberValue(firstValue);
        projectNumber.setProperties();
        projectNumber.giveStatus(numberStatus);

        return false;
    }


    private static void treat2Inputs(String[] userInput) {
        // Check first value
        long firstValue = verifyFirstValue(userInput[0]);
        if (firstValue == -1) return;

        // Check number of elements
        int nbElements = verifyNbElements(userInput[1]);
        if (nbElements == 0) return;

        // Treat request only if previous checks successful
        for (int i = 0; i < nbElements; i++) {
            projectNumber.setNumberValue(firstValue + i);
            projectNumber.setProperties();
            projectNumber.giveShortStatus();
        }
    }


    private static void treat3Inputs(String[] userInput) {
        // Variables
        int foundElements = 0;

        // Check first value
        long firstValue = verifyFirstValue(userInput[0]);
        if (firstValue == -1) return;

        // Check number of elements
        int nbElements = verifyNbElements(userInput[1]);
        if (nbElements == 0) return;

        // Check requested property
        String seekedProperty = userInput[2].toUpperCase();
        if (!isValidProperty(seekedProperty)) return;

        while (foundElements < nbElements) {
            projectNumber.setNumberValue(firstValue++);
            if (hasProperty(seekedProperty)) {
                projectNumber.setProperties();
                projectNumber.giveShortStatus();
                foundElements++;
            }
        }

    }


    private static void treat4Inputs(String[] userInput) {
        System.out.println("4 inputs detected"); // DEBUG
        // Variables
        int foundElements = 0;

        // Check first value
        long firstValue = verifyFirstValue(userInput[0]);
        if (firstValue == -1) return;

        // Check number of elements
        int nbElements = verifyNbElements(userInput[1]);
        if (nbElements == 0) return;

        // Check seeked properties
        String property1 = userInput[2].toUpperCase();
        String property2 = userInput[3].toUpperCase();
        if (!verifyProperties(property1, property2)) return;
        // Check duplicated property
        if (Objects.equals(property1, property2)) treat3Inputs(userInput);
        // Check incompatible pairs
        if (!verifyPropertyCompat(property1, property2)) {
            System.out.printf(errorIncompatible, property1, property2);
            return;
        }

        // Treat request
        while (foundElements < nbElements) {
            projectNumber.setNumberValue(firstValue++);
            if (hasProperty(property1) && hasProperty(property2)) {
                projectNumber.setProperties();
                projectNumber.giveShortStatus();
                foundElements++;
            }
        }

    }


    private static boolean treatRequest(String[] userInput) {
        // Variables
        int nbArgs = userInput.length;
        boolean endProgram = false;

        switch (nbArgs) {
            case 1 -> endProgram = treat1Input(userInput[0]);
            case 2 -> treat2Inputs(userInput);
            case 3 -> treat3Inputs(userInput);
            case 4 -> treat4Inputs(userInput);
            default -> System.out.println(errorNbArgs);
        }

        return endProgram;
    }


    private static long verifyFirstValue(String userInput) {
        return CheckInput.strToLong(
                userInput,
                errorNotNatural,
                -1L
        );
    }


    private static int verifyNbElements(String userInput) {
        return (int) CheckInput.strToLong(userInput, errorLen, 0L);
    }


    private static boolean verifyProperties(String prop1, String prop2) {
        // Returns true if and only if prop1 and prop2 are valid properties
        // i.e. in the given list
        if (isValidProperty(prop1) && isValidProperty(prop2)) {
          return true;
        } else if (!isValidProperty(prop1) && !isValidProperty(prop2)) {
            System.out.printf(errorInvalidProperties, prop1, prop2);
        } else if (!isValidProperty(prop1)) {
            System.out.printf(errorInvalidProperty, prop1);
        } else if (!isValidProperty(prop2)) {
            System.out.printf(errorInvalidProperty, prop2);
        }

        return false;
    }


    private static boolean verifyPropertyCompat(String prop1, String prop2) {
        // Returns true if and only if prop1 and prop2 are compatible
        if (Objects.equals(prop1, "EVEN")) {
            return !Objects.equals(prop2, "ODD");
        }
        if (Objects.equals(prop1, "ODD")) {
            return !Objects.equals(prop2, "EVEN");
        }
        if (Objects.equals(prop1, "DUCK")) {
            return !Objects.equals(prop2, "SPY");
        }
        if (Objects.equals(prop1, "SPY")) {
            return !Objects.equals(prop2, "DUCK");
        }
        if (Objects.equals(prop1, "SUNNY")) {
            return !Objects.equals(prop2, "SQUARE");
        }
        if (Objects.equals(prop1, "SQUARE")) {
            return !Objects.equals(prop2, "SUNNY");
        }
        return true;
    }
}
