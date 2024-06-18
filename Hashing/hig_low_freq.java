import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class hig_low_freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr=new int[n];
        for(int i= 0;i<n;i++){
            System.out.print("Element of array: ");
            arr[i] =sc.nextInt();
        }
        //map data Structure...
        Map<Integer, Integer> freqMap = new HashMap<>();
        // Count fre of each element
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            if (freqMap.containsKey(key)) {
                freqMap.put(key, freqMap.get(key) + 1);
            } else {
                freqMap.put(key, 1);
            }
        }
        //find max and min fre of arry...
        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;
        int maxFreqElement = -1;
        int minFreqElement = -1;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int freq = entry.getValue();
            if (freq > maxFreq) {
                maxFreq = freq;
                maxFreqElement = entry.getKey();
            }
            if (freq < minFreq) {
                minFreq = freq;
                minFreqElement = entry.getKey();
            }
        }
        System.out.println("Highest frequency element: " + maxFreqElement + " with frequency " + maxFreq);
        System.out.println("Lowest frequency element: " + minFreqElement + " with frequency " + minFreq);
    }
}


