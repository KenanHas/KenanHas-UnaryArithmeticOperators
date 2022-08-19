
public class UnaryArithmeticOperators {

	public static void main(String[] args) {
		int i=0;
		int j=1;
		int k=2;
		int m= 3;
	
		k=i++;	   
		// In post increment statement firstly the i variable assignment the k variable then i variable increments one 
		System.out.println("i: " +i); //i=1
		System.out.println("k: " +k);  // k=0

		m=++j; 
		// In pre increment statement firstly the j variable increments one then new value of j variable assignment the m variable
		System.out.println("j: " +j); //j=2
		System.out.println("m: " +m); //m=2 
		
		System.out.println("\n*****EXERCISES******\n");
		int a =2;	
		int b =a++;
		
		System.out.println("new value of b: "+b); //b=2
		System.out.println("new value of a: " +a); //a=3
		
		int c= --a;
		System.out.println("new value of c: "+c); //c=2
		System.out.println("new value of a: "+a); //a=2 
			
	}
}

