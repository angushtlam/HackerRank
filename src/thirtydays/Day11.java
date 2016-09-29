package thirtydays;

import java.util.Scanner;

/**
 * Created by angus on 9/29/16.
 * Day 11: 2D Arrays
 */
public class Day11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		int largestHourglass = -9 * 16;

		// Start searching from the center piece.
		for (int locX = 1; locX < 5; locX++) {
			for (int locY = 1; locY < 5; locY++) {
				int total = 0;
				total += arr[locX][locY];
				total += arr[locX - 1][locY - 1];
				total += arr[locX - 1][locY    ];
				total += arr[locX - 1][locY + 1];
				total += arr[locX + 1][locY - 1];
				total += arr[locX + 1][locY    ];
				total += arr[locX + 1][locY + 1];

				if (total > largestHourglass) largestHourglass = total;
			}
		}

		System.out.println(largestHourglass);
		in.close();
	}
}
