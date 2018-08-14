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
public class ListIteratorApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkList ll= new LinkList();
        ListIterator iter1 = ll.getIterator();
        int value;
        
        iter1.insertAfter(20);
         iter1.insertAfter(40);
          iter1.insertAfter(60);
           iter1.insertAfter(80);
           
       ll.displayList();
       iter1.reset();//20
       iter1.nextNode();//40
       System.out.println(iter1.getCurrent().data);//40
       iter1.insertBefore(50);
       iter1.insertAfter(70);
       ll.displayList();//20 50 40 70 60 80
       iter1.deleteCurrent();//current = 70
       ll.displayList();//20 50 40 60 80
    }
    
}
