/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package insertionlistapp;

/**
 *
 * @author Admin
 */
public class InsertionListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Node[] myarray = new Node[10];
        for(int i=0;i<10;i++){
          int n = (int)(java.lang.Math.random()*99);
          Node newNode = new Node(n);
          myarray[i] = newNode;
        }
        for(int i=0;i<10;i++){
          System.out.print(myarray[i].item +" ");
        }System.out.println();
        
        InsertionList il = new InsertionList(myarray);
        
        for(int i=0;i<10;i++){
           myarray[i] = il.remove();
        }
        
         for(int i=0;i<10;i++){
          System.out.print(myarray[i].item +" ");
        }System.out.println();
        
    }
    
}
