package com.loicbaillif.errless.except.hier;

import com.loicbaillif.tools.Print;

public class Ex1 {
    /* https://hyperskill.org/learn/step/16172
     *
     * ***** UncheckedException *****
     *
     * Create a class named UncheckedException, which must inherit from an
     * unchecked exception. Inside the UncheckedException class declare
     * a no-argument constructor.
     */
    public static void main() {
        Print.title("UncheckedException");

        UncheckedException uncheckedException = new UncheckedException();
        System.out.println(uncheckedException instanceof RuntimeException);

        Print.subtitle("End of exercise", '+', (byte) 80);
    }
}

class UncheckedException extends RuntimeException {
    public UncheckedException() {
        super();
    }
}