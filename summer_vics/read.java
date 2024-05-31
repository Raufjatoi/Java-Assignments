package summer_vics;

import java.util.Scanner;

public class read {
    public static void main(String[] args) {
        System.out.print("Text: ");
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();

        int letters = count_letters(text);
        int words = count_words(text);
        int sentences = count_sentences(text);

        float L = (letters / (float) words) * 100;
        float S = (sentences / (float) words) * 100;
        float index = 0.0588f * L - 0.296f * S - 15.8f;

        if (index >= 16) {
            System.out.println("Grade 16+");
        } else if (index < 1) {
            System.out.println("Before Grade 1");
        } else {
            System.out.println("Grade " + Math.round(index));
        }
    }

    public static int count_letters(String text) {
        int letters = 0;

        for (int i = 0, n = text.length(); i < n; i++) {
            if (Character.isLetter(text.charAt(i))) {
                letters++;
            }
        }
        return letters;
    }

    public static int count_sentences(String text) {
        int sentences = 0;
        for (int i = 0, n = text.length(); i < n; i++) {
            char c = text.charAt(i);
            if (c == '.' || c == '!' || c == '?') {
                sentences++;
            }
        }
        return sentences;
    }

    public static int count_words(String text) {
        int words = 1; // Start with 1 to count the first word
        for (int i = 0, n = text.length(); i < n; i++) {
            if (Character.isWhitespace(text.charAt(i))) {
                words++;
            }
        }
        return words;
    }
}
