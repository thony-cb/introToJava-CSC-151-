import java.util.Scanner;

public class Exercise07_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] scores = new int[numStudents];

        System.out.print("Enter " + numStudents + " scores: ");
        for (int i = 0; i < numStudents; i++) {
            scores[i] = scanner.nextInt();
        }

        int bestScore = findBestScore(scores);
        char[] grades = assignGrades(scores, bestScore);

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[i]);
        }
    }

    public static int findBestScore(int[] scores) {
        int bestScore = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > bestScore) {
                bestScore = scores[i];
            }
        }

        return bestScore;
    }

    public static char[] assignGrades(int[] scores, int bestScore) {
        char[] grades = new char[scores.length];

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= bestScore - 10) {
                grades[i] = 'A';
            } else if (scores[i] >= bestScore - 20) {
                grades[i] = 'B';
            } else if (scores[i] >= bestScore - 30) {
                grades[i] = 'C';
            } else if (scores[i] >= bestScore - 40) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        return grades;
    }
}
