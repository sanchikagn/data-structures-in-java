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
public class TreeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tree mytree = new Tree();
        mytree.insert(45);
        mytree.insert(99);
        mytree.insert(67);
        mytree.insert(35);
        mytree.insert(21);
        mytree.insert(72);
        mytree.insert(10);
        mytree.insert(25);
         mytree.insert(120);
        mytree.insert(195);
        
       mytree.inOrder(mytree.find(45));
       System.out.println();
       mytree.preOrder(mytree.find(45));
       System.out.println();
       mytree.postOrder(mytree.find(45));
       System.out.println();
       System.out.println();
       System.out.println();
       
       mytree.printLeaf(mytree.find(45));
        System.out.println();
       System.out.println();
       
       mytree.delete(99);
        mytree.inOrder(mytree.find(45));
       System.out.println();
       mytree.preOrder(mytree.find(45));
       System.out.println();
       mytree.postOrder(mytree.find(45));
       System.out.println();
       System.out.println();
       System.out.println();
       
       mytree.delete(21);
        mytree.inOrder(mytree.find(45));
       System.out.println();
       mytree.preOrder(mytree.find(45));
       System.out.println();
       mytree.postOrder(mytree.find(45));
       System.out.println();
       
    }
    
}
