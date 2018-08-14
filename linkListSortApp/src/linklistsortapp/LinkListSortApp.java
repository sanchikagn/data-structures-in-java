/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linklistsortapp;

/**
 *
 * @author Admin
 */
public class LinkListSortApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkListSort lss = new LinkListSort();
        lss.insert(20);
        lss.insert(40);
        
        lss.displayList();
        
        lss.insert(10);
        lss.insert(30);
        lss.insert(50);
        
        lss.displayList();
        
        lss.deleteFirst();
        
        lss.displayList();
    }
    
}
