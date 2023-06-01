// (Count positive and negative numbers and compute the average of numbers)
// Write a program that reads an unspecified number of integers, determines how many positive and negative values have been read, and computes the total and average of the input values (not counting zeros). Your program ends with the input 0. Display the average as a floating-point number.

//My Code

import java.util.Scanner;
public class Exercise05_01 {
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int pos = 0;
		int neg = 0;
		int total = 0;
		int count = 0;
		do {
		    System.out.println("Enter an integer, the input ends if it is 0:");
			n = input.nextInt();
			if (n != 0){
			    total+=n;
			    count++;
			    if (n>0) {
				    pos++;
			    } else {
				neg++;
			    }
		    }
		}while(n != 0);
		
		double avg = (double)total / count;
		System.out.println("The number of positives is "+ pos);
		System.out.println("The number of negatives is "+ neg);
		System.out.println("The total is "+ total);
		System.out.println("The average is "+ avg);
	}

}
