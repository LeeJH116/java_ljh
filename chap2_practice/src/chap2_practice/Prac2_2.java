package chap2_practice;
import java.util.Scanner;
public class Prac2_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		
		System.out.print("2�ڸ��� ���� �Է�(10 ~ 99) >> ");
		num=scanner.nextInt();
		if((num/10)==(num%10)) System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		scanner.close();
	}

}
