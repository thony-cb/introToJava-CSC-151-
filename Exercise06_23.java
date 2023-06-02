
// (Occurrences of a specified character) 
// Write a method that finds the number of occurrences of a specified character in a string using the following header:
// public static int count(String str, char a)
// For example, count("Welcome", 'e') returns 2.
// Write a test program that prompts the user to enter a string followed by a character and displays the number of occurrences of the character in the string.
// Sample Run
// Enter a string: We the people
// Enter a character: e
// The number of occurrences of e in We the people is 4







import java.util.Scanner;
public class Exercise06_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word = "";
		char letter;
		System.out.println("Enter a string:");
		word = input.nextLine();
		System.out.println("Enter a character:");
		letter = input.next().charAt(0);
		System.out.println("The number of occurrences of " + letter + " in " + word + " is " + count(word, letter));
		
		
	}

	public static int count(String str, char a) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				count++;
			}
		}
		return count;
	}
}
