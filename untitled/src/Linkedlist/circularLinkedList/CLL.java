package Linkedlist.circularLinkedList;

public class CLL {
    private Node head ;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insertfirst(int val){

        Node node =new Node(val);
        if(head==null){
            tail=node;
            head=node;
            return;
        }
        tail.next =node;
        node.next=head;
        tail=node;
    }
    public void display (){
        Node temp =head ;
        if(head!=null){
            do {
                System.out.print(temp.val +"->");
                if(temp.next!=null){
                    temp=temp.next;
                }
            }while(temp!=head);
        }
        System.out.println("Head");
    }

    public void delete(int val){
        Node node =new Node(val);
        if(node== null){
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            return;
        }
        if(node.val==val){
            head=head.next;
            tail.next=head;
            return;
        }
        do {
            Node n=node.next;
            if(n.val==val){
                node.next=n.next;
                break;
            }
            node=node.next;
        }while(node!=head);
    }

    private class Node{
         int val;
         Node next;

        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
