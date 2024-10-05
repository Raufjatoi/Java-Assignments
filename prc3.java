// Write a Java method findMax(int[] arr) that returns the largest number in an array of integers.
public class prc3 {
    public static int findMax(int[] arr) {
        // Check if the array is empty
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        // Initialize max to the first element in the array
        int max = arr[0];

        // Traverse through the array to find the maximum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Update max if current element is larger
            }
        }

        // Return the largest element found
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 12, 7, 1, 9, 23, 16};
        int largestNumber = findMax(numbers);
        System.out.println("The largest number is: " + largestNumber);
    }
}
