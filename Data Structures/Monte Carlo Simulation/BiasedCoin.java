import java.util.Scanner;
public class Lab5_BiasedCoin{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		double numtoss = scan.nextDouble();
		int prob = scan.nextInt();

		int successes = 0;

		double runs = 100000;

		for(int i = 0; i < runs; i++){
			int count = 0; 
			for(int j = 0; j < numtoss; j++){
				if((Math.random()*100) <= prob)
					count++; 		}
			if(count > numtoss/2) 
				successes++; 
		}
		int result = (int)(Math.round((successes/runs)*100)); 
		System.out.println(result);
	}
}