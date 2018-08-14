/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stacklinkedlist;

/**
 *
 * @author Admin
 */
class Stack { 
private Node top; //holds a reference to the top node

public Stack() { 
top = null; 
//A constructor to initialize top 
//The answer to (iii)
}
public boolean isEmpty() { 
return (top == null);
// A method to check the stack is empty or not
//The answer for (iv) 
}
public void push( int i) { 
Node pushNode = new Node(i); //creating a new node to push int i onto the stack
if(top == null){// if the stack is empty
top = pushNode; //assigning the new node as the top of the stack
top.next = null;
} else{
Node preTop = top; //preTop is the current top of the stack 
top = pushNode; //assigning the new node as the top of the stack 
top.next = preTop; //assigning the address of the previous top for the next of the new node
}
// A method to push an ‘int’ i onto the stack 
//The answer for (v)
}


public Node pop() { 
Node popNode;
if (isEmpty()) {
return null;
} else {
popNode = top;
top = popNode.next;
}
return popNode;
//A method to remove the top node and returns the reference of the removed node 
//The answer for (vi)
}


public Node peek() { 
if (isEmpty()) { //the stack is empty
return null;
} else {
return top;
}
//A method to peek the top node 
//The answer for (vii)
}
}


