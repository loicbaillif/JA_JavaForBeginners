package com.loicbaillif.errless.except.excHandling;

import com.loicbaillif.tools.Print;

public class Ex4 {
    /* https://hyperskill.org/learn/daily/16173
     *
     * Base Class
     */
    public static void main() {
        Print.title("Hierarchy of Exceptions - Exercise: Base Class", ':');

        MyException me1 = new MyException("Ping?");
        System.out.println(me1.getMessage());

        Print.subtitle("End of exercise", ':', (byte) 80);
    }
}

class MyException extends Throwable {
    public MyException(String message) {
        super(message);
    }
}
