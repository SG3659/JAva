package oops.oops1;

public class wraaper {
    public static void main(String[] args) {
        // java is work on call by value not by reffrence
//        int a=10;
//        int b=20;


        Integer a=10;
        Integer b=20;
        swap(a,b);
// its a reffrenc value  but is also not change
        System.out.println(a+" "+ b);
        // when a non primitive is final, you cannot assing it.

        final A sahil =new A("sahil gupta");
        sahil.name="other name";
        // we cant do this we cant reasign it
        //sahil= new A("new object");
    }
    static void swap(Integer a,Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }


}
class A{
    final int num=10;
    String name;
    public A(String name){
        this.name=name;
    }


}
