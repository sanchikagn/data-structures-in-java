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
public class LinkList {  
    private Node head;
    private Node current;
    private Node previous;
//------------------------------------------------------------------
    public void LinkList() {         
        head = null;
        current = previous = null;
    }    
    public boolean isEmpty() {         
        return (head == null);     
    }  
    public void insertFirst(int i) { 
          Node newNode = new Node(i);
          newNode.next = head;
          head = newNode;
        
    }  
    public Node deleteFirst() {  
        Node temp = null;
         if(isEmpty())
            System.out.println("the list is empty");
        else{
            temp = head;
           head = temp.next;
         temp.next = null;
         } return temp;
    }  
    public void displayList() { 
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
    public Node find(int key) {       
        if(isEmpty())
            System.out.println("the list is empty");
        else{
             current = head;
            
          while(key != current.item){
            if(current.next==null)
               return null;
             else 
                current = current.next;
             }                             
           }                    
        return current;
       }      
    public void delete(int key) {   
        previous = head;
         current = head;
            
          while(current.item!=key){
            if(current.next==null)
                break;
             else {
               previous = current;
                current = current.next;
               }
             } 
          if(current==head)//first item
           head = head.next;      
      else if(current==null)
             System.out.println("no items");
      else{ 
          previous.next = current.next;
    } 
} 
}
