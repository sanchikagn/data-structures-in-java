/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package insertionlistapp;

/**
 *
 * @author Admin
 */
public class InsertionList {
    private Node head;
    private Node previous;
    private Node current;
    //----------------------------------------------------------------------------
    public InsertionList() {
        head = null;
        current = previous = null;
    }
    public InsertionList(Node[] array){
      head = null;
      for(int j=0; j<array.length; j++){
        insert(array[j]);
      }
    }
    public void insert(Node n){
      previous = null;
      current = head;
      while(current!=null && n.item>current.item){
        previous = current;
        current = current.next;
      }
      if(previous ==null)
          head = n;
      else previous.next = n;
      n.next = current;
    }
    public Node remove(){
      Node temp = head;
      head = head.next;
      return temp;
    }
}
