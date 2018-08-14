class Parent1{
int a = 10;}

class Child1 extends Parent1{
int a =20;
void show(){
System.out.println(a);
System.out.println(a);
System.out.println(super.a);
super.a =30;
System.out.println(a);
System.out.println(super.a);
}
public static void main(String args[]){
new Child1().show();
}
}