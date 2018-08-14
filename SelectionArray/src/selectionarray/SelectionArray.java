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
public class SelectionArray {
    private long[] myarray;
    int nElems;

    public SelectionArray(int k) {
        myarray = new long[k];
        nElems = 0;
    }
    public void insert(long value){
   myarray[nElems]= value;
   nElems++;
  }
    public void display(){
    for(int i =0; i<=nElems-1; i++){
      System.out.print(myarray[i] +" ");
    } System.out.println();
  }
    public int findMin(long array[], int n){
    int pos = n;
    for(int i=n+1;i<array.length;i++)
       if(array[i]<array[pos])
           pos = i;
       return pos;
    }
    public void swap(int one, int two){
     long s = myarray[one];
     myarray[one] = myarray[two];
     myarray[two] = s;
  }
    public void selectionSort(long[] array){
          for(int i=0;i<array.length-1;i++){
             int pos = findMin(array,i);
             swap(i,pos);
          }  
    }
}
