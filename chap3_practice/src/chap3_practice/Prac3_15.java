package chap3_practice;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Prac3_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("���ϰ����ϴ� �� �� �Է�>> ");
				int n = scanner.nextInt();
				int m = scanner.nextInt();
				System.out.print(n + "x" + m + "=" + n * m);
				break;
			} catch (InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scanner.nextLine();
			}
		}
		scanner.close();
	}
}
