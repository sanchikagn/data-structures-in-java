/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bubblearrayapp;

/**
 *
 * @author Admin
 */
public class BubbleArrayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BubbleArray ba= new BubbleArray(8);
        ba.insert(40);
        ba.insert(5);
        ba.insert(12);
        ba.insert(2);
        ba.insert(25);
        ba.insert(90);
        ba.insert(41);
        ba.insert(34);
        
        ba.display();
        
        ba.bubbleSort();
        ba.display();
      
    }
    
}
