
public class Fibonacci {
	public static void main(String[] args) {
		// 0 1 1 2 3 5 8...........
		int a=0, b=1,c;
		System.out.println(a);
		System.out.println(b);
		
		for (int i = 0; i <= 20; i++) {

			   c=a+b;
				a=b;
				b=c;
				System.out.println(c);
			}
		}
}
