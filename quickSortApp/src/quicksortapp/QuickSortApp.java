/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quicksortapp;

/**
 *
 * @author Admin
 */
public class QuickSortApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int maxSize = 16; // array size
QuickSort arr = new QuickSort(maxSize); // create array
for(int j=0; j<maxSize; j++) // fill array with
{ // random numbers
long n = (int)(java.lang.Math.random()*99);
arr.insert(n);
}
arr.display(); // display items
arr.quickSort(); // quicksort them
arr.display(); // display them again
    }
    
}
