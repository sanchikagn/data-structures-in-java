class Parent3{
int a = 10;
void show(){
System.out.println(a);}
}
 class Child3 extends Parent3{
 int a = 20;
 void show(){
 System.out.println(a);//20
 }
 
 public static void main(String[] args){
//Child3 c = new Child3();
// c.show();
new Child3().show();
new Parent3().show();  //method overriding is done.
 }
 }