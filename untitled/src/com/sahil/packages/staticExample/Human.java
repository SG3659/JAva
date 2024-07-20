package com.sahil.packages.staticExample;

public class Human {
    int age;
    String name;
    int Salary;
    boolean married;
    static long population; // it is independent of object
    //because population is same for both human object
    // static variable are dependent on the objects

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        Salary = salary;
        this.married = married;
        Human.population+=1;
    }
}

