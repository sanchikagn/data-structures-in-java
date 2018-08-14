/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queuelinklistapp;

/**
 *
 * @author Admin
 */
public class QueueLinkListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    QueueLinkList qll = new QueueLinkList();
    qll.insert(20);
    qll.insert(40);
    
    qll.displayList();
    
    qll.insert(60);
    qll.insert(80);
    
    qll.displayList();
    
    qll.remove();
    qll.remove();
    
    qll.displayList();
    }
    
}
