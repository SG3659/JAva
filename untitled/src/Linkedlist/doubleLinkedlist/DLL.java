package Linkedlist.doubleLinkedlist;


public class DLL {
    private Node head;

    private int size;

    public void inserFirst (int val){
        Node node =new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
        size+=1;
    }
    public  void insertLast(int val){
        Node node =new Node(val);
        Node last =head;
        node.next=null;
        if(head==null){// head is emppty
            node.prev=null;
            head=node;
            return;
        }
        while(last.next!=null){// check last on each node
            last=last.next;
        }
        last.next=node;
        node.prev=last;
    }
    public void display (){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val +"->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void displayReverse (){
        Node temp=head;
        Node last =null;
        while(temp!=null){
            System.out.print(temp.val +"->");
            last=temp;
            temp=temp.next;
        }
        System.out.println("END");
        while(last!=null){
            System.out.print(last.val+"->");
            last=last.prev;
        }
        System.out.println("START");
    }



    private class Node{
        private int val;
        private  Node next;
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
}
