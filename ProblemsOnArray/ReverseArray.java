// Problem Statement: You are given an array. The task is to reverse the array and print it.
package ProblemsOnArray;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);
        sc.close();
    }

    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
// Square brackets [] --> Arrays.toString() -->

System.out.println(java.util.Arrays.toString(arr));

*/ 

/*
// Curly braces {} --> manual loop --> 

    System.out.print("{");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
        if (i < arr.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("}");
*/


// ALGORITHM: 
// This approach improves on the previous one by reversing the array in-place, avoiding the need for extra space. It uses two pointers to simultaneously traverse the array from both ends, swapping the elements until the center is reached. This way, we avoid creating a new array and perform the reverse operation efficiently using constant space.

// Initialize a pointer p1 at the start of the array (index 0).
// Initialize another pointer p2 at the end of the array (index n - 1).
// While p1 is less than p2, do the following:
// Swap the elements at positions p1 and p2.
// Increment p1 by 1.
// Decrement p2 by 1.
// Continue this process for only the first n/2 elements of the array.

// Note: Swapping all n elements instead of just n/2 would result in the array being reversed twice, which brings it back to its original form.