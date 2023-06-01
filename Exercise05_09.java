// (Find the two highest scores) 
// Write a program that prompts the user to enter the number of students and each student’s name and score, and finally displays the student with the highest score and the student with the second-highest score. Use the next()method in the Scanner class to read a name rather than using the nextLine()method. Assume that the number of students is at least 2.

// My code

import java.util.Scanner;

public class Exercise05_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String topName = "";
		String topNameTwo = "";
		int topScoreOne = 1;
		int topScoreTwo = 1;
		System.out.println("Enter the number of students:");
		int num = input.nextInt();
        input.nextLine();
		for (int i = 0; i < num; i++) {
			System.out.println("Enter a student name:");
			String kid = input.nextLine();
			System.out.println("Enter a student score:");
			int score = input.nextInt();
			input.nextLine();
			if (score > topScoreOne) {
				topScoreTwo = topScoreOne;
                topNameTwo = topName;
                topScoreOne = score;
                topName = kid;
			} else if (score > topScoreTwo) {
				topScoreTwo = score;
				topNameTwo = kid;
			}
		}

		System.out.println("Top two students:\n" + topName + "score is" + topScoreOne + "\n" + topNameTwo + "score is"
				+ topScoreTwo);

	}
}
