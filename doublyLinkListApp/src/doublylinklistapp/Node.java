/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doublylinklistapp;

/**
 *
 * @author Admin
 */
public class Node {
     public int data;
    public Node next;
    public Node prev;

    //-----------------------------------------------------------------------------
    public Node(int i) {
       data = i;
       next = prev = null;
    }
    public void displayNode(){
    System.out.println(data);
  }
}
