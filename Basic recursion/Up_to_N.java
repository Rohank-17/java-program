import java.util.Scanner;

public class Up_to_N {
    // public static void till_N_num(int i,int N){
    //     if (i>N) {
    //         return;
    //     }
    //     System.out.println(i);
    //     till_N_num(i+1, N);
        
    // }
    public static void N_to_1(int i, int N){
        if (i<1) {
            return;
        }
        System.out.println(i);
        N_to_1(i-1, N);
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int N =sc.nextInt();
         // till_N_num(1, N);
          N_to_1(N, N);
    }
}
