package oops.properties.inheritance;

public class main {
    public static void main(String[] args) {
//        Box box1=new Box();
//        System.out.println(box1.l+" " + box1.w+" " + box1.h);
//
//        Box box2=new Box(4);
//        System.out.println(box2.l+" " + box2.w+" " + box2.h);
//        Box box3=new Box(4,5,6);
//        System.out.println(box3.l+" " + box3.w+" " + box3.h);
//        Box box4=new Box(box1);
//        System.out.println(box4.l+" " + box4.w+" " + box4.h);

        // inheritance
        //Boxweight box=new Boxweight();

        //passing the box and boxweight value.
//        Boxweight box=new Boxweight(5,4,8,1);
//        System.out.println(box.l+" "+box.weight);

        //parent and  child

        //
       // Box box6 = new Boxweight(3,4,3,2);
        //System.out.println(box6.w);


        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
//        Boxweight box7 = new Box(3,3,4,5);
//        System.out.println(box7);
        BoxPrice box=new BoxPrice();

    }
}
