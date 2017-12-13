import java.util.Scanner;

public class Solution {
    
    public static boolean isPrime(int num){
        for(int i = 2; i <= Math.sqrt(num);i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String args[] ) throws Exception {
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      int i = 0;
      while(true){
          if(isPrime(num-i)){System.out.println(num-i);break;}           if(isPrime(num+i)){System.out.println(n+i);break;}
          i++;
      }
    }
}
