package oops.properties.Abstaction.Abs;

abstract class Animal {
    String name ;
    int age;
    abstract void walk();
    void breath(){
        System.out.println("for breathing they take air ");
    }

    public Animal(String name, int age) {
        this.name=name;
        this.age=age;
        System.out.println("you are about create a animal");
    }

}
