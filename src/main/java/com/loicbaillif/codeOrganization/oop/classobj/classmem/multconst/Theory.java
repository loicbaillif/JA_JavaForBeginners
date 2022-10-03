package com.loicbaillif.codeOrganization.oop.classobj.classmem.multconst;

import com.loicbaillif.tools.Print;

public class Theory {
    public static void main() {
        Print.title("Multiple Constructors - Theory", '-', (byte) 70);

        System.out.println("***** 1) Constructor Overloading");
        Robot robot1 = new Robot();
        Robot robot2 = new Robot("Andrew", "NDR-114");
        System.out.println(robot1);
        System.out.println(robot2);

    }
}
