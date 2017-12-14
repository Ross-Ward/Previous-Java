
import java.util.Scanner;
public class Lab10_Palindrome{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
 		String s1 = scan.nextLine();
 		System.out.println(check(s1));
	}
	public static String check(String s1){
		if(s1.charAt(0) != s1.charAt(s1.length()-1)) 			 return "FALSE";

		else if(s1.length() <= 2) 
			return "TRUE";

		String s2 = s1.substring(1, s1.length()-1);

		return check(s2); 	}
}