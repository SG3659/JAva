package oops.oops6.compareobject;

public class Student implements Comparable<Student>{
    int roll;
    float marks;

    public Student(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("using this compareTo ");
        int diff= (int) (this.marks-o.marks);
        return diff;
    }
}
