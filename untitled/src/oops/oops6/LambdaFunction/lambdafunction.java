package oops.oops6.LambdaFunction;

import java.util.ArrayList;
import java.util.function.Consumer;

public class lambdafunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            arr.add(i+1);
            System.out.println(arr);
        }
//        arr.forEach((item)-> System.out.println(item*2));

        Consumer<Integer> fun =((item)-> System.out.println(item*2));
            arr.forEach(fun);
    }


}