/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package selectionarray;

/**
 *
 * @author Admin
 */
public class SelectionArrayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SelectionArray sa= new SelectionArray(8);
        sa.insert(40);
        sa.insert(5);
        sa.insert(12);
        sa.insert(2);
        sa.insert(25);
        sa.insert(90);
        sa.insert(41);
        sa.insert(34);
        
        sa.display();
        long[] my = new long[10];
        
        selectionSort(my);
        my.display();
    }
    
}
