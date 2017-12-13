
import java.util.Scanner;

public class Lab4_NearestPrime{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int size = num*num;
		boolean sieve[] = new boolean[size];
		sieve[0] = false;
		sieve[1] = false;
		for(int i = 2; i < size; i++)
			sieve[i] = true; 
		int record = num, answer = 0;

		for(int i = 2; i < size; i++){
			if(sieve[i] == true){
				if(Math.abs(num - i) < record){ 					record = Math.abs(n - i); 
					answer = i;
				}
				else
					break;
				for(int j = i+i; j < size; j+=i) 
					sieve[j] = false;
			}
		}
		System.out.println(answer);
	}
}