import java.util.Scanner;

public class char_hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a string: ");
        String S = sc.nextLine();


        //int[] hash = new int[26];
        int[] hash = new int[256];

        for (int i = 0; i < S.length(); i++) {
            hash[S.charAt(i)]++;
        }
        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            char c;
            System.out.println("The char we have to count: ");
            c = sc.next().charAt(0);
            // fetch:
            System.out.println(hash[c]);
        }
    }
}
