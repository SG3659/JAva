package Linkedlist;

public class CLL {
    private Node head;
    private Node tail;
    private int size;
     class Node{
         private int val;
         private Node next;

         public Node(int val, Node next) {
             this.val = val;
             this.next = next;
         }

         public Node(int val) {
             this.val = val;
         }
     }

    public CLL() {
        this.size = 0;
    }

    public void insert(int val){
         Node node=new Node(val);
         if(head==null){
             head=node;
             tail=node;
             return;
         }
         node.next=head;
         tail.next=node;
         tail=node;
    }
    public void display(){
         Node temp=head;
         if(head!=null){
             do{
                 System.out.print(temp.val+"->");
                 if(temp!=null){
                     temp=temp.next;
                 }
             }while(temp!=head);
         }
    }

}
//class Main{
//    public static void main(String[] args) {
//        CLL list=new CLL();
//        list.insert(5);
//        list.insert(10);
//        list.insert(30);
//        list.insert(40);
//        list.insert(50);
//
//        list.display();
//    }
//}
