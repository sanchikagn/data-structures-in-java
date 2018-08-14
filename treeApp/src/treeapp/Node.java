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
public class Node {
     int item;
    Node left;
  Node right;

    //----------------------------------------------------------------------------
    public Node(int n) {
        item = n;
        left = right = null;
    }
  public void displayNode(){
   System.out.println(item);
  }
}
