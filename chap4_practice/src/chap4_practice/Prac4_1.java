package chap4_practice;

public class Prac4_1 {

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}

class TV {
	String name;
	int year;
	int inch;

	public TV(String name, int year, int inch) {
		this.name = name;
		this.year = year;
		this.inch = inch;
	}

	void show() {
		System.out.print(name + "���� ���� " + year + "���� " + inch + "��ġ TV");
	}
}