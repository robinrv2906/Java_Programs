
public class Amstrong {
	public static void main(String[] args) {
		
		//153= 1^3 + 5^3 + 3^3
			int n=153;
			int a=n,i,j=0;
			while (a>0) {
				
				i=a%10;        //3   //5      //1
				j=j+(i*i*i);    //27  //27+125   //27+125+1 
				a=a/10;         //15    //1      //0
			}
			if (n==j) {
				System.out.println("Amstrong");
				
			}
		}
}
