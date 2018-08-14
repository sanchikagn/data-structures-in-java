package decimalToBinary;

/**
 *
 * @author Admin
 */
class stackArray {

    private int maxSize;   //size of stack array 
    private int[] stackData;
    private int top;  //top of stack 
    //-------------------------------------------------------------------------- 
    public stackArray(int s) {
        maxSize = s;
        stackData = new int[maxSize];
        top = -1;
    }   //constractor    
    public void push(int j) {
        if (isFull()) 
            System.out.println("Cannot insert: stack is full");
         else stackData[++top] = j;
       
    }   //put item on top of the stack 
   
       public int pop() throws Exception {         
           int result;         
           if (isEmpty()) {             
               throw new Exception("Stack is Empty");         
           } else {     
               result = stackData[top]; 
               top-- ;                 
       }         return result;     
     }//  take  item  from  top  of  stack 
    public int peek() throws Exception{
        if (isEmpty()) {
           throw new Exception("Stack is Empty");
        } else {
            return stackData[top];
        }
    }   //peek at top of the stack 
    public boolean isEmpty() {
        return (top == -1);
    }   //true if stack is empty 
    public boolean isFull() {
        return (top == maxSize - 1);
    }
       public void display() {         
           System.out.println("Current List Values are :");         
       for (int i = top; i >= 0; i--) {             
           System.out.println(stackData[i]);
       }    //print array values                   
       System.out.println(stackData.length);   //check the length of array         
       System.out.println(top); //check the value of the top    
    } 
}
