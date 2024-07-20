package oops.properties.Abstaction.Abs;

public class Horse extends Animal {
    public Horse(String name, int age) {
        super(name, age);
        System.out.println("wow you have created horse");
    }

    @Override
    void walk() {
        System.out.println("horse walk on 4 leg");
    }


}
