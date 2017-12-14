import java.util.Scanner;
public class Lab10_DecimalExpansion{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
	 	int numz = scan.nextInt();
	 	int div = scan.nextInt();
	 	int num = scan.nextInt();
	 	System.out.println(decimal2(numz,div,num));
	}

	public static int decimal(int numz, int div, int num){
		if(num == 0)
			return(numz - (numz % div)) / div; 
		return(decimal((numz % div)*10, div, num-1)); 
	}

	
	public static int decimal2(int numz, int div, int num){

		double res = (double)numz/(double)div; 
		double decimal = (res * Math.pow(10, num)) % 10; 

		return (int)decimal; 
	}
}