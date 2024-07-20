package oops.oops2.staticExample;

public class InnerClass {
   static class Test{
         String name;
       public Test(String name){
            this.name=name;
        }

       @Override
       public String toString() {
           return name;
       }
   }

    public static void main(String[] args) {
        Test a=new Test ("sahil");
        Test b=new Test ("nikhil");
        System.out.println(a);
        System.out.println(b.name);
    }
}
