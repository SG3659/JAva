package Linkedlist;

import java.security.PublicKey;



public class SLL {
    class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    private int size;
    private Node head;
    private Node tail;
    public SLL() {
        this.size = 0;
    }
    public void insertfirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;

    }
    public void  insertlast(int val){
        if(tail==null){
            insertfirst(val);
            return ;
        }
        Node node =new Node(val);
        tail.next=node;
        tail=node;
        size+=1;

    }
    public void insert(int val ,int index ){
        if(index==0){
            insertfirst(val);
            return;
        }
        if(index==size){
            insertlast(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index ; i++) {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size+=1;
    }
    public void display(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
//    public int getsize(){
//        Node temp=head;
//        while(temp!=null){
//
//        }
//        return;
//    }

    public int deletefirst(){
        int val = head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
//    public int deletelast(){
//        if(size<=1){
//           return deletefirst();
//        }
//        Node secondlast =get(size-2);
//        int val=tail.;
//        tail=secondlast;
//        tail.next=null;
//        return val;
//    }
    public Node get(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
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
    public int delete(int index){
        if (index==0){
            return deletefirst();
        }
//        if(index==size-1){
//            return deletelast()
//        }
        Node prev=get(index-1);
        int val=prev.next.val ;
        prev.next=prev.next.next;
        return val;
    }

}



class SMain{
    public static void main(String[] args) {
        SLL list  =new SLL();
        list.insertfirst(5);
        list.insertfirst(10);
        list.insertlast(40);
        list.display();
        list.insertlast(40);
        list.insertfirst(5);
        list.insert(100,3);
        list.display();
//        System.out.println(list.deletefirst());
//        System.out.println(list.deletelast());
        System.out.println( list.delete(1));
        list.find(100);

        list.display();

    }
}
