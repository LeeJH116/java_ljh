package chap4_practice;

import java.util.Scanner;

public class Prac4_7 {

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		while (true) {
			april.run();
		}
	}
}

class Day {
	private String work;

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null)
			System.out.println("�����ϴ�.");
		else
			System.out.println(work + "�Դϴ�.");
	}
}

class MonthSchedule {
	private int days, num, day;
	private Day[] work;
	private String dayWork;
	Scanner scanner = new Scanner(System.in);

	MonthSchedule(int days) {
		this.days = days;
		work = new Day[days];
		for (int i = 0; i < days; i++)
			work[i] = new Day();
	}

	void run() {
		System.out.print("����(�Է�:1, ����:2, ������:3) >> ");
		num = scanner.nextInt();
		if (num == 1) {
			System.out.print("��¥(1~" + days + ")? ");
			day = scanner.nextInt() - 1;
			input();
			System.out.println();
		} else if (num == 2) {
			System.out.print("��¥(1~" + days + ")? ");
			day = scanner.nextInt() - 1;
			view();
			System.out.println();
		} else if (num == 3)
			finish();
	}

	void input() {
		try {
			scanner.nextLine();
			System.out.print("����(��ĭ�����Է�)? ");
			dayWork = scanner.next();
			work[day].set(dayWork);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("��¥�� �߸� �Է��ϼ̽��ϴ�.");
		}
	}

	void view() {
		try {
			if (work[day].get() == null)
				System.out.println(day + 1 + "���� �� ���� �����ϴ�");
			else
				System.out.println(day + 1 + "���� �� ���� " + work[day].get() + "�Դϴ�.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("��¥�� �߸� �Է��ϼ̽��ϴ�.");
		}
	}

	void finish() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
}
