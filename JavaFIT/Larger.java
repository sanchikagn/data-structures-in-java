import java.util.Scanner; public class Larger { public static void main (String[] args) { 
Scanner scan = new Scanner (System.in); System.out.print ("Enter a number: "); 
int x = scan.nextInt(); System.out.print ("Enter another: "); int y = scan.nextInt(); 
int large = (x>=y ?x : y); System.out.println ("The larger number is:" + large); } }