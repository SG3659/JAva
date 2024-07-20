package oops.oops6;

import java.util.Arrays;


public class coustomgenericarraylist <T>{

    // generic is work on compile time
    // we cannot genric type with instance type
    private Object [] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;// it is also working as a index value

    public coustomgenericarraylist() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        Object [] temp=new Object [data.length*2];
        // copy the current item in the new array
        for (int i = 0; i < data.length ; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFull() {
        return size== data.length;
    }

    public  void display(){
        for (int i = 0; i <data.length ; i++) {

                System.out.println(data[i]);

        }
    }

    public T remove(){
        // cast: it is when we aading smaller type to bigger type
        T remove =(T)(data[--size]);
        return remove;
    }
    public T get(int index){
              return (T)data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, T value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "coustomarraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList <Integer> list =new ArrayList<>();
//        list.add(2);
//        list.set(1,085);

        coustomgenericarraylist<Integer> list =new coustomgenericarraylist<>();
//        list.add("assad");
//        list.add("asdas");
//        list.add("55");
        list.display();
//        for (int i = 0; i <20 ; i++) {
//            list.add(2*i);
//        }
        System.out.println(list);

    }
}
