
public class Palindrome {
	public static void main(String[] args) {

		int n=4678;
		int a=n,i,j=0;
		while (a>0) {
			
			i=a%10;     
			j=(j*10)+i;  
			a=a/10;      
		}
		System.out.println(j);
		
			
		
		
	}
}
