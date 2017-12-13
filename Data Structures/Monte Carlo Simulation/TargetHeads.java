import java.util.Scanner;
public class TargetHeads{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		double numtoss = scan.nextDouble();
		int target = scan.nextInt();

		int successes = 0;

		double runs = 100000;

		for(int i = 0; i < runs; i++){
			int count = 0; 
			int record = 0;

			for(int j = 0; j < numtoss; j++){
				if(Math.random() > 0.5){
					count++;
					if(count >= target) 
						record++;
				}
				else
					count = 0;
			}
			if(record >= 1) 
				successes++; 
		}
		int result = (int)(Math.round((successes/runs)*100)); 

		System.out.println(result);
	}
}