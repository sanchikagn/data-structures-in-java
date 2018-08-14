/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doublylinklistapp;

/**
 *
 * @author Admin
 */
public class DoublyLinkList { 
    private Node head;
    private Node tail;
    private Node current;
    private Node previous;
    

    //----------------------------------------------------------------------------
    public DoublyLinkList() {
        head = null;
        tail = null;
        current = previous = null;
    }
    public boolean isEmpty(){
        return (head==null);
    }
    public void displayForward(){
       if(isEmpty())
            System.out.println("empty list");
        else{
        current = head;
        while(current != null){
            System.out.print(current.data +" ");
          current = current.next;
        }
    }System.out.println();
    }
    public void displayBackward(){
       current = tail;
      while(current!=null){
           System.out.print(current.data +" ");
       current = current.prev;
      }System.out.println();
    }
    public void insertFirst(int i){
        Node newNode = new Node(i);
      if(isEmpty())//no items
          tail = newNode;
      else head.prev = newNode;
    newNode.next= head;
    head = newNode;
    }
    public void insertLast(int i){
      Node newNode = new Node(i);
      if(isEmpty())//no items
          head = newNode;
      else {
          tail.next = newNode;
          newNode.prev = tail;
      }tail = newNode;
    }
    public void insertAfter(int key,int k){
     current = head;
     while(current.data!=key){
      current = current.next;
      if(current==null)
          break;
     }
     Node newNode = new Node(k);
     
     if(current==tail){
        newNode.next = null;
        tail= newNode;
     }else{
       newNode.next = current.next;
       current.next.prev = newNode;
     }
     newNode.prev = current;
     current.next = newNode;
    }
    public Node deleteFirst(){
      Node temp = null;
      if(head.next==null)
          tail =null;
      else head.next.prev = null;
      head=head.next;
      return temp;
    }
    public Node deleteLast(){
     Node temp = null; 
     if(head.next==null)
         head=null;
     else tail.prev.next=null;
     tail=tail.prev;
     return temp;
    }
    public Node deleteKey(int key){
       current = head;
       while(current.data!=key){
          current = current.next;
         if(current==null)
             return null;
       }
       if(current==head)
           head = current.next;
       else current.prev.next= current.next;
       
       if(current==tail)
           tail = current.prev;
       else current.next.prev = current.prev;
       return current;
    }
}

