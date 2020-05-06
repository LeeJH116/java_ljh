package chap2_practice;
import java.util.Scanner;
public class Prac2_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연산 >> ");
		int num1, num2;
		String operator;
		num1 = scanner.nextInt();
		operator = scanner.next();
		num2 = scanner.nextInt();
		
		switch (operator) {
		case "+":
			System.out.println("계산 결과는  "+ (num1+num2) + "입니다.");
			break;
		case "-":
			System.out.println("계산 결과는  "+ (num1-num2) + "입니다.");
			break;
		case "*":
			System.out.println("계산 결과는  "+ (num1*num2) + "입니다.");
			break;
		case "/":
			if(num2 == 0) {System.out.println("0으로 나눌 수 없습니다."); break;}
			System.out.println("계산 결과는  "+ (num1/num2) + "입니다.");
		}
		
		scanner.close();
	}
}