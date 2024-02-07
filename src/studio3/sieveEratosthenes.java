package studio3;
import java.util.Scanner;
public class sieveEratosthenes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What number do you want to find the prime numbers until?");
		int n = in.nextInt();
		int[] numbers = new int[n];
		for (int place = 0; place < n - 1; place++)
		{
			numbers[place] = n - (n - place) + 2;
			//System.out.println(numbers[place]);
			if (numbers[place] == place*place + 2*place)
			{
				numbers[place] = 0;
			}
			else
			{
				System.out.println(numbers[place]);
			}
		}
	}

}
