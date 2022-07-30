import java.util.Scanner;

public class AdditionOfTwoNumbers {
	public static int add(int n1,int n2) {
		return n1+n2;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the First Number");
	int fNumber = sc.nextInt();
	System.out.println("Enter the Second Number");
	int sNumber = sc.nextInt();
	System.out.println(add(fNumber,sNumber));
}
}
