import java.util.Scanner;

//loops

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
		

		//using a for loop

		for (int i=0; i<=n; i++) {
			if(i%2 == 0)
				System.out.println(i);
		}


		//using a while loop

/*		int i = 0;
		while (i<=n) {
			if(i%2 == 1)
				System.out.println(i);
		}
		i++;
*/
	}
	
}
