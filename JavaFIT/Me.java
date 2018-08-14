class Dog{
public void dogBrk(){
System.out.println("Dog is barking");
}
}
class Puppy extends Dog{
public void puppyBrk(){
System.out.println("Puppy is barking");}
}
class Me {
public static void main(String[] args){
Puppy mine = new Puppy();
mine.puppyBrk();
mine.dogBrk();
}}
