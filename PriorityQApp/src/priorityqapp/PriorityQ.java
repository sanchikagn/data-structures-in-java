/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package priorityqapp;

/**
 *
 * @author Admin
 */
class PriorityQ {
  private int maxSize;
  private long[] qArray;
  private int nItems;
  private int front;
    //-----------------------------------------------------------------------------
    public PriorityQ(int s) {
       maxSize = s;
       qArray = new long[maxSize];
       nItems = 0;
       front = 0;
    }
  public void insert(long item){
    if(isFull())
        System.out.println("the queue is full");
    else {
        int i=0;
      while(i<maxSize){
        if(item > qArray[i])
          i++;
        else {
            qArray[i]=item;
            while(i<maxSize){
              i++;
            }
        }
      }
    }
  }
  public int remove(){
     long r = 0;
    if(isEmpty())
        System.out.println("the queue is empty");
    else{
      front--;
      r= qArray[front];
      nItems--;
    }return (int) r;
  }
  public long peekMin(){
    return qArray[front];
  }
  public boolean isEmpty(){
    return (nItems==0);  
  }
  public boolean isFull(){
    return (nItems==maxSize);
  }
  public void display(){//not for a circular queue
   for(int i=0;i<=maxSize-1;i++){
     System.out.println(qArray[i]);
   }
 }
}
