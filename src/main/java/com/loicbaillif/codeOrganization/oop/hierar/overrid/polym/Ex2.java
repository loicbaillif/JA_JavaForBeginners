package com.loicbaillif.codeOrganization.oop.hierar.overrid.polym;

import com.loicbaillif.tools.Print;

public class Ex2 {
    /* https://hyperskill.org/learn/daily/3661
     *
     * You've decided to create your own project and for that, you need to
     * employ 1 programmer and 1 team lead. You have written the code
     * for that, but it does not work.
     *
     * Your task is to find a mistake.
     */



    public static void main() {
        Print.title("Polymorphism - Exercise: Find mistake");

        //Test test1 = new Test();
        //String[] testArgs = {"one", "two", "three"};
        //test1.main(testArgs);

        Print.subtitle("End of exercise", '*', (byte) 80);
    }
}

class Test {

    public static void main(String[] args) {
        new TeamLead(1);
    }

    public static class TeamLead extends Programmer {

        private final int numTeamLead;

        public TeamLead(int numTeamLead) {
            super(numTeamLead);
            this.numTeamLead = numTeamLead;
            employ();
        }

        protected void employ() {
            System.out.println(numTeamLead + " teamlead");
        }

    }

    public static class Programmer {

        private final int numProgrammer;

        public Programmer(int numProgrammer) {
            this.numProgrammer = numProgrammer;
            employ();
        }

        private void employ() {
            System.out.println(numProgrammer + " programmer");
        }
    }
}