package chap5_practice;

import java.util.Scanner;

public class Prac5_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		System.out.print("두 정수와 연산자를 입력하시오>> ");
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
			if (b == 0)
				System.out.print("0으로 나눌 수 없습니다");
			else
				System.out.print(div.calculate());
			break;
		default:
			break;
		}
		scanner.close();

	}

}

abstract class Calc {
	int a, b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	abstract int calculate();
}

class Add extends Calc {
	int calculate() {
		return a + b;
	}
}

class Sub extends Calc {
	int calculate() {
		return a - b;
	}
}

class Mul extends Calc {
	int calculate() {
		return a * b;
	}
}

class Div extends Calc {
	int calculate() {
		return a / b;
	}
}