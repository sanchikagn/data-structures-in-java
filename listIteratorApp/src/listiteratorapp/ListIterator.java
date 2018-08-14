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
public class ListIterator {
  private Node prev;
  private Node current;
  private LinkList mylist;

    //---------------------------------------------------------------------------------
    public ListIterator(LinkList list) {
        mylist = list;
        reset();
    }
    public void reset(){
      current = mylist.getFirst();
      prev = null;
    }
    public boolean atEnd(){
      return (current.next==null);
    }
    public void nextNode(){
      prev = current;
      current=current.next;
     }
    public Node getCurrent(){
      return current;
    }
    public void insertAfter(int n){
      Node newNode = new Node(n);
      if(mylist.isEmpty()){
         mylist.setFirst(newNode);
         current = newNode;
      }else {
        newNode.next=current.next;
        current.next=newNode;
        nextNode();
      }
    }
    public void insertBefore(int n){
      Node newNode = new Node(n);
      
      if(prev==null){
        newNode.next=mylist.getFirst();
        mylist.setFirst(newNode);
        reset();
      }else{
         newNode.next=prev.next;
         prev.next=newNode;
      }
    }
    public int deleteCurrent(){
       int value = current.data;
       if(prev==null){
         mylist.setFirst(current.next);
         reset();
       }else {
         prev.next=current.next;
         if(atEnd())
             reset();
         else current = current.next;
       }return value;
    }
}
