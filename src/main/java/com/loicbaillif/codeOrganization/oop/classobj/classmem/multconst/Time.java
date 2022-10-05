package com.loicbaillif.codeOrganization.oop.classobj.classmem.multconst;

public class Time {
    int seconds;
    int minutes;
    int hours;

    Time(int hours) {
        this.hours = hours;
        this.minutes = 0;
        this.seconds = 0;
    }

    Time(int hours, int minutes) {
        this(hours);
        this.minutes = minutes;
    }

    Time(int hours, int minutes, int seconds) {
        this(hours, minutes);
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return String.format("Time = %02d:%02d:%02d",
                hours, minutes, seconds);
    }
}
