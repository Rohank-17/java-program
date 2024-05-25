import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int Space = 2*(N-1);
        //Outer loop..
        for(int i=1;i<=N;i++){
            //Inner loop...
            //NUMBER..
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space..
            for(int j=1;j<=Space;j++){
                System.out.print(" ");
            }
            //NUMBER...
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            Space -=2;
        }
    }
}
