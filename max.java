public class max {
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 12, 7, 1, 900, 23, 16};
        int largestNumber = findMax(numbers);
        System.out.println("The largest number is: " + largestNumber);
    }
}
