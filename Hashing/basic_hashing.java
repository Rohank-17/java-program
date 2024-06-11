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
        //precalculation;5
        int hash[] = new int[10];
        for(int i=0; i<n;i++){
          hash[arr[i]] += 1;
        }
        int m =sc.nextInt();
        for (int i = 0; i < m ; i++) {
            System.out.println("The element we have to count: ");
            i=sc.nextInt();
            m--;
            //fatch..
            System.out.println(hash[i]);
        }
      }
}