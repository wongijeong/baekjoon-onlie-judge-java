package src.CLASS1;

import java.util.Scanner;

public class P2738 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] arrA = new int[n][m];
		int[][] arrB = new int[n][m];
		int[][] arrSum = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arrA[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arrB[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arrSum[i][j] = arrA[i][j] + arrB[i][j];
				System.out.print(arrSum[i][j] + " ");
			}
			System.out.println();
		}
	}
}
