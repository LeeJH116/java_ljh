package chap2_practice;
import java.util.Scanner;
public class Prac2_1 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("원화를 입력하세요(단위 원)>> ");
		int won = scanner.nextInt();
		System.out.println(won + "원은 $" + (double)won/1100 + "입니다");
		
		scanner.close();
	}
}
