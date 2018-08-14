/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package orderedarrayapp;

/**
 *
 * @author Admin
 */
public class OrderedArray {
    private long[] array;
    private int nElems;

    //------------------------------------------------------------------------------
    public OrderedArray(int max) {
        array = new long[max];
       nElems = 0;
    }
    public int size(){
       return nElems;
    }
    public int find(int key){
     int lowerBound =0;
     int upperBound = nElems-1;
     int curIn;
     
     while(true){
       curIn = (lowerBound+upperBound)/2;
       if(array[curIn]==key)
           return curIn;
       else if(lowerBound>upperBound)
           return nElems;
       else{
           if(array[curIn]<key)
               lowerBound=curIn+1;
           else upperBound = curIn-1;
       }
     }
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
     int j = find((int)value);
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
