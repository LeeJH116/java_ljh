package chap3_practice;

import java.util.Scanner;

public class Prac3_8 {
	public static void main(String arg[]) {
		Scanner scanner = new Scanner(System.in);
		int n[] = new int[100];
		System.out.print("정수 몇개? ");
		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			n[i] = (int) (Math.random() * 100 + 1);
			for (int j = 0; j < i; j++) {
				if (n[i] == n[j]) {
					i--;
					break;
				}
			}
		}
		int count = 0;
		for (int k : n) {
			if (k > 0) {
				System.out.print(k + " ");
				count++;
			}
			if (count == 10) {
				System.out.print("\n");
				count = 0;
			}
		}
		scanner.close();
	}

}
