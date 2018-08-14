/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listiteratorapp;

/**
 *
 * @author Admin
 */
public class LinkList {
    private Node head;
    private Node current;
    //------------------------------------------------------------------------------------
    public LinkList() {
        head = null;
        current = null;
    }
    public Node getFirst(){
     return head;
    }
    public void setFirst(Node f){
      head = f;
    }
    public boolean isEmpty(){
      return (head==null);
    }
    public ListIterator getIterator(){
      return new ListIterator(this);
    }
    public void displayList(){
      current = head;
      while(current!=null){
         System.out.print(current.data +" ");
         current=current.next;
      }System.out.println();
    }

   
}
