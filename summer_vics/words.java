package summer_vics;

import java.util.Scanner;

public class words {
    public static void main(String[] args) {
        
        int points[] = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};

        Scanner in = new Scanner(System.in);

        System.out.print("Player1: ");
        String word1 = in.nextLine();
        System.out.print("Player2: ");
        String word2 = in.nextLine();

        int score1 = compute_score(word1, points);
        int score2 = compute_score(word2, points);

        if (score1 > score2) {
            System.out.println("Player 1 wins!");
        } else if (score1 < score2) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a draw");
        }

        in.close();
    }

    public static int compute_score(String word, int[] points) {
        int score = 0;

        for (int i = 0, len = word.length(); i < len; i++) {
            char ch = word.charAt(i);
            if (Character.isLowerCase(ch)) {
                score += points[ch - 'a'];
            } else if (Character.isUpperCase(ch)) {
                score += points[ch - 'A'];
            }
        }

        return score;
    }
}
