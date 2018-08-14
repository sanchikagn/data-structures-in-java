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
import java.util.Scanner;
// A Java application class to convert a decimal number into the equivalent binary number
//The answer for (viii)

public class stackLinkedList {    
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a non-negative integer: ");
    int d = scn.nextInt();
          if(d == 0){
        System.out.printf("Binary equivalent is: \n0");
        }
        else if(d > 0){
             Stack stackApp = new Stack();
    while(d != 0){
        int remainder = d % 2;
        stackApp.push(remainder);
        d = d / 2;
}
    System.out.print("Binary equivalent is: ");
    while(!(stackApp.isEmpty())){
     System.out.print(stackApp.pop().data);
    }
    System.out.println();
        }
        else System.out.println("Enter a non-negative integer");
          
    }
    }
