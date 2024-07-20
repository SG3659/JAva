package Linkedlist.qnsleetcode;

import Linkedlist.SLL;
import org.w3c.dom.Node;

public class leetcode {
    private int size;
    private Node head;
    private Node tail;
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

    public leetcode() {
        this.size = 0;
    }
    // remove duplicate
    public void duplicateRem(){
        Node node=head;
        while(node.next!=null){
            if(node.val==node.next.val){
                node.next=node.next.next;
                size--;
            }else{
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;

    }

    // merge 2 sort list
    public static SLL merger(SLL first ,SLL second){
        Node f=first.head;
        Node s=second.head;
        SLL ans=new SLL();
        while(f!=null && s!=null){
            if(f.val<s.val){
                ans.insertlast(f.val);
                f=f.next;

            }else{
                ans.insertlast(s.val);
                s=s.next;
            }
        }
        while(f!=null) {
            ans.insertlast(f.val);
            f = f.next;

        }
        while(s!=null) {
            ans.insertlast(s.val);
            s = s.next;

        }
        return ans;
    }


    // happy nimber
    public boolean isHappy(int n) {
        int slow =n;
        int fast=n;
        do{
            slow=findsquare(slow);
            fast=findsquare(findsquare(fast));
        }while (slow!=fast);
        if(slow==1){
            return true;
        }
        return false;
    }
    private int findsquare(int number){
        int ans=0;
        while(number>0){
            int rem =number%10;
            ans+=rem*rem;
            number=number/10;
        }
        return  ans;
    }


    // recusice reverserse the linkedlist

    private void reverse(Node node){
        if(node==tail){
            head=tail;
            return;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }


    // iteration method by 3 pointer
    private void recerseitr(Node node ){
         Node prev=null;
         Node pres=head;
         Node next=pres.next;
         while(pres!=null){
             pres.next=prev;
             prev=pres;
             pres=next;
             if(pres!=null){
                 next=next.next;
             }
         }
         head=prev;

    }

    // sort list

//    public ListNode sortList(ListNode head){
//        if(head==null && head.next==null){// single last node
//            return head;
//        }
//        ListNode mid =getMid(head);
//        ListNode left= sortList(head);
//        ListNode rigth =sortList(mid);
//        return mergeTwoLists(left,rigth);
//    }
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode ans =new ListNode();
//        ListNode tail=ans;
//        while(list1!=null && list2!=null){
//            if(list1.val<list2.val){
//                tail.next=list1;
//                list1=list1.next;
//
//            }else{
//                tail.next=list2;
//                list2=list2.next;
//
//            }
//            tail=tail.next;
//
//        }
//        if(list1==null){
//            tail.next=list2;
//        }
//        if(list2==null){
//            tail.next=list1;
//        }
//        return ans.next;
//    }
//    public ListNode getMid(ListNode head){
//     ListNode midPrev =null;
//     while(head!=null && head.next!=null){
//         midPrev =(midPrev == null )? head :midPrev.next;
//         head=head.next.next;
//     }
//     ListNode mid =midPrev.next;
//     midPrev.next=null;
//     return mid;
//    }



    //palindrome of linkedlist

}
