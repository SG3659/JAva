package Linkedlist.singlelinkedList;

import Linkedlist.singlelinkedList.LL;

public class main {
    public static void main(String[] args) {
        LL list =new LL();
        list.inseerFirst(1);
        list.inseerFirst(2);
        list.inseerFirst(3);
        list.inseerFirst(4);
        list.inseerFirst(5);
        list.insertLast(45);
        list.insert(52,3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
    }

}
