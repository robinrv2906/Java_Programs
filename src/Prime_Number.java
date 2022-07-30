
public class Prime_Number {
	public static void main(String[] args) {
		 int c=0;
		
		for (int n = 1; n <= 100; n++) {
			
		boolean flag=true;
		for (int i = 2; i < n; i++) {
			if (n%i==0) {
				flag=false;
				
			}   	
		}
		
		if (flag==true) {
			System.out.println(n);
			c++;
		}
		}
		System.out.println("toatal number of prime numbers "+c);
		}
}
