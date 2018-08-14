class Mammal{
String kingdom = "Mammal";
int rank = 4;
public void charSuper(){
System.out.println(kingdom);
}
}

class Dolphin extends Mammal{
String species = "Dolphin";
public void charSub(){
	super.rank = 1;
System.out.println(rank);
System.out.println(species +" is a Mammmal");
}
public static void main(String[] args){
Dolphin d = new Dolphin();
d.charSub();
Mammal m = new Mammal();
m.charSuper();
}
}