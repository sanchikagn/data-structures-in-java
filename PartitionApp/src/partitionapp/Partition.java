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
public class Partition {
   private long[] theArray; // ref to array theArray
private int nElems; // number of data items
//--------------------------------------------------------------
public Partition(int max) // constructor
{
theArray = new long[max]; // create the array
nElems = 0; // no items yet
}
//--------------------------------------------------------------
public void insert(long value) // put element into array
{
theArray[nElems] = value; // insert it
nElems++;
}
public int size() // return number of items
{ return nElems; }
//--------------------------------------------------------------
public void display() // displays array contents
{
System.out.print("A = ");
for(int j=0; j<nElems; j++) // for each element,
System.out.print(theArray[j] + " "); // display it
System.out.println();
}
//--------------------------------------------------------------
public int partitionIt(int left, int right, long pivot)
{
int leftPtr = left - 1; // right of first elem
int rightPtr = right + 1; // left of pivot
while(true)
{
while(leftPtr < right && theArray[++leftPtr] < pivot); // (nop)
while(rightPtr > left && theArray[--rightPtr] > pivot); // (nop)

if(leftPtr >= rightPtr) // if pointers cross,
break; // partition done
else swap(leftPtr, rightPtr); // swap elements
} // end while(true)
return leftPtr; // return partition
} // end partitionIt()
//--------------------------------------------------------------
public void swap(int dex1, int dex2) // swap two elements
{
long temp;
temp = theArray[dex1]; // A into temp
theArray[dex1] = theArray[dex2]; // B into A
theArray[dex2] = temp; // temp into B
}
}
