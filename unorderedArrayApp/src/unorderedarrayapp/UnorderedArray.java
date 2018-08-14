/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unorderedarrayapp;

/**
 *
 * @author Admin
 */
public class UnorderedArray {
     private long[] array;
    private int nElems;

    //------------------------------------------------------------------------------
    public UnorderedArray(int max) {
        array = new long[max];
       nElems = 0;
    }
    public boolean find(long key){
        int j;
      for(j=0; j<nElems; j++)
          if(array[j]==key)
              break;
          if(j==nElems)
              return false;
          else return true;
    }
    public void insert(long value){
       array[nElems] = value;
       nElems++;
    }
    public boolean delete(long value){
       int j;
      for(j=0; j<nElems; j++)
          if(array[j]==value)
              break;
          if(j==nElems)
              return false;
          else {
              for(int k=j; k<nElems; k++)
                  array[k]= array[k+1];
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
