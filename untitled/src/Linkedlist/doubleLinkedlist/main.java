package Linkedlist.doubleLinkedlist;

public class main {

    public static void main(String[] args) {
        DLL list =new DLL();
        list.inserFirst(8);
        list.inserFirst(3);
        list.inserFirst(2);
        list.inserFirst(5);
        list.display();
        list.insertLast(10);
        list.displayReverse();
    }
}
