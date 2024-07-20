package oops.oops5abstarctclassesinterfaesannotations.abstractdemo;

public class main {
    public static void main(String[] args) {
        Son son =new Son(12);
        son.carrer();
        son.partner();
        System.out.println(son.age);
        Daughter daughter = new Daughter(20);
        daughter.carrer();
        daughter.partner();
        System.out.println(daughter.age);
//        Parent mom =new Parent();// we csnt create a object of parent abstract class
        Parent.hello();
        son.normal();


    }
}
