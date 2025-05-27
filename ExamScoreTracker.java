package lab01_08;
import java.util.Scanner;

public class ExamScoreTracker {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 5;
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[NUM_STUDENTS];
        System.out.println("Enter exam scores for each student:");
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }
        int sum = 0;
        int highestScore = scores[0];
        for (int score : scores) {
            sum += score;
            if (score > highestScore) {
                highestScore = score;
            }
        }
        System.out.println("\nExam score statistics:");
        System.out.println("Sum of all scores: " + sum);
        System.out.println("Highest score attained: " + highestScore);

    }
}
