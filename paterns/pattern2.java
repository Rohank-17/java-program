import java.util.Scanner;

public  class pattern2 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.print("Enter the number of inputs N: ");
        int N= sc.nextInt();

        for(int i= 0;i<=N;i++){
            for(int J=0;J<=i;J++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
