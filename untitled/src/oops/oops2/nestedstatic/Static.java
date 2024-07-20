package oops.oops2.nestedstatic;

public class Static {
    static class test{
        String name;
        public test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        test a =new test("sahil");
        System.out.println(a.name);


    }
}
