/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bubblearrayapp;

/**
 *
 * @author Admpassn
 */
public class BubbleArray {
  private long[] a;
  private int nElems;

    //---------------------------------------------------------------------------------------
    public BubbleArray(int max) {
        a = new long[max];
        nElems = 0;
    }
  public void insert(long value){
   a[nElems]= value;
   nElems++;
  }
  public void display(){
    for(int i =0; i<=nElems-1; i++){
      System.out.print(a[i] +" ");
    } System.out.println();
  }
  public void swap(int one, int two){
     long s = a[one];
     a[one] = a[two];
     a[two] = s;
  }
  public void bubbleSort(){
      int k=0;
       for(int pass=nElems;pass>=0;pass--){
           for(int d=0; d<nElems-1;d++){
               k=d+1;
         if(a[d]>a[k])
           swap(d,k);
             }
      }
     }
  }

