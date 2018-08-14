class Dog{
public void dogBrk()
{System.out.println("Dog is barking");}
}

class Puppy extends Dog{
public void PuppyBrk(){
System.out.println("Puppy is barking");
}
public static void main(String args[]){
Puppy p = new Puppy();
p.dogBrk();
p.PuppyBrk();
}
}