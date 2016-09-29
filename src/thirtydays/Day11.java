package thirtydays;

import java.util.Scanner;

/**
 * Created by angus on 9/29/16.
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

		// Search only in possible locations.



		in.close();
	}
}
