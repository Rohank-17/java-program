import java.util.Scanner;

/**
 * Count_Digits
 */
public class Count_Digits {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int N = sc.nextInt();
        int count=0;
        while(N>0){
            int last_digit=N%10;
            System.out.println(last_digit);
            count=count+1;
            N= N/10;
        }
        System.out.println("the total no of digits are : "+ count);
        }
}