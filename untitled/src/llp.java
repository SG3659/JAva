import Linkedlist.SLL;

public class llp {
    private Node head;
    private int size;
    class Node {
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

    public llp() {
        this.size = 0;
    }

    public void insertfirst(int val){
     Node node =new Node(val);
     node.next=head;
     node.prev=null;
        if (head != null) {
            head.prev=node;
        }
     head=node;
     size++;
    }
    public void insertlast(int val){
        Node node =new Node(val);
        Node temp=head;
        if(head==null){
            head=node;
            node.prev=null;
            return;
        }
        while(temp.next!=null ){
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
        node.next=null;
        size++;
    }
    public Node find (int val){
        Node temp=head;
        while(temp!=null){
            if(temp.val==val){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void insertafter(int after, int val){
        Node node =new Node(val);
        Node p=find(after);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev=node;
        }
        size++;

    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }

}

class LLMAin{
    public static void main(String[] args) {
        llp list =new llp();
        list.insertlast(1);
        list.insertlast(2);
        list.insertlast(3);
        list.insertlast(4);
        list.insertlast(5);
        list.insertafter(3,10);
        list.display();
    }
}
