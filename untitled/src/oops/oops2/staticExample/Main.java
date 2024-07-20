package oops.oops2.staticExample;

public class Main {
    public static void main(String[] args) {
        human sahil =new human(22,"sahil gupta",1000,false);
        human nikhil =new human(23,"nikhil gupta",100000,false);

        System.out.println(sahil.population);
        System.out.println(nikhil.population);
        System.out.println(human.population);
    }
    // this is not dependent
//    static void fun(){
//        //greeting();
//        //you cannot access non
//        Main obj= new Main();
//        obj.greeeing();
//    }
//    void greeeing(){
//        System.out.println("hii guys");
//    }
}
