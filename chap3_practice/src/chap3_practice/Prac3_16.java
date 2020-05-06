package chap3_practice;

import java.util.Scanner;

public class Prac3_16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str[] = { "가위", "바위", "보" };
		String s;
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		do {
			System.out.print("가위 바위 보!>> ");
			s = scanner.next();
			int n = (int) (Math.random() * 3);
			for (int i = 0; i < str.length; i++) {
				if (s.equals(str[i])) {
					if (i == n)
						System.out.println("컴퓨터 : " + str[n] + ", 사용자 : " + str[i] + ", 비겼습니다.");
					else {
						if ((i == 0 && n == 2) || (i == 1 && n == 0) || (i == 2 && n == 1))
							System.out.println("컴퓨터 : " + str[n] + ", 사용자 : " + str[i] + ", 이겼습니다.");
						else
							System.out.println("컴퓨터 : " + str[n] + ", 사용자 : " + str[i] + ", 졌습니다.");
					}
				}
			}
			
		} while (!s.equals("그만"));
		scanner.close();
	}

}
