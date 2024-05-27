import java.util.Scanner;

public class sum_of_N_num {

    public static void Parameterised(int i, int sum){
        if(i<1){
            System.out.println("sum of n integer is:" +sum);
            return;
        }
        Parameterised(i-1,sum+i);
    }
    public static int Functional(int n){
        if (n==0) {
            return 0;
        }else
        return n +Functional(n-1);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int N =sc.nextInt();
        Parameterised(N,0);
        System.out.println(Functional(N));
    }
}
