/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package insertionarrayapp;

/**
 *
 * @author Admin
 */
public class InsertSort {
   private long[] array;
   private int nElems;

    //---------------------------------------------------------------------------------
    public InsertSort(int max) {
        array = new long[max];
        nElems = 0;
    }
   public void insert(long h){
     array[nElems]= h;
     nElems++;
   }
   public void display(){
   for(int i =0; i<=nElems-1; i++){
      System.out.print(array[i] +" ");
    } System.out.println();
   }
   public void insertionSort(){}
}
