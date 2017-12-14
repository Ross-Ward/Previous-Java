
import java.util.Scanner;
public class Lab10_GCD{
	public static void main(String args[] ){
		Scanner scan = new Scanner(System.in);
	 	long num1 = scan.nextLong();
	 	long num2 = scan.nextLong();
	 	System.out.println(GCD(num1,num2));
 	}

 	public static long GCD(long num1, long num2){
		
		if(num1==0)
	 		return num2;

		
	 	if(num2==0)
	 		return num1;

	 	long one=num2;
	 	long two=num1%num1; 
	 	return(GCD(one,two));
	 }
}