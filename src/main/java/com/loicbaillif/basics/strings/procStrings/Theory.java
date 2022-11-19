package com.loicbaillif.basics.strings.procStrings;

import com.loicbaillif.tools.Print;

public class Theory {
    public static void main() {
        Print.title("Processing Strings - Theory");

        Print.subtitle("1) Strings and arrays");
        char[] charArray1 = {'S', 'n', 'o', 'w', 'm', 'a', 'n'};
        String strVar1 = String.valueOf(charArray1);
        System.out.println(strVar1);
    }
}
