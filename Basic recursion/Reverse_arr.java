import java.util.Scanner;

public class Reverse_arr {
    // By two variables...
    public static void reverse1(int arr[], int l, int r){
        if (l>=r) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverse1(arr, l+1, r-1);
    }
    // By one variable...
    public static void reverse2(int arr[],int i,int n){
        if(i>=n/2){
            return;
        }
        int temp = arr[i];
        arr [i] = arr[n-i-1];
        arr[n-i-1] = temp;
        reverse2(arr, i+1, n); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt(); 
        }
        System.out.print("Original Array: ");
        for (int i : arr ) {
            System.out.print(i + " ");
        }
        System.out.println();
        // reverse1(arr, 0, size-1);
        // System.out.print("Reversed1 Array: ");
        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }
        System.out.println();
        reverse2(arr, 0 , size);
        System.out.print("Reversed2 Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
