package oops.oops5abstarctclassesinterfaesannotations.interfaces.nestedinterface;

public class A {
    // nested inteface can be decleard as all 3 access modifier
    public interface NestedInterfaces{
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterfaces{

    @Override
    public boolean isOdd(int num) {
        return (num & 1)==1;
    }
}
class Main{
    public static void main(String[] args) {
        B obj =new B();
        System.out.println(obj.isOdd(4));

    }
}
