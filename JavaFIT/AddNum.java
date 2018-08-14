public class AddNum{
public void addFive(){
int x = 20; // x should be initialized; o.w - you get a compilation error. int x; is wrong
x +=5;
System.out.println("x = " + x);
}
public static void main(String args[]){
//AddNum result = new AddNum();
addFive();
}
}