import java.util.Scanner;
public class Factorial {
    public static int factorial_Nth(int n){
        if(n == 0)
        {
         return 1;
         }
          return n * factorial_Nth(n-1);
        }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial_Nth(n));
    }
}


