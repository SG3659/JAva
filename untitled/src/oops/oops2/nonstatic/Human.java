package oops.oops2.nonstatic;

public class Human {
    String message;//non static
    // access non sataic in static method by:
    //In fact, you can access a non-static member in a static
    // context by specifying the object reference explicitly :
    public static void dispaly(Human human){
        System.out.println(human.message);
    }

    public static void main(String[] args) {
        Human sahil=new Human();
        sahil.message="sahil's message";
        Human.dispaly(sahil);
    }
}
