import java.util.Scanner;

/**
 * basic_hashing
 */
public class basic_hashing {
      public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n =sc.nextInt();
        int[] arr=new int[n];
        for(int i= 0;i<n;i++){
            System.out.print("Element of array: ");
            arr[i] =sc.nextInt(); 
        }
        //hash array...
        //precalculation;
        int hash[] = new int[12];
        for(int i=0; i<n;i++){
          hash[arr[i]] += 1;
        }
          int q;
          q = sc.nextInt();
          while (q-- != 0) {
              int number;
              System.out.println("The element we have to count: ");
              number = sc.nextInt();
              // fetching:
              System.out.println(hash[number]);
          }
      }
}