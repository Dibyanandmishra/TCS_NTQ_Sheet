// Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
package ProblemsOnArray;
import java.util.Scanner;

public class SecondSmallestLargest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = input.nextInt();

        if (n < 2) {
            System.out.println("-1");
            input.close();
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        findSecondSmallestAndLargest(arr);
        input.close();
    }

    public static void findSecondSmallestAndLargest(int[] arr) {

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {

            // Second Smallest
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num > min && num < secondMin) {
                secondMin = num;
            }

            // Second Largest
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num < max && num > secondMax) {
                secondMax = num;
            }
        }

        if (secondMin == Integer.MAX_VALUE || secondMax == Integer.MIN_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(secondMin + " " + secondMax);
        }
    }
}

// ALGORITHM: 
// We will need four variables: small, second_small, large, and second_large. Initialize small and second_small to INT_MAX, and large and second_large to INT_MIN.
// Second Smallest Algorithm:
// If the current element is smaller than 'small', update the values of second_small and small.
// Else if the current element is smaller than 'second_small', update the value of second_small.
// After traversing the array, the second smallest element will be stored in the variable second_small.
// Second Largest Algorithm:
// If the current element is larger than 'large', update the values of second_large and large.
// Else if the current element is larger than 'second_large', update the value of second_large.
// After traversing the array, the second largest element will be stored in the variable second_large.