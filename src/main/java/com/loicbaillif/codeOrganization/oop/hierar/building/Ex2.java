package com.loicbaillif.codeOrganization.oop.hierar.building;

import com.loicbaillif.tools.Print;

import java.util.Arrays;

public class Ex2 {
    /* https://hyperskill.org/learn/step/2206
     * Develop a class hierarchy of employees. The hierarchy should include
     * three classes:
     *
     *      . Employee is the base class. It includes three fields (name,
     *      email and integer variable experience), one constructor with three
     *      arguments and three getters: getName(), getEmail(), getExperience()
     *
     *      . Developer is a subclass. It includes fields from the base class
     *      and two additional fields (mainLanguage, skills), one constructor
     *      with five arguments and two getters: getMainLanguage(), getSkills()
     *
     *      . DataAnalyst is another subclass. It includes fields from the base
     *      class and two additional fields (phd, methods), one constructor
     *      with five arguments and two getters: isPhd(), getMethods().
     */

    public static void main() {
        Print.title("The keyword super - Exercise: Employees");

        String[] skills = { "git", "Scala", "JBoss", "UML" };
        Developer developer = new Developer(
                "Mary", "mary@mail.com", 3, "Java", skills);
        System.out.println(developer);

        String[] methods = { "neural networks", "decision tree", "bayesian algorithms" };
        DataAnalyst analyst = new DataAnalyst(
                "John", "john@gmail.com", 2, true, methods);
        System.out.println(analyst);

        Print.subtitle("End of exercise", '*', (byte) 80);
    }
}


class Employee2 {
    // Attributes
    private String name;
    private String email;
    private int experience;

    // Constructor
    public Employee2(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    // Getters and Setters
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public int getExperience() {
        return this.experience;
    }

    // toString()

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", experience=" + experience +
                '}';
    }
}


class Developer extends Employee2 {
    // Attributes
    private String mainLanguage;
    private String[] skills;

    // Constructor
    public Developer(String name, String email, int experience,
                     String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills.clone();
    }

    // Getters and Setters
    public String getMainLanguage() {
        return this.mainLanguage;
    }

    public String[] getSkills() {
        return this.skills.clone();
    }

    // toString

    @Override
    public String toString() {
        return "Developer{" +
                "mainLanguage='" + mainLanguage + '\'' +
                ", skills=" + Arrays.toString(skills) +
                "} " + super.toString();
    }
}


class DataAnalyst extends Employee2 {
    // Attributes
    private boolean phd;
    private String[] methods;

    // Constructor
    public DataAnalyst(String name, String email, int experience,
                       boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods.clone();
    }

    // Getters and Setters
    public boolean isPhd() {
        return phd;
    }

    public String[] getMethods() {
        return this.methods.clone();
    }

    // toString()

    @Override
    public String toString() {
        return "DataAnalyst{" +
                "phd=" + phd +
                ", methods=" + Arrays.toString(methods) +
                "} " + super.toString();
    }
}
