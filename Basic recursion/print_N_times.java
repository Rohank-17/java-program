import java.util.Scanner;

/**
 * print_N_times
 */

public class print_N_times {
    static int count =0;
public static void N_times(int N){
     if(count == N){
      return;
     }
     System.out.println(count);
     count++;
     N_times(N);
    
}
public static void Name_N_times(int N){
    if(count == N){
     return;
    }
    System.out.println("Ron");
    count++;
    Name_N_times(N);
   
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        //N_times(N);
        Name_N_times(N);
    }

}