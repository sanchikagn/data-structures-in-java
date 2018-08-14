class Parent{
public void f(){

System.out.println("Parent");
}

}
class Child extends Parent{
 public void g(){
 
 System.out.println("Child");
 }
public static void main(String args[]){

Child c=new Child();
Parent d=new Child();
c.f();
d.g();
}
}