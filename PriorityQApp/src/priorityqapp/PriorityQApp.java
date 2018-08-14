/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package priorityqapp;

/**
 *
 * @author Admin
 */
public class PriorityQApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PriorityQ qa = new PriorityQ(10);
        System.out.println("IsEmpty: " +qa.isEmpty());
        System.out.println("IsFull: " +qa.isFull());
        
        qa.insert(10);
        qa.insert(34);
        qa.insert(83);
        qa.insert(12);
        qa.insert(45);
      // System.out.println("size: " +qa.size());
        qa.insert(29);
        qa.insert(64);
        qa.insert(99);
        qa.insert(78);
        qa.insert(9);
        
      //  System.out.println("size: " +qa.size());
        
        System.out.println("IsEmpty: " +qa.isEmpty());
        System.out.println("IsFull: " +qa.isFull());
        
       System.out.println("peek: " +qa.peekMin());
        
        qa.remove();
        System.out.println("peek: " +qa.peekMin());
       System.out.println("IsEmpty: " +qa.isEmpty());
        System.out.println("IsFull: " +qa.isFull());
        
        qa.insert(100);
         //System.out.println("size: " +qa.size());
         System.out.println("peek: " +qa.peekMin());
         
          System.out.println("IsEmpty: " +qa.isEmpty());
        System.out.println("IsFull: " +qa.isFull());
        
        qa.display();
    }
    
}
