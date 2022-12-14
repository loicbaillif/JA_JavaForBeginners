package com.loicbaillif.codeOrganization.oop.hierar.building;

import com.loicbaillif.tools.Print;

public class Theory {
    public static void main() {
        Print.title("The keyword super - Theory");

        Print.subtitle("1) Accessing superclass fields and methods");
        Convertible conv1 = new Convertible();
        System.out.println(conv1);
        System.out.println(conv1.toString2());

        Print.subtitle("2) Invoking superclass constructor");
        Employee employee1 = new Employee(
                "John Doe", 1994, "Dawn Street", 13579
                );

        Print.subtitle("End of theory", '*', (byte) 80);
    }
}
