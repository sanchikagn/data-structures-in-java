import java.io.*;
class ReadStringTest {
public static void main(String args[ ]) {
Console c = System.console();
System.out.println("Enter your name: ");
String n=c.readLine();
System.out.println("Welcome "+ n);
}
}