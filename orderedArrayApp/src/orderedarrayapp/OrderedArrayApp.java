/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package orderedarrayapp;

/**
 *
 * @author Admin
 */
public class OrderedArrayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OrderedArray arr = new OrderedArray(20);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
         arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        
        System.out.println(arr.find(55));
        arr.display();
        
        arr.delete(00);
         arr.delete(55);
          arr.delete(99);
          
          arr.display();
    }
    
}
