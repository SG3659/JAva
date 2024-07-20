package oops.properties.polymorphism;

public class Overloading {



        String name;
        int age;

    public Overloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public  void displayInfo(String name){
            System.out.println(name);
        }
        public  void displayInfo(int age){
            System.out.println("age:"+age);

        }
        public void  displayInfo(String name,int age){
            System.out.println("name"+name);
            System.out.println("age"+age);
        }
}



