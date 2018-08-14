/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linklistapp;

/**
 *
 * @author Admin
 */
public class FirstLastList {
    private Node head;
    private Node tail;
    Node current;

    //----------------------------------------------------------------------------------
    public FirstLastList() {
        head = null;
        tail = null;
        current = null;
    }
    public boolean isEmpty(){
      return (head==null);
    }
    public void insertFirst(int i){
      Node newNode = new Node(i);
          newNode.next = head;
          head = newNode;
    }
     public void insertLast(int i){
         current = head;
      while(current.next!=null){
       current = current.next;
      }
      Node lastNode = new Node(i);
      current.next = lastNode;
      lastNode.next = null;
     }
    public Node deleteFirst(){
       Node temp = null;
         if(isEmpty())
            System.out.println("the list is empty");
        else{
            temp = head;
           head = temp.next;
         temp.next = null;
         } return temp;
    }
    public void displayList(){
      if(isEmpty())
            System.out.println("empty list");
        else{
        current = head;
        while(current != null){
            System.out.println(current.item);
          current = current.next;
        }
      }
    }
}
