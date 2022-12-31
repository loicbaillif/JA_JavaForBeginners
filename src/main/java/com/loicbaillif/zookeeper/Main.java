package com.loicbaillif.zookeeper;

import com.loicbaillif.tools.Print;

public class Main {
    public static void main() {
        Print.title("Project Zookeeper");

        Stage1.main();

        Print.subtitle("End of project", '*', (byte) 80);
    }
}
