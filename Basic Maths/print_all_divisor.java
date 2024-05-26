import java.util.Scanner;

public class print_all_divisor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N =sc.nextInt();
        for(int i=1;i<=N;i++){
            if(N%i==0){
                System.out.print(i +" ");
            }
        }
    }
}
//Time complexity O(N)....