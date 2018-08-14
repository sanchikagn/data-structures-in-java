class PrintSum extends Thread{
int start,end;
boolean even;
public PrintSum(int s,int e,boolean ev){
 start=s;
 end=e;
 even=ev;
}

public void run(){
for(int k=start;k<=end;k++){
 int sum=0;
 for(int j=1;j<=k;j++){
 if(even&&j%2==0)
 sum+=j;
 else if(!even&&j%2!=0)
 sum+=j;
 
 }
 if(even)
 System.out.println("even sum: "+sum);
 else System.out.println("odd sum: "+sum); 
}
}
}



public class ThreadDemo3{
 public static void main(String args[]){
  PrintSum s1=new PrintSum(1,10,true);
  PrintSum s2=new PrintSum(1,10,false);
  s1.start();
  s2.start();
  for(int k=1;k<=10;k++)
  System.out.println("In main");
 }
}