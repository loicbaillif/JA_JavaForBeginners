package com.loicbaillif.codeOrganization.oop.hierar.building;

import com.loicbaillif.tools.Print;

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
        setName(name);
        setEmail(email);
        setExperience(experience);
    }

    // Getters and Setters
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getExperience() {
        return this.experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
}
