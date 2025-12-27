// Problem Statement: Given an array, we have to find the largest element in the array.

package ProblemsOnArray;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element number " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }

        findLargestNumber(arr);
        input.close();
    }

    public static void findLargestNumber(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The largest element in the Array is: " + max);
    }
}


// ALGORITHM: 
// Create a variable called max and initialize it with the value of the first element in the array.
// Use a for loop to iterate through the rest of the elements in the array.
// In each iteration, compare the current element with the max variable.
// If the current element is greater than the max value, update the max value with the current element's value.
// After completing the loop, print the max variable, which will hold the largest value in the array.