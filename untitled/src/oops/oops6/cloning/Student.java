package oops.oops6.cloning;

import java.util.Arrays;

public class Student implements Cloneable {
    int rollno;
    String name;
    int []arr;

    public Student(int rollno, String name ) {
        this.rollno = rollno;
        this.name = name;
        this.arr=new int[]{1,2,3,4,5};
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
class Main{
    public static void main(String[] args) throws CloneNotSupportedException {
            Student s1=new Student(101,"sahil");
            Student s2= (Student)s1.clone();
            System.out.println(s2);
        System.out.println(Arrays.toString(s2.arr));
        s2.arr[0]=100;
        System.out.println(Arrays.toString(s1.arr));



    }
}