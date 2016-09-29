package thirtydays;

import java.util.Scanner;

/**
 * Created by angus on 9/29/16.
 * Day 9: Recursion
 */
public class Day9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		System.out.println(factorial(num));

		scanner.close();
	}

	private static int factorial(int num) {
		if (num > 0) {
			return num * factorial(num - 1);
		}

		return 1;
	}
}
