package chap3_practice;

import java.util.Scanner;

public class Prac3_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String course[] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score[] = { 95, 88, 76, 62, 55 };

		String s;

		do {
			System.out.print("���� �̸� >> ");
			s = scanner.next();

			for (int i = 0; i < course.length; i++) {
				if (s.equals(course[i])) {
					System.out.println(course[i] + "�� ������ " + score[i]);
					break;
				} else if (i == (course.length - 1)) {
					System.out.println("���� �����Դϴ�.");

					break;
				}
			}

		} while (!s.equals("�׸�"));
		scanner.close();
	}
}
