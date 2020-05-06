package chap3_practice;

import java.util.Scanner;

public class Prac3_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };

		String s;

		do {
			System.out.print("과목 이름 >> ");
			s = scanner.next();

			for (int i = 0; i < course.length; i++) {
				if (s.equals(course[i])) {
					System.out.println(course[i] + "의 점수는 " + score[i]);
					break;
				} else if (i == (course.length - 1)) {
					System.out.println("없는 과목입니다.");

					break;
				}
			}

		} while (!s.equals("그만"));
		scanner.close();
	}
}
