import java.util.Scanner;

public class Lab4_NthPrime{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int size = num*num; 

		boolean sieve[] = new boolean[size];
		sieve[0] = false;
		sieve[1] = false;
		for(int i = 2; i < size; i++)
			sieve[i] = true; 

		int count = 0;
		boolean check = false;

		int i = 2;
		while(check == false){
			if(sieve[i] == true){
				count++; 				
if(count == num){ 
					System.out.println(i);
					check = true;
				}
				else
					for(int j = i+i; j < size; j+=i) 
						sieve[j] = false;
			}
			i++;
		}
	}
}