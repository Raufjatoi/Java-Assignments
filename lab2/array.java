package lab2;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] reversedNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[i] = numbers[numbers.length - 1 - i];
        }

        System.out.println("Reversed array: " + Arrays.toString(reversedNumbers));
    }
}
