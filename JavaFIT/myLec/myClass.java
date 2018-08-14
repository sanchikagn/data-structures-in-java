import java.util.Scanner;
public class myClass {
public static void main(String[] args){
	Scanner s =  new Scanner(System.in);
	int sum = 0;
	int x = 1;
	do{
		System.out.printf("Enter a number: ");
		x = s.nextInt();
		sum += x;
	}
	while(x!=0);
	System.out.printf("sum is " +sum); 
//else if(y>x)
	
   //else 
	   //System.out.printf("%5.2f\n",2.0/3);
}
}
