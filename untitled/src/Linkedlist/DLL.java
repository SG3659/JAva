package Linkedlist;

import java.sql.SQLOutput;

public class DLL {

    private int size;
    private Node head ;
    class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public DLL() {
        this.size = 0;
    }


    public void inserFirst(int val){
        Node node =new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
        size++;
    }
    public void inserlast(int val){
        Node node =new Node(val);
        Node temp =head;
        node.next=null;
        if(head==null){
            head=node;
            node.prev=null;
            return;
        }
        while(temp.next!=null){// temp ate last
            temp=temp.next;
        }

        temp.next=node;
        node.prev=temp;
        size++;
    }
    public Node find(int val){
        Node node=head;
        while(node!=null){
            if(node.val==val){
                return node;
            }
            node=node.next;

        }
        return null;
    }
    public void insertafter(int after, int val){
        Node p =find(after);
        if(p==null){
            System.out.println("does not exist");
            return;
        }
        Node node=new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null) {
            node.next.prev = node;
        }
    }
    public void display(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void displayRev(){
        Node temp =head;
        Node last=null;
        while(temp!=null){
            last=temp;
            temp=temp.next;
        }
        while(last!=null){
            System.out.print(last.val+"->");
            last=last.prev;
        }
        System.out.println("END");
    }

}

//class Main{
//    public static void main(String[] args) {
//        DLL list = new DLL();
//        list.inserFirst(5);
//        list.inserFirst(3);
//        list.inserFirst(8);
//        list.display();
//        list.inserlast(10);
//        list.insertafter(3,16);
//        list.display();
//    }
//}
