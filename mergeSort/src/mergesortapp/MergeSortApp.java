/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mergesortapp;

/**
 *
 * @author Admin
 */
public class MergeSortApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int maxSize = 100; // array size
MergeSort arr = new MergeSort(maxSize); // create the array
arr.insert(64); // insert items
arr.insert(21);
arr.insert(33);
arr.insert(70);
arr.insert(12);
arr.insert(85);
arr.insert(44);
arr.insert(3);
arr.insert(99);
arr.insert(0);
arr.insert(108);
arr.insert(36);
arr.display(); // display items
arr.mergeSort(); // merge sort the array
arr.display(); // display items again
} // end main()
} // end class MergeSortApp
    
    

