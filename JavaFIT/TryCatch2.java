public class TryCatch2 {
public static void main(String[] args) {
String[] fruits = {"Apple", "Wood-Apple", "Mango", "Orange"};
try {
System.out.println(fruits[4]);
} catch(ArrayIndexOutOfBoundsException exc1) {
System.out.println("You have exceeded the Array index limit");
} catch(NullPointerException exc2) {
System.out.println("You are trying to access a null in case where an object is required" );
}
}
}