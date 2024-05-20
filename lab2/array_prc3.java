package lab2;

public class array_prc3 {
    public static void main(String[] args) {
        
    
    
    // Using a for loop with index to iterate over the array
    int[] numbers = {1, 2, 3, 4, 5};

    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
}
        int[] nums = {1, 2, 3, 4, 5};
        int totalSum = 0;

        for (int number : nums) {
            totalSum += number;
        }

        System.out.println("Sum of all elements: " + totalSum);
    }

    }

