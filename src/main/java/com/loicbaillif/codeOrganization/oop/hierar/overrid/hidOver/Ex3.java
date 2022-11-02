package com.loicbaillif.codeOrganization.oop.hierar.overrid.hidOver;

import com.loicbaillif.tools.Print;

public class Ex3 {
    /* https://hyperskill.org/learn/step/4334
     *
     * Below you can see four classes: Publication, Newspaper,
     * Article and Announcement.
     *
     * You need to override the method getDetails() in the classes inherited
     * from the class Publication. These classes should use getDetails() from
     * Publication to get information about the title and append their own
     * additional data.
     */

    public static void main() {
        Print.title("Hiding and Overriding - Exercise: Publications");

        Print.subtitle("End of exercise", '*', (byte) 80);
    }
}


class Publication {

    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public String getDetails() {
        return "title=\"" + title + "\"";
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    // write your code here
    @Override
    public String getDetails() {
        return super.getDetails() + ", source=\"" + source + "\"";
    }

}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    // write your code here
    @Override
    public String getDetails() {
        return super.getDetails() + ", author=\"" + author + "\"";
    }
}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    // write your code here

}
