package chap3_practice;

import java.util.Scanner;

public class Prac3_16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str[] = { "����", "����", "��" };
		String s;
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		do {
			System.out.print("���� ���� ��!>> ");
			s = scanner.next();
			int n = (int) (Math.random() * 3);
			for (int i = 0; i < str.length; i++) {
				if (s.equals(str[i])) {
					if (i == n)
						System.out.println("��ǻ�� : " + str[n] + ", ����� : " + str[i] + ", �����ϴ�.");
					else {
						if ((i == 0 && n == 2) || (i == 1 && n == 0) || (i == 2 && n == 1))
							System.out.println("��ǻ�� : " + str[n] + ", ����� : " + str[i] + ", �̰���ϴ�.");
						else
							System.out.println("��ǻ�� : " + str[n] + ", ����� : " + str[i] + ", �����ϴ�.");
					}
				}
			}
			
		} while (!s.equals("�׸�"));
		scanner.close();
	}

}
