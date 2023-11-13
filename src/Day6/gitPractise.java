package Day6;

public class gitPractise {
	public void calSumAndAverage() {
		/*
		 * 2. Write a program called SumAndAverage to produce the sum of 1, 2, 3, ...,
		 * to 100. Also compute and display the average. The output shall look like: The
		 * sum is 5050 The average is 50.5
		 * 
		 */
		// int sum[]= new int[6];
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			sum = sum + i;
			// System.out.println(sum);
		}
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + (double) sum / 100);

	}

	/*
	 * 8. (*) Write a program called SquareBoard that displays the following n×n
	 * (n=5) pattern using two nested for-loops. # # # # # # # # # # # # # # # # # #
	 * # # # # # # #
	 * 
	 */
	public void printSquareBoard() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("#  ");
			}

			System.out.println("\n");
		}

	}

	/*
	 * CheckerBoard
	 */
	public void printCheckerBoard() {

		for (int i = 0; i < 7; i++) {
			double line = 0;
			line = i;
			for (int j = 0; j < 7; j++) {
				if (line % 2 == 0) {
					System.out.print("#  ");

				} else
					System.out.print(" # ");
			}

			System.out.println("\n");

		}

	}
}
