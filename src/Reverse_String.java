
public class Reverse_String {
	public static void main(String[] args) {
		String s= "Welcome To 24LPA World";
		
		String[] allwords = s.split(" ");
		String reverseSentence="";
		for (String word : allwords) {
			
			String reverse="";
			for (int i = word.length()-1; i >=0; i--) {
				char c = word.charAt(i);
				reverse=reverse+c;
				
			}
			reverseSentence=reverseSentence+reverse+" ";
		}      
		System.out.println(reverseSentence);
			
			
		
		      
		
	}
}
