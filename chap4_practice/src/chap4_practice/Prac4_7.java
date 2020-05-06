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
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
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
		System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
		num = scanner.nextInt();
		if (num == 1) {
			System.out.print("날짜(1~" + days + ")? ");
			day = scanner.nextInt() - 1;
			input();
			System.out.println();
		} else if (num == 2) {
			System.out.print("날짜(1~" + days + ")? ");
			day = scanner.nextInt() - 1;
			view();
			System.out.println();
		} else if (num == 3)
			finish();
	}

	void input() {
		try {
			scanner.nextLine();
			System.out.print("할일(빈칸없이입력)? ");
			dayWork = scanner.next();
			work[day].set(dayWork);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("날짜를 잘못 입력하셨습니다.");
		}
	}

	void view() {
		try {
			if (work[day].get() == null)
				System.out.println(day + 1 + "일의 할 일은 없습니다");
			else
				System.out.println(day + 1 + "일의 할 일은 " + work[day].get() + "입니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("날짜를 잘못 입력하셨습니다.");
		}
	}

	void finish() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
}
