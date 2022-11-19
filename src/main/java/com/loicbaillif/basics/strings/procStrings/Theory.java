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
    }
}
