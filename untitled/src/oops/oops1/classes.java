package oops.oops1;

public class classes {
    public static void main(String[] args) {
        //class is a name of group of properties and a function
        //Student []students =new Student[5];

        //Student sahil =new Student();
       // System.out.println(sahil.rno);
        //System.out.println(sahil.name);
        //System.out.println(sahil.marks);

        // constructor function
        //Student sahil =new Student();


        //sahil.changename("sahil gupta ");
        //sahil.greeting();

        Student sahil =new Student(12,"sahil",86.5f);
        System.out.println(sahil);
        // create another object and taking value from another object
        Student random =new Student(sahil);
        System.out.println(random.name);

        //calling the constructir from another constructor function
        Student random2=new Student();
        System.out.println(random2.name);

        // memory allocation of 'new' keyword

        Student one= new Student();
        Student two =one;
        one.name="something something";
        System.out.println(two.name);
        System.out.println(two.rno);


    }
}
// create a class
// for every singlr student

    /*class Student {
        int  rno;
        String  name;
        float marks;
    }*/

//constructor

    class Student {
        int rno;
        float marks;
        String name;
        void greeting(){
            System.out.println("Hello my name is  "+ name);
        }
        void changename(String newName){
            name= newName;
        }
        void changenamewiththis(String name){
            this.name= name;
        }
        /*Student(){
            this.rno=12;
            this.name= "sahil";
            this.marks=86.5f;
        }*/
        //calling the constructir from another constructor function
        Student (){
            this(21,"sahil gupta",85.5f);
        }

        Student(int rno, String name,float marks){
            this.rno=rno;
            this.name= name;
            this.marks=marks;
        }
        // create another constructor and taking value from another object
        Student (Student other){
            this.name= other.name;
            this.rno= other.rno;
            this.marks= other.marks;

        }

    }

