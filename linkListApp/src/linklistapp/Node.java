/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linklistapp;

/**
 *
 * @author Admin
 */
public class Node {
    public int item;
    public Node next;

    //----------------------------------------------------------------------------
    public Node(int i) {
        item = i;
        next = null;
    }
  public void displayNode(){
    System.out.println(item);
  }
}
