package src.CLASS1;

import java.util.Scanner;

public class P10807 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		int x = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			if (array[i] == x){
				count++;
			}
		}

		System.out.println(count);
	}
}
