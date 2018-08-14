class A1 extends Thread{
public void run(){
for(int i=1;i<=5;i++){
System.out.println("Now in Thread A1:"+i+"");
}
}

}

class B1 extends Thread{
public void run(){
for(int i=1;i<=5;i++){
System.out.println("Now in Thread B1:"+i+"");
}
}

}



public class ThreadDemo2{
 public static void main(String args[]){
  new A1().start();
  new B1().start();
  System.out.println("Finishing main ...");
 }
}