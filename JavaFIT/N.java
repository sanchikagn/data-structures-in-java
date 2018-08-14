import java.util.Scanner;

public class N {
public static void main (String[] args) {
String name,town;
Scanner scan = new Scanner (System.in);
System.out.print ("Enter your name:");
name = scan.next();
System.out.print ("Enter your Town:");
town = scan.next();
System.out.println (name +" lives in " +town);
}
}