import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of inputs N: ");
        int N= sc.nextInt();
        for(int i= 0;i<=N;i++){
            for(int J=0;J<=i;J++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=N;i>=1;i--){
            for(int j= i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
