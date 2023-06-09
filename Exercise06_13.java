// (Sum series) 
// Write a method to compute the following series:
// m(i) = 1/2 + 2/3 +......+ i/(i+1) 
// Write a test program that displays the following table:
// i       m(i)
// 1      0.5000
// 2      1.1667
// ...
// 19    16.4023
// 20    17.3546


public class Exercise06_13 {

	public static void main(String[] args) {
		// Display table series data between 1.0 t0 20.0
		double seriesStart  =  1.0;	
		double numberOfRows = 20.0;	

		// Header
		System.out.println("\ni m(i)");
		System.out.println("-------------------");

		// Data
		for (double i = seriesStart; i <= numberOfRows; i++) {
			System.out.printf("%-10.0f", i);
			System.out.printf("%7.4f\n", sumSeries(i));
		}
	}

	/*** Method sumSeries: computes the series */
	public static double sumSeries(double n) {
		double sum = 0;	
		for (double i = 1; i <= n; i++) {
			sum += i / (i + 1);
		}
		return sum;
	}
}
