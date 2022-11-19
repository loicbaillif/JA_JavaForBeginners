package com.loicbaillif.basics.strings.procStrings;

import com.loicbaillif.tools.Print;
import java.util.Arrays;

public class Theory {
    public static void main() {
        Print.title("Processing Strings - Theory");

        Print.subtitle("1) Strings and arrays");
        char[] charArray1 = {'S', 'n', 'o', 'w', 'm', 'a', 'n'};
        String strVar1 = String.valueOf(charArray1);
        System.out.println(strVar1);
        char[] charArray2 = strVar1.toCharArray();
        System.out.println(Arrays.toString(charArray2));
        String strVar2 = "Satellite";
        String[] strArray1 = strVar2.split("");
        System.out.println(Arrays.toString(strArray1));

        Print.subtitle("2) Splitting the String");
        String strVar3 = "I want to break free";
        String[] strArray2 = strVar3.split(" ");
        System.out.println(Arrays.toString(strArray2));
        String UsPhoneNumber = "+1-213-555-7569";
        String[] strArray3 = UsPhoneNumber.split("-");
        System.out.println(Arrays.toString(strArray3));
    }
}
