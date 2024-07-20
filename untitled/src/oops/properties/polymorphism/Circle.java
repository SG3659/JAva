package oops.properties.polymorphism;

public class Circle extends Shapes {
    @Override
    void area(){
        System.out.println("pi*r*r");
    }
}
