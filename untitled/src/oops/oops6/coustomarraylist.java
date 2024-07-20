package oops.oops6;

import java.io.OptionalDataException;
import java.util.ArrayList;
import java.util.Arrays;


public class coustomarraylist {
    private int [] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;// it is also working as a index value

    public coustomarraylist() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        int [] temp=new int [data.length*2];
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
            if(data[i]>0){
                System.out.println(data[i]);
            }
        }
    }

    public int remove(){
        int remove =data[--size];
        return remove;
    }
    public int get(int index){
              return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, int value){
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

        coustomarraylist list =new coustomarraylist();
        list.add(10);
        list.add(20);
        list.display();
        for (int i = 0; i <20 ; i++) {
            list.add(2*i);
        }
        System.out.println(list);

    }
}
