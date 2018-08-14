class EvenGen extends Thread{
public void run(){
System.out.println("printing even number");
for(int i=1;i<=10;i++){
	boolean even=i%2==0;
	if(even)
		System.out.println(i);
}
}


}



public class ThreadDemo1{
 public static void main(String args[]){
  System.out.println("construction tho thread");
  EvenGen ev=new EvenGen();
    System.out.println("starting the thread");
	ev.start();
	  System.out.println("the thread has been started");
	    System.out.println("The main() method is finished");
 }
}