import java.util.Scanner;

public class Amstrong_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int sum =0;
        int duplicate = N;
        while (N>0) {
            int last_digit=N%10;
             sum =sum+(last_digit*last_digit*last_digit);
             N=N/10;
        }
        if (sum == duplicate) {
            System.out.println("Amstrong Number");
        }else
        System.out.println("Not an Amstrong Number");
    }
}
