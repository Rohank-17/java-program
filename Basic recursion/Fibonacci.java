import java.util.Scanner;

public class Fibonacci {
    public static int Print_Fibonacci(int N){
         if (N<=1) {
           return N;          
         }
        int last = Print_Fibonacci(N-1);
        int slast = Print_Fibonacci(N-2);
        return last + slast;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        System.out.println(Print_Fibonacci(N));
    }
}
