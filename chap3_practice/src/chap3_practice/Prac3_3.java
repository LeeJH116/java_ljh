package chap3_practice;

import java.util.Scanner;

public class Prac3_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("������ �Է��Ͻÿ�>> ");
		int n = scanner.nextInt();

		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}
}