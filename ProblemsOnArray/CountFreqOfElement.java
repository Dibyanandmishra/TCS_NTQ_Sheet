// Problem Statement: Given an array, we have found the number of occurrences of each element in the array.

package ProblemsOnArray;
import java.util.*;

public class CountFreqOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the Array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : arr) {
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);
            }
        }

        System.out.println("Element -> Frequency");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
        }
    sc.close();
    }
}
