
import java.util.Scanner;
public class Lab10_Interest{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
 		int num1 = scan.nextInt();
 		double num2 = scan.nextDouble();
 		double num2 = scan.nextDouble();
 		System.out.println(String.format( "%.2f", compound(num1,num2,num3)));
	}


	public static double compound(int years, double interest, double balance){
		if(years==0) 
			return balance;

		double factor = (interest/100) + 1; 
		double three = balance;
		double two = interest;
		int one = years-1;

		return(factor * compound(one, two, three));
	}
}