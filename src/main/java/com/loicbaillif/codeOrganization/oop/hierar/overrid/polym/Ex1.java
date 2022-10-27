package com.loicbaillif.codeOrganization.oop.hierar.overrid.polym;

import com.loicbaillif.tools.Print;

public class Ex1 {
    /* https://hyperskill.org/learn/daily/4331
     * You are given four classes — Publication, Newspaper, Article and
     * Announcement. You need to override the methods getType() and
     * getDetails() in classes inherited from the class Publication.
     *
     * Then you need to implement getInfo() in the class Publication using
     * getType() and getDetails(). The method should return a String with a
     * type of publication in the first place, then details in round brackets
     * and the title after a colon. Examples are shown below.
     */

    public static void main(String[] args) {
        Print.title("Polymorphism - Exercise: Publication and its subclasses");

        Print.subtitle("End of exercise", '*', (byte) 80);
    }

}


class Publication {

    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        // write your code here
    }

    public String getType() {
        return "Publication";
    }

    public String getDetails() {
        return "";
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    // write your code here

}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    // write your code here

}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    // write your code here

}