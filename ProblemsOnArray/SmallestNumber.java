// Problem Statement: Given an array, we have to find the smallest element in the array.

package ProblemsOnArray;
import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = input.nextInt();
        
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter element number "+ (i+1) +" : ");
            arr[i] = input.nextInt();
        }

        findSmallestNum(arr);
        input.close();
    }
    public static void findSmallestNum(int[] arr){
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int min = arr[0];

        for(int i=0; i< arr.length; i++){
            if(arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println("The smallest number in the array is: "+ min);
    }
}

// ALGORITHM:
// Create a variable called min and initialize it with the value of the first element in the array.
// Use a for loop to iterate through the remaining elements in the array.
// In each iteration, compare the current element with the min variable.
// If the current element is less than the min value, update the min value with the current element's value.
// After completing the loop, print the min variable, which will hold the smallest value in the array.
