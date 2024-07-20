package com.sahil.packages.staticExample;

import com.sun.tools.javac.Main;

public class main {
    public static void main(String[] args) {
        Human sahil=new Human(21,"sahil gupta", 10000,false);
        Human rahul=new Human(21,"rahul gupta", 14000,true);

        System.out.println(sahil.age);
        System.out.println(rahul.name);
        System.out.println(Human.population);
        System.out.println(Human.population);

        main funn=new main();
        funn.fun2();


    }
    // this is not dependent on object
    static void fun(){

        //greeting();// you cant use this because it requires
        // an istances but function are you using it in does not depend on instances

//        main obj=new main();
//        obj.greeting();


    }
    void fun2(){
        greeting();
    }
    // we know that something which is not statics, belong to an object
    void greeting(){
        System.out.println("hello world ");
    }
}
