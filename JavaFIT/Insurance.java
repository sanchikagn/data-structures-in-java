import java.util.Scanner;
class Insurance{
public static void main(String[] args){
Scanner scn = new Scanner(System.in);
System.out.println("Enter your age: ");
int age = scn.nextInt();
System.out.println("Enter your gender: ");
String gender = scn.nextLine();
System.out.println("Enter your health status: ");
String status = scn.nextLine();
if((gender=="male") && (age>=25) && (age<=40) && (status=="excellent"))
System.out.print("You can be insured Your premium is 5 rupees per thousand Your maximum policy amount is 200000 rupees");
else if((gender=="male") && (age>=25) && (age<=35) && (status=="poor"))
System.out.print("You can be insured Your premium is 8 rupees per thousand Your maximum policy amount is 100000 rupees");
else if((gender=="female") && (age>=25) && (age<=35) && (status=="excellent"))
System.out.print("You can be insured Your premium is 4 rupees per thousand Your maximum policy amount is 150000 rupees");
else
System.out.println("You cannot be insured");
}
}