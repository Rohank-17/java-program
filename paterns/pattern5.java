import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of inputs N: ");
        int N= sc.nextInt();

        for(int i=N;i>=1;i--){
            for(int j= i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
