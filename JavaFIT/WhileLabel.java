// Looping with Labels
public class WhileLabel {
public static void main (String[] args)   {
      int i=1, x=0, j;
   LOOP:   for (j=1; j < 3; j++){
            System.out.println("j = " +(j));
     while (i <=5) {
            x++;
            System.out.println("x = " +(x));
      if (x < 5) {
             continue;     }
          if (x ==9) {
continue LOOP;
}
System.out.println("i = " +(i));
i++;
}
}   }    }
