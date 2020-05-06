package chap4_practice;

import java.util.Scanner;

public class Prac4_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����, ���� ���� ������ 3���� ���� �Է�>> ");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.print("����� " + me.average());
		scanner.close();
	}

}

class Grade {
	private int math, english, science;

	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	int average() {
		return (math + science + english) / 3;
	}
}