import java.util.Scanner;


public class SumMeanMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println("a: " + a + " b: " + b + " c: " + c);

		/*
		 * Todo: Print the sum, mean, max Value and min Value of a, b and c.
		 * */
		
		//Sum
		int sum = a + b + c;
		System.out.println("The sum of a, b and c is " + sum);

		//Mean
		int mean = (a+b+c)/3;
		System.out.println("The mean of a, b and c is " + mean);

		//Max Value
		int maxValue = 0;
		if(a > maxValue) maxValue = a;

		if(b > maxValue) maxValue = b;

		if(c > maxValue) maxValue = c;

		System.out.println("The maximum value of a, b, and c is " + maxValue);

		//Min Value
		int minValue = 5000;
		if (a < minValue) minValue = a;

		if (b < minValue) minValue = b;

		if (c < minValue) minValue = c;

		System.out.println("The minimum value of a, b and c is " + minValue);


	}

}
