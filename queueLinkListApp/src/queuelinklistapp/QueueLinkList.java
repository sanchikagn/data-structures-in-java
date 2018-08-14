/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queuelinklistapp;

/**
 *
 * @author Admin
 */
public class QueueLinkList {
    private Node tail;
    private Node head;

    //-----------------------------------------------------------------------------------
    public QueueLinkList() {
        head = tail = null;
    }
    public boolean isEmpty(){
     return (head==null);
    }
    public void insert(int i){
        Node queueIn = new Node(i);
       if(isEmpty())
           head = queueIn;
       else tail.next= queueIn;
       tail = queueIn;
    }
    public int remove(){
      int r=0;
      Node temp;
      if(isEmpty())
          System.out.println("queue is empty");
      else {
          temp = head;
          head = temp.next;
          temp.next=null;
         r = temp.item;
      }return r;
    }
    public void displayList(){
        Node current;
         if(isEmpty())
            System.out.println("empty list");
        else{
        current = head;
        while(current != null){
            System.out.print(current.item +" ");
          current = current.next;
        }
      } System.out.println();
    }
}
