package chap4_practice;

import java.util.Scanner;

public class Prac4_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String s = scanner.next();

		switch (s) {
		case "+":
			add.setValue(a, b);
			System.out.print(add.calculate());
			break;
		case "-":
			sub.setValue(a, b);
			System.out.print(sub.calculate());
			break;
		case "*":
			mul.setValue(a, b);
			System.out.print(mul.calculate());
			break;
		case "/":
			div.setValue(a, b);
			System.out.print(div.calculate());
			break;
		default:
			break;
		}
		scanner.close();
	}

}

class Add {
	private int a, b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int calculate() {
		return a + b;
	}
}

class Sub {
	private int a, b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int calculate() {
		return a - b;
	}
}

class Mul {
	private int a, b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int calculate() {
		return a * b;
	}
}

class Div {
	private int a, b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int calculate() {
		return a / b;
	}
}