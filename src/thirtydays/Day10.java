package thirtydays;

import java.util.Scanner;

/**
 * Created by angus on 9/29/16.
 * Day 10: Binary Numbers
 */
public class Day10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		// Counter for number of 1s in base2 number.
		String base2 = "";

		while (num > 0) {
			base2 = num % 2 + base2;
			num /= 2;
		}

		int longestSeq = 0;
		int currentSeq = 0;
		for (char c : base2.toCharArray()) {
			switch (c) {
				case '0':
					if (currentSeq > longestSeq) longestSeq = currentSeq;
					currentSeq = 0;
					break;
				case '1':
				default:
					currentSeq++;
					break;
			}
		}

		// Last check at end of loop
		if (currentSeq > longestSeq) longestSeq = currentSeq;

		System.out.println(longestSeq);
		scanner.close();
	}
}
