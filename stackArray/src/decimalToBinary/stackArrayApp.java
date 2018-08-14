/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimalToBinary;

/**
 *
 * @author Admin
 */
public class stackArrayApp {

    public static void main(String args[]) {
        stackArray sa1 = new stackArray(5);
        try {
            System.out.println(sa1.isFull());//false             
            System.out.println(sa1.isEmpty());  //true             
            sa1.push(10);
            sa1.push(11);
            sa1.push(12);
            sa1.push(20);
            sa1.push(30);
            sa1.display();   //top=4 length=5             
            System.out.println(sa1.isFull());    //true             
            System.out.println(sa1.isEmpty());  //false             
            System.out.println(sa1.peek() + " is the current first value of the List");
            System.out.println(sa1.pop() + " is deleted");
            System.out.println(sa1.pop() + " is deleted");
            System.out.println(sa1.peek() + " is the current first value of the List");
            sa1.display();//top=2 length=5             
            System.out.println(sa1.isFull());     //false             
            System.out.println(sa1.isEmpty());  //false 
            
              Conversion obj2 = new Conversion();             
              obj2.decimalToBinary(20); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
