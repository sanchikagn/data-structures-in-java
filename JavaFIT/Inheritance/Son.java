class Father{
String name = "X-Fernando";
private int age;
protected double pension= 18000;
}

class Son extends Father{
String name;
public void titBit(){
name = "Y-Fernando";

super.age=40;
System.out.println(super.name +" is the father of "+name);
System.out.println("Father's age is "+super.age);
System.out.println("Father's pension is " +pension);
super.pension=20000;
System.out.println("Father's new pension is " +pension);
}

public static void main(String args[]){
	Son s = new Son();
	s.titBit();
}
}