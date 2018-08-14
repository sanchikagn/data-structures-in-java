/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursivebinarysearchapp;

/**
 *
 * @author Admin
 */
public class RecursiveArray {
     private long[] array;
    private int nElems;
    private int curIn;

    //------------------------------------------------------------------------------
    public RecursiveArray(int max) {
        array = new long[max];
       nElems = 0;
       curIn=0;
    }
    public int size(){
       return nElems;
    }
    public int find(int key, int upperBound, int lowerBound){
    // lowerBound =0;
     //upperBound = nElems-1;
     //int curIn;
     if(lowerBound>upperBound)
           return nElems;
     
       curIn = (lowerBound+upperBound)/2;
       
       if(array[curIn]==key)
           return curIn; 
       else if(array[curIn]<key)
               return find(key,upperBound, curIn+1);
           else return find(key,curIn-1, lowerBound);
       }
    public void insert(long value){
        int j;
       for(j=0; j<nElems; j++)
         if(array[j]>value)
             break;
       for(int k=nElems; k>j; k--)
          array[k]= array[k-1];
       array[j]=value;
       nElems++;
     }
    public boolean delete(long value){
     int j = find((int)value,9,0);
     if(j==nElems)
         return false;
     else{
       for(int k=j; k<nElems; k++)
           array[k] =  array[k+1];
       nElems--;
       return true;
     }
    }
    public void display(){
        for(int j=0; j<nElems; j++)
            System.out.print(array[j] +" ");
        System.out.println();
    }
}
