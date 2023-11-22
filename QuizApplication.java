import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Quiz questions and options
        String[] questions = {
            "1. What is the capital of France?",
            "2. Which planet is known as the Red Planet?",
            "3. What is the largest mammal on Earth?",
            "4. In which year did World War II end?",
            "5. Who wrote 'Romeo and Juliet'?"
        };

        String[][] options = {
            {"A. London", "B. Paris", "C. Berlin", "D. Rome"},
            {"A. Venus", "B. Mars", "C. Jupiter", "D. Saturn"},
            {"A. Elephant", "B. Blue Whale", "C. Giraffe", "D. Dolphin"},
            {"A. 1943", "B. 1945", "C. 1950", "D. 1960"},
            {"A. William Shakespeare", "B. Jane Austen", "C. Charles Dickens", "D. Mark Twain"}
        };

        char[] correctAnswers = {'B', 'B', 'B', 'B', 'A'};

        // Timer duration for each question in seconds
        int timerDuration = 10;

        // Initialize score
        int score = 0;

        System.out.println("Welcome to the Quiz Application!");

        // Quiz loop
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            // Timer
            for (int seconds = timerDuration; seconds > 0; seconds--) {
                System.out.print("Time remaining: " + seconds + " seconds  ");
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // User answer input
            System.out.print("\nYour answer: ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);

            // Check answer and update score
            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswers[i] + ".");
            }
        }

        // Display final score
        System.out.println("\nQuiz completed! Your final score is: " + score + "/" + questions.length);

        scanner.close();
    }
}


