/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        
        Node newNode=head;
        int l=1;
        
        while(newNode.next!=null){
            newNode=newNode.next;
            l++;
        }
        
        k=k%l;
        if(k==0){
            return head;
        }
        Node res=head;
        
        for(int i=1;i<k;i++){
            res=res.next;
        }
        
        Node res1=res.next;
        res.next=null;
        newNode.next=head;
        
        return res1;
        
    }
}
