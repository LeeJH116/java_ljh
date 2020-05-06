package chap5_practice;

import java.util.Scanner;

public class Prac5_9 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int n = scanner.nextInt();

		StringStack s = new StringStack(n); //

		while (true) {
			System.out.print("문자열 입력 >> ");
			String str = scanner.next();
			if (str.equals("그만"))
				break;
			if (!s.push(str)) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		int k = s.length();
		for (int i = 0; i < k; i++) {
			System.out.print(s.pop() + " ");
		}

		scanner.close();
	}

}

interface Stack {
	int length();

	int capacity();

	String pop();

	boolean push(String val);
}

class StringStack implements Stack {
	String[] stack;
	int tos = -1;

	public StringStack(int n) {
		stack = new String[n];
	}

	public int length() {
		return tos + 1;
	}

	public int capacity() {
		return stack.length;
	}

	public String pop() {
		try {
			return stack[tos--];
		} catch (ArrayIndexOutOfBoundsException e) {
			return null;
		}
	}

	public boolean push(String val) {
		if (tos == stack.length - 1)
			return false;
		else {
			stack[++tos] = val;
			return true;
		}
	}

}