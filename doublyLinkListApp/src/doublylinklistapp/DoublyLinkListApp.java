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
public class DoublyLinkListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DoublyLinkList dll = new DoublyLinkList();
        
        dll.insertFirst(22);
        dll.insertFirst(44);
        dll.insertFirst(66);
        
        dll.insertLast(11);
         dll.insertLast(33);
        dll.insertLast(55);
        
        dll.displayForward();
        dll.displayBackward();
        
        dll.deleteFirst();
        dll.deleteLast();
        dll.deleteKey(11);
        
        dll.displayForward();
        
        dll.insertAfter(22,77);
        dll.insertAfter(33,88);
        
        dll.displayForward();
    }
    
}
