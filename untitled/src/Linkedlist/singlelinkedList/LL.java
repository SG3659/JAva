package Linkedlist.singlelinkedList;


public class LL {
    private class Node{
        private int val;
        private Node next ;// it is just point or reffrence variable  point to the object that i have provided

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }




    private Node head;
    private Node tail;
    // head and tails are reffrence variable and pointing to the nodes
    private int size;

    public LL() {
        this.size = 0;
    }
    public void display(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.val
                    +"->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void inseerFirst(int val ){
        Node node =new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertLast (int val ){
        if(tail==null){
            inseerFirst(val);
            return;
        }
        Node node=new Node(val);
            // constant time complexity
//        tail.next=node;
//        tail=node;
//        size+=1;
        // O(n) time complexity here
        Node temp=tail;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        size+=1;
    }

    public void insert (int val,int index){
        if(index==0){
            inseerFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;

    }

    public int deleteFirst(){
        int val=head.val;
        head=head.next;
        if(head == null){
            tail=null;
        }
        size--;
        return val;
    }



}
