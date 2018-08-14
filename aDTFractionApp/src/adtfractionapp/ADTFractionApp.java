/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adtfractionapp;

/**
 *
 * @author Admin
 */
public class ADTFractionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                System.out.println( "//////////Checking default contructor//////////");         
                ADTFraction t = new ADTFraction();          
                t.display();         
                System.out.println( t.value());                  
                System.out.println( "////////// Checking overloaded contructor////////");               
                ADTFraction t2 = new ADTFraction(4,2);          
                t2.display();         
                System.out.println( t2.value());                 
                System.out.println( "////////////Checking set function////////////////");          
                ADTFraction t3 = new ADTFraction();          
                t3.set(4, 2);        
                t3.display();         
                System.out.println( t3.value());                  
                System.out.println( "////////////Checking plus function//////////////////");         
                ADTFraction t4 = new ADTFraction(4,2);         
                ADTFraction t5 = new ADTFraction(6,3);         
                ADTFraction t6 = t4.plus(t5);         
                t6.display();         
                System.out.println(t6.value());                  
                System.out.println( "////////////Checking times function////////////////");          
                ADTFraction t7 = new ADTFraction(4,2);          
                ADTFraction t8 = t7.times(3);          
                t8.display();          
                System.out.println(t8.value());                  
                System.out.println( "////////////Checking times function////////////////");          
                ADTFraction t9 = new ADTFraction(4,2);          
                ADTFraction t10 = new ADTFraction(6,3);          
                ADTFraction t11 = t10.times(t9);          
                t11.display();          
                System.out.println(t11.value());                    
                System.out.println( "////////////Checking reciprocal function/////////////"); 
                ADTFraction t12 = new ADTFraction(4,2);          
                ADTFraction t13 = t12.reciprocal();          
                t13.display();          
                System.out.println(t13.value());   
                
                  System.out.println(ADTFraction.gcd(4, 7)); 
                  System.out.println(ADTFraction.lcm(4, 7)); 
    }
   
}
    

