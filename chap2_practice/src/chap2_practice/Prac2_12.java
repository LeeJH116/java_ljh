package chap2_practice;
import java.util.Scanner;
public class Prac2_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� >> ");
		int num1, num2;
		String operator;
		num1 = scanner.nextInt();
		operator = scanner.next();
		num2 = scanner.nextInt();
		
		switch (operator) {
		case "+":
			System.out.println("��� �����  "+ (num1+num2) + "�Դϴ�.");
			break;
		case "-":
			System.out.println("��� �����  "+ (num1-num2) + "�Դϴ�.");
			break;
		case "*":
			System.out.println("��� �����  "+ (num1*num2) + "�Դϴ�.");
			break;
		case "/":
			if(num2 == 0) {System.out.println("0���� ���� �� �����ϴ�."); break;}
			System.out.println("��� �����  "+ (num1/num2) + "�Դϴ�.");
		}
		
		scanner.close();
	}
}