package summer_vics;

import java.util.Scanner;

class Candidate {
    String name;
    int votes;

    Candidate(String name, int votes) {
        this.name = name;
        this.votes = votes;
    }
}

public class plurality {
    static int nums;
    static final int MAX = 9;
    static Candidate[] candidates = new Candidate[MAX];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of candidates: ");
        nums = in.nextInt();
        in.nextLine(); // Consume the leftover newline character

        if (nums < 2) {
            System.out.println("Please enter more than one candidate.");
            return;
        }

        if (nums > MAX) {
            System.out.println("Maximum number of candidates is " + MAX);
            return;
        }

        for (int i = 0; i < nums; i++) {
            System.out.print("Enter the name of candidate: ");
            String name = in.nextLine();
            candidates[i] = new Candidate(name, 0);
        }

        System.out.print("Enter number of voters: ");
        int voter_count = in.nextInt();
        in.nextLine(); // Consume the leftover newline character

        for (int i = 0; i < voter_count; i++) {
            System.out.print("Vote: ");
            String name = in.nextLine();

            if (!vote(name)) {
                System.out.println("Invalid vote.");
            }
        }

        print_winner();
    }

    public static boolean vote(String name) {
        for (int i = 0; i < nums; i++) {
            if (candidates[i].name.equals(name)) {
                candidates[i].votes++;
                return true;
            }
        }
        return false;
    }

    public static void print_winner() {
        int max_votes = 0;

        // Find the maximum number of votes
        for (int i = 0; i < nums; i++) {
            if (candidates[i].votes > max_votes) {
                max_votes = candidates[i].votes;
            }
        }

        // Print all candidates with the maximum number of votes
        for (int i = 0; i < nums; i++) {
            if (candidates[i].votes == max_votes) {
                System.out.println(candidates[i].name + " is the winner.");
            }
        }
    }
}
