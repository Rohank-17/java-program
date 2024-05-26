import java.util.Scanner;

public class reverse_of_a_num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int N = sc.nextInt();
        int reverse =0;
        while (N>0) {
          int last_digit=N%10;
          N=N/10;
          reverse=(reverse*10)+last_digit;  
        }
        System.out.println("reverse of a num is : "+ reverse);
    }
}
