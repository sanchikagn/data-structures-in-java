




public class MyTest {

    
    public static void main(String[] args) {
        
		int [][] Identity = new int[4][4];
		for(int m=0; m<=3;m++){
			for(int n=0; n<=3; n++){
				Identity[m][n] = 1;
			}
		}
				for(int m=0; m<=3;m++){
			for(int n=0; n<=3; n++){
				System.out.print(Identity[m][n] +" ");
			}
			System.out.println();
		}
}
}


    

