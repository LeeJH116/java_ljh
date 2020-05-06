package chap4_practice;

import java.util.Scanner;

public class Prac4_12 {

	public static void main(String[] args) {
		ReservationSystem day1 = new ReservationSystem();
		day1.run();
	}

}

class ReservationSystem {
	private Scanner scanner = new Scanner(System.in);
	private Seat S[] = new Seat[10];
	private Seat A[] = new Seat[10];
	private Seat B[] = new Seat[10];

	ReservationSystem() {
		for (int i = 0; i < S.length; i++) {
			S[i] = new Seat();
		}
		for (int i = 0; i < A.length; i++) {
			A[i] = new Seat();
		}
		for (int i = 0; i < B.length; i++) {
			B[i] = new Seat();
		}
	}

	void run() {
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");

		while (true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>> ");
			int num = scanner.nextInt();
			if (num == 1) {
				reservation();
			} else if (num == 2) {
				view();
			} else if (num == 3) {
				cancel();
			} else if (num == 4)
				break;
			else
				System.out.println("���� �޴� �Դϴ�.");
		}
	}

	private void reservation() {
		System.out.print("�¼����� S(1), A(2), B(3)>> ");
		int num = scanner.nextInt();
		if (num == 1) {
			System.out.print("S>> ");
			for (Seat n : S) {
				if (n.getName() == null)
					System.out.print("--- ");
				else
					System.out.print(n.getName() + " ");
			}
			System.out.print("\n�̸�>> ");
			String name = scanner.next();
			System.out.print("��ȣ>> ");
			int seatNum = scanner.nextInt();
			try {
				if (S[seatNum - 1].getName() == null)
					S[seatNum - 1].setName(name);
				else
					System.out.println("����Ǿ��ִ� �¼��Դϴ�.");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("���� �¼� �Դϴ�.");
			}
		} else if (num == 2) {
			System.out.print("A>> ");
			for (Seat n : A) {
				if (n.getName() == null)
					System.out.print("--- ");
				else
					System.out.print(n.getName() + " ");
			}
			System.out.print("\n�̸�>> ");
			String name = scanner.next();
			System.out.print("��ȣ>> ");
			int seatNum = scanner.nextInt();
			try {
				if (A[seatNum - 1].getName() == null)
					A[seatNum - 1].setName(name);
				else
					System.out.println("����Ǿ��ִ� �¼��Դϴ�.");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("���� �¼� �Դϴ�.");
			}
		} else if (num == 3) {
			System.out.print("B>> ");
			for (Seat n : B) {
				if (n.getName() == null)
					System.out.print("--- ");
				else
					System.out.print(n.getName() + " ");
			}
			System.out.print("\n�̸�>> ");
			String name = scanner.next();
			System.out.print("��ȣ>> ");
			int seatNum = scanner.nextInt();
			try {
				if (B[seatNum - 1].getName() == null)
					B[seatNum - 1].setName(name);
				else
					System.out.println("����Ǿ��ִ� �¼��Դϴ�.");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("���� �¼� �Դϴ�.");
			}
		} else
			System.out.println("���� �¼� �Դϴ�.");
	}

	private void view() {
		System.out.print("S>> ");
		for (Seat n : S) {
			if (n.getName() == null)
				System.out.print("--- ");
			else
				System.out.print(n.getName() + " ");
		}
		System.out.print("\nA>> ");
		for (Seat n : A) {
			if (n.getName() == null)
				System.out.print("--- ");
			else
				System.out.print(n.getName() + " ");
		}
		System.out.print("\nB>> ");
		for (Seat n : B) {
			if (n.getName() == null)
				System.out.print("--- ");
			else
				System.out.print(n.getName() + " ");
		}
		System.out.println("\n<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>");
	}

	private void cancel() {
		System.out.print("�¼����� S(1), A(2), B(3)>> ");
		int num = scanner.nextInt();
		if (num == 1) {
			boolean checkName = true;
			System.out.print("S>> ");
			for (Seat n : S) {
				if (n.getName() == null)
					System.out.print("--- ");
				else
					System.out.print(n.getName() + " ");
			}
			System.out.print("\n�̸�>> ");
			String name = scanner.next();
			for (Seat n : S) {
				if (n.getName() == null)
					continue;
				else if (n.getName().equals(name)) {
					n.setName(null);
					checkName = false;
					break;
				}
			}
			if (checkName)
				System.out.println("�ش� �����ڰ� �������� �ʽ��ϴ�.");
		} else if (num == 2) {
			boolean checkName = true;
			System.out.print("A>> ");
			for (Seat n : A) {
				if (n.getName() == null)
					System.out.print("--- ");
				else
					System.out.print(n.getName() + " ");
			}
			System.out.print("\n�̸�>> ");
			String name = scanner.next();
			for (Seat n : A) {
				if (n.getName() == null)
					continue;
				else if (n.getName().equals(name)) {
					n.setName(null);
					checkName = false;
					break;
				}
			}
			if (checkName)
				System.out.println("�ش� �����ڰ� �������� �ʽ��ϴ�.");
		} else if (num == 3) {
			boolean checkName = true;
			System.out.print("B>> ");
			for (Seat n : B) {
				if (n.getName() == null)
					System.out.print("--- ");
				else
					System.out.print(n.getName() + " ");
			}
			System.out.print("\n�̸�>> ");
			String name = scanner.next();
			for (Seat n : B) {
				if (n.getName() == null)
					continue;
				else if (n.getName().equals(name)) {
					n.setName(null);
					checkName = false;
					break;
				}
			}
			if (checkName)
				System.out.println("�ش� �����ڰ� �������� �ʽ��ϴ�.");
		} else
			System.out.println("���� �¼� �Դϴ�.");
	}
}

class Seat {
	private String name;

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
}