import java.util.Scanner;
public class Ex14_ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        // Read the elements into an array
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Calculate the sum 
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
        // Calculate the average 
        double average = (double) sum / n;
        
        // Display results 
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
        
        scanner.close();
    }
}
