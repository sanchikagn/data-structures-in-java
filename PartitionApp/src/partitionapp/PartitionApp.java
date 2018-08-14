/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package partitionapp;

/**
 *
 * @author Admin
 */
public class PartitionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int maxSize = 16; // array size
Partition arr = new Partition(maxSize); // create the array
for(int j=0; j<maxSize; j++) // fill array with
{ // random numbers
long n = (int)(java.lang.Math.random()*199);
n=(long)n;
arr.insert(n);
}
arr.display(); // display unsorted array
long pivot = 99; // pivot value
System.out.print("Pivot is " + pivot);
int size = arr.size();
// partition array
int partDex = arr.partitionIt(0, size-1, pivot);
System.out.println(" Partition is at index " + partDex);
arr.display();
    }
    
}
