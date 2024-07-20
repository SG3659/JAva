public class oop1 {
    public void main(String[] args) {
        Student sahil = new Student(12, "sahil gupta", 98.4f);
        System.out.println(sahil.rno);
        System.out.println(sahil.name);
        System.out.println(sahil.marks);

    }

    class Student {
        int rno;
        String name;
        float marks;

        // constructor
        //we need to add a way the values of the above
        // properties object by object
        // we need one to acess every object

        // with attribute function call above
        // this is the correct way of initialising the object

        Student(int rno, String name, float marks) {
            // without this we dont have the same variable name
            this.rno = rno;
            this.name = name;
            this.marks = marks;
            //rno=roll;
            //name=naaam;
            //marks=percentage;

        }
    }
}




