import java.util.Scanner;

public class GCD {
    // public static void gcd_brutefource(int n1,int n2,int gcd){
    //     if(n1<n2){
    //         for(int i=1;i<n1;i++){
    //             if (n1%i==0 && n2%i==0) {
    //                 gcd=i;
    //             }
    //             System.out.print(i);
    //         }
    //     }
    // }
    public static void gcd_eculideanAlgorithm(int n1,int n2){
        while (n1>0 && n2>0) {
            if (n1>n2) {
                n1=n1%n2;
            }else{
            n2=n2%n1;
            }
            if(n1==0){
                System.out.println(n2);
            }else
            System.out.println(n1);
        }
    }
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
       //int gcd=0;
       // gcd_brutefource(N1, N2, gcd);
       gcd_eculideanAlgorithm(n1, n2);
     }
}
