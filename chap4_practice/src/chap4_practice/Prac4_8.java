package chap4_practice;

import java.util.Scanner;

public class Prac4_8 {
	public static void main(String[] args) {
		PhoneBook p1 = new PhoneBook();
		p1.run();
	}

}

class Phone {
	private String name, number;

	void setName(String name) {
		this.name = name;
	}

	void setNumber(String number) {
		this.number = number;
	}

	String getName() {
		return name;
	}

	String getNumber() {
		return number;
	}
}

class PhoneBook {
	private Phone people[];
	private Scanner scanner = new Scanner(System.in);
	private String name, number;

	public PhoneBook() {
		System.out.print("인원수>> ");
		int num = scanner.nextInt();
		people = new Phone[num];
		for (int i = 0; i < num; i++)
			people[i] = new Phone();
	}

	void run() {
		for (int i = 0; i < people.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>> ");
			name = scanner.next();
			number = scanner.next();
			people[i].setName(name);
			people[i].setNumber(number);
		}
		System.out.println("저장되었습니다.....");
		while (true) {
			boolean checkName = true;
			System.out.print("검색할 이름>> ");
			name = scanner.next();
			if (name.equals("그만"))
				break;
			else {
				for (Phone k : people) {
					if (k.getName().equals(name)) {
						System.out.println(k.getName() + "의 번호는 " + k.getNumber() + "입니다.");
						checkName = false;
					}
				}
				if (checkName) {
					System.out.println(name + " 이 없습니다");
				}
			}
		}
	}
}