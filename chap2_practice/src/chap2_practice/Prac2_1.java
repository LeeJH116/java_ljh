package chap2_practice;
import java.util.Scanner;
public class Prac2_1 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("��ȭ�� �Է��ϼ���(���� ��)>> ");
		int won = scanner.nextInt();
		System.out.println(won + "���� $" + (double)won/1100 + "�Դϴ�");
		
		scanner.close();
	}
}
