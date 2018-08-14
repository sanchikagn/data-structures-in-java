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
public class LinkListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          LinkList mylist = new LinkList();         
          mylist.insertFirst(10);         
          mylist.insertFirst(20);         
          mylist.insertFirst(30);         
          mylist.insertFirst(40);         
          mylist.displayList(); 
          
          Node returnFirstnode = mylist.deleteFirst();;         
          
          if (returnFirstnode != null) {  
            System.out.print(" the deleted first element vaue is :");             
            System.out.println(returnFirstnode.item);         
          }  
        mylist.displayList();         
        Node returnNode = mylist.find(20);         
        
        if (returnNode != null) {             
            System.out.print(" the relevant searched element vaue is :");             
            System.out.println(returnNode.item);         
        }         
        
        mylist.delete(20);         
        mylist.displayList(); 
        System.out.println();
        
         FirstLastList mylist1 = new FirstLastList();         
          mylist1.insertFirst(10);         
          mylist1.insertFirst(20);         
          mylist1.insertFirst(30);         
          mylist1.insertFirst(40); 
          mylist1.insertLast(90);
          mylist1.displayList(); 
    }  
}  
    
    

