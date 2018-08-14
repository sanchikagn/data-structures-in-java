/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queuearrayapp;

/**
 *
 * @author Admin
 */
public class QueueArray {
    
private int maxSize ; 
private int[] queArray ;  
private int front ;  
private int rear ; 
private int nItems ;  
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - //
public QueueArray(int k){
maxSize = k ; 
queArray = new int[maxSize] ;  
front =0;  
rear =-1; 
nItems =0;
}
 public void insert(int i){
 if(isFull()){
   System.out.println("Queue is full");
 }else{
   rear=(rear+1)%maxSize;
   queArray[rear]=i;
   nItems++;
 }
 }
 public int remove() {
     int r=0;
     if(isEmpty()){
       System.out.println("Queue is empty");
     }else{
   front++;
   r = queArray[front];
   nItems--;
     }return r;
 } 
 public int peek() {
 return queArray[front];
 }  
 public boolean isEmpty(){
return (nItems==0);     
//return (front==0&&rear==-1);
 }
 public boolean isFull() {
     return (nItems==maxSize);
 //return (front==0&&rear==maxSize-1);
 } 
 public int size(){
    // nItems = rear - front +1; this valid for linear queues
   return nItems;
 }
 public void display(){//not for a circular queue
   for(int i=0;i<=maxSize-1;i++){
     System.out.println(queArray[i]);
   }
 }
}
