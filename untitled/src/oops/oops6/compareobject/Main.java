package oops.oops6.compareobject;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student a=new Student(10,85);
        Student b=new Student(11,81);
        Student c=new Student(12,87);
        Student d=new Student(13,89);
        Student f=new Student(14,84);
//        if(a.compareTo(b)<0){
//            System.out.println("b has more marks");
//        }
//        System.out.println(a.compareTo(b));

        Student[] list={a,b,c,d,f};
        System.out.println(Arrays.toString(list));
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                System.out.println("using comparator");
//                return (int)(o1.marks-o2.marks);
//            }
//        });
        Arrays.sort(list,(o1,o2)->(int)(o1.marks-o2.marks));
        System.out.println(Arrays.toString(list));

        
    }

}
