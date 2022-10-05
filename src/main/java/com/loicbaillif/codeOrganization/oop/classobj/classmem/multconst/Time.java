package com.loicbaillif.codeOrganization.oop.classobj.classmem.multconst;

public class Time {
    int seconds;
    int minutes;
    int hours;

    Time(int hours) {
        this.hours = hours;
    }

    Time(int hours, int minutes) {
        this(hours);
        this.minutes = minutes;
    }

    Time(int hours, int minutes, int seconds) {
        this(hours, minutes);
        this.seconds = seconds;
    }
}
