package chap3_practice;

import java.util.Scanner;

public class Prac3_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int unit[] = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };

		System.out.print("�ݾ��� �Է��Ͻÿ�>> ");
		int money = scanner.nextInt();

		for (int k : unit) {
			if ((money / k) > 0) {
				System.out.println(k + "�� ¥�� : " + money / k + "��");
				money = money % k;
			}
		}
		scanner.close();
	}

}
