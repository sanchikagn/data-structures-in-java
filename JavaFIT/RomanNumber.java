import java.util.Scanner;
class RomanNumber{
public static void main(String[] args){
Scanner n = new Scanner(System.in);
System.out.println("Enter a number between 1 and 10: ");
int m = n.nextInt();

switch(m){
case 1:
System.out.println("i");
break;
case 2:
System.out.println("ii");
break;
case 3:
System.out.println("iii");
break;
case 4:
System.out.println("iv");
break;
case 5:
System.out.println("v");
break;
case 6:
System.out.println("vi");
break;
case 7:
System.out.println("vii");
break;
case 8:
System.out.println("viii");
break;
case 9:
System.out.println("ix");
break;case 10:
System.out.println("x");
break;
default:
System.out.println("Error!!!");
}
}
}
