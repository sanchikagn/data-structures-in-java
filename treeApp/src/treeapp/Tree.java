/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package treeapp;

/**
 *
 * @author Admin
 */
public class Tree {
    private Node root;
    private Node current;
    private Node parent;
    //------------------------------------------------------
    public Tree() {
        root=null;
        current = parent = null;
    }
    public Node find(int key){
      current = root;
      while(current.item != key) // while no match,
{
if(key < current.item) // go left?
current = current.left;
else
current = current.right; // or go right?
if(current == null) // if no child
return null; // didn’t find it
}
return current; // found it
     
    }
    public void insert(int i){
      Node newNode = new Node(i); // make new node
if(root==null) // no node in root
root = newNode;
else // root occupied
{
current = root; // start at root
while(true) // (exits internally)
{
parent = current;
if(i < current.item) {
current = current.left;
if(current == null) // if end of the line,
{ parent.left = newNode;
return;}
} else // or go right?{
    current = current.right;
if(current == null)  { // insert on right
   parent.right = newNode;
   return;}
   } // end else go right
  } // end while
 } 
    //---------------------------------------------------------------------------------
   public boolean delete(int key){ // (assumes non-empty list)
current = root;
parent = root;
boolean isLeftChild = true;

while(current.item != key) {
 parent = current;
 if(key < current.item){
 isLeftChild = true;
current = current.left;
}
else {isLeftChild = false;
current = current.right;
}
if(current == null) // end of the line,
return false; // didn’t find it
} // end while
//when key==current.item
if(current.left==null && current.right==null){//no children
  if(current == root) // if root,
  root = null; // tree is empty
  else if(isLeftChild)
  parent.left = null; // disconnect
  else // from parent
  parent.right = null;}  
//-------------------------------------------------
//one child
else if(current.right==null)//only left child
 if(current == root)
 root = current.left;
 else if(isLeftChild) // left child of parent
 parent.left = current.left;
 else // right child of parent
 parent.right = current.left;
// if no left child, replace with right subtree

else if(current.left==null)//only right child
if(current == root)
root = current.right;
else if(isLeftChild) // left child of parent
parent.left = current.right;
else parent.right = current.right;
//-------------------------------------------------------------------------------
//two children
   else{
// get successor of node to delete (current)
Node successor = getSuccessor(current);
// connect parent of current to successor instead
if(current == root)
root = successor;
else if(isLeftChild) parent.left = successor;
else
parent.right = successor;
// connect successor to current’s left child
successor.left = current.left;
} // end else two children
// (successor cannot have a left child)
return true;
}

public Node getSuccessor(Node delNode){
Node successorParent = delNode;
Node successor = delNode;
Node current = delNode.right; // go to right child
while(current != null) // until no more
{ // left children,
successorParent = successor;
successor = current;
current = current.left; // go to left child
}
// if successor not
if(successor != delNode.right) // right child,
{ // make connections
successorParent.left = successor.right;
successor.right = delNode.right;
}
return successor;
}

    public Node minimum(){
Node last = null;
current = root; // start at root
while(current != null) // until the bottom,
    {
last = current; // remember node
current = current.left; // go to left child
}
return last;
}
     public Node maximum(){
Node last = null;
current = root; // start at root
while(current != null) // until the bottom,
    {
last = current; // remember node
current = current.right; // go to left child
}
return last;
}
    public void inOrder(Node localRoot){
if(localRoot != null){
inOrder(localRoot.left);
System.out.print(localRoot.item +" ");
inOrder(localRoot.right);
        }
  }
    public void preOrder (Node localRoot) {
        if(localRoot == null)
        return;
        System.out.print(localRoot.item +" ");
            preOrder(localRoot.left);         
            preOrder(localRoot.right);
	}
    public void postOrder(Node localRoot)
{
if(localRoot != null)
{
postOrder(localRoot.left);
postOrder(localRoot.right);
System.out.print(localRoot.item + " ");
}
}
    public Node isLeaf(Node n){     
if(n==null)
if(n.left==null && n.right==null)
    return n;
isLeaf(n.left);
isLeaf(n.right);
        return null;
        
}
  public void printLeaf(Node leaf)
  {
    System.out.print(isLeaf(leaf).item +" ");
  }

}
