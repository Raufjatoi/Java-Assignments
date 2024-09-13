// 29. Online Quiz System
// Scenario: Create an online quiz system where students can take quizzes on different subjects.
// Quizzes can be of different types (Multiple Choice, True/False).
// Concepts: Classes, Inheritance, ArrayList
// Task: Design a Quiz class and derive MCQQuiz and TFQuiz classes.
// Implement methods to take quizzes and calculate scores.

import java.util.ArrayList;
import java.util.Scanner;

class Quiz {
    ArrayList<String> questions;
    int score;

    // Constructor to initialize the quiz
    Quiz() {
        this.questions = new ArrayList<>();
        this.score = 0;
    }

    // Method to get the score
    int getScore() {
        return score;
    }

    // Method to add questions to the quiz
    void addQuestion(String question) {
        this.questions.add(question);
    }
}

class MCQQuiz extends Quiz {
    ArrayList<String> answers; // ArrayList to store the correct answers

    // Constructor to initialize MCQQuiz
    MCQQuiz() {
        this.answers = new ArrayList<>();
    }

    // Method to add a question and its answer
    void addQuestionWithAnswer(String question, String answer) {
        super.addQuestion(question);
        this.answers.add(answer);
    }

    // Method to conduct the quiz
    void conductQuiz() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < questions.size(); i++) {
            System.out.println(questions.get(i)); // Display question
            String userAnswer = sc.nextLine(); // Read user's answer

            // Compare user answer with the correct answer
            if (userAnswer.equalsIgnoreCase(answers.get(i))) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect!");
            }
        }
    }
}

class TFQuiz extends Quiz {
    ArrayList<Boolean> answers; // ArrayList to store the correct True/False answers

    // Constructor to initialize TFQuiz
    TFQuiz() {
        this.answers = new ArrayList<>();
    }

    // Method to add a True/False question with the correct answer
    void addQuestionWithAnswer(String question, boolean answer) {
        super.addQuestion(question);
        this.answers.add(answer);
    }

    // Method to conduct the quiz
    void conductQuiz() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < questions.size(); i++) {
            System.out.println(questions.get(i) + " (true/false)"); // Display question
            boolean userAnswer = sc.nextBoolean(); // Read user's answer

            // Compare user answer with the correct answer
            if (userAnswer == answers.get(i)) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect!");
            }
        }
    }
}

public class OnlineQuizSystem {
    public static void main(String[] args) {
        // Example usage
        MCQQuiz mcqQuiz = new MCQQuiz();
        mcqQuiz.addQuestionWithAnswer("What is the capital of France?", "Paris");
        mcqQuiz.addQuestionWithAnswer("What is 2 + 2?", "4");
        System.out.println("Starting MCQ Quiz...");
        mcqQuiz.conductQuiz();
        System.out.println("Your score: " + mcqQuiz.getScore());

        TFQuiz tfQuiz = new TFQuiz();
        tfQuiz.addQuestionWithAnswer("The earth is flat.", false);
        tfQuiz.addQuestionWithAnswer("The sun rises in the east.", true);
        System.out.println("Starting True/False Quiz...");
        tfQuiz.conductQuiz();
        System.out.println("Your score: " + tfQuiz.getScore());
    }
}
