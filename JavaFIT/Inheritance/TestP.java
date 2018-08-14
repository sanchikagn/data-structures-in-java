class TestP{
private int a=10;
public static void main(String[] args){
 System.out.println(new TestP().a);//10
  System.out.println(new TestP().getA());//10
   System.out.println(new TestC().getA());//100
   }
   public int getA(){
   return a;
   }
}

class TestC extends TestP{
private int a = 100;

public int getA(){
return a;
}
}