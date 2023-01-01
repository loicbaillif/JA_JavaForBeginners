package com.loicbaillif.basics.strings.textBlocks;

import com.loicbaillif.tools.Print;

public class Theory {
    public static void main() {
        Print.title("Text Blocks");

        System.out.println("1) ***** First examples *****");
        /*
        String iliadQuote = "\"But raging still, amidst his navy sat\n" +
                "The stern Achilles, stedfast in his hate;\n" +
                "Nor mix’d in combat, nor in council join’d;\n" +
                "But wasting cares lay heavy on his mind:\n" +
                "In his black thoughts revenge and slaughter roll,\n" +
                "And scenes of blood rise dreadful in his soul.\"";
        String htmlBody = "<html>\n" +
                "    <body>\n" +
                "        <p>Hello, World!</p>\n" +
                "    </body>\n" +
                "</html>\n";
         */


        System.out.println("2) ***** Java Text Block");
        String iliadQuote = """
                "But raging still, amidst his navy sat
                The stern Achilles, stedfast in his hate;
                Nor mix’d in combat, nor in council join’d;
                But wasting cares lay heavy on his mind:
                In his black thoughts revenge and slaughter roll,
                And scenes of blood rise dreadful in his soul."
                """;
        System.out.println(iliadQuote);


        System.out.println("3) ***** whitespaces *****");
        String htmlCode = """
                <html>
                    <head>
                        <title>Some page</title>
                    </head>
                    <body>
                        <p>Hi there</p>
                    </body>
                </html>
                """;
        System.out.println(htmlCode);


        System.out.println("4) ***** Beyond Basics *****");
        String textBlock = """
                We can use "single" or ""double"" quotes any time.
                For triple quotes \""" an escape is needed though...
                With two escape chars we can have 4 quotes "\"""
                This text is displayed \
                on a single line.
                And this one with lots of spaces        \s
                at its end.
                """;
        System.out.println(textBlock);


        Print.subtitle("End of Theory", '*', (byte) 80);
    }
}
