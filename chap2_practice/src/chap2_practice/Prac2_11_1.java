package chap2_practice;
import java.util.Scanner;
public class Prac2_11_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		System.out.print("���� �Է��ϼ���(1 ~ 12) >> ");
		num = scanner.nextInt();
		if(num == 12 || num == 1 || num ==2) System.out.println("�ܿ�");
		else if(num == 9 || num == 10 || num == 11) System.out.println("����");
		else if(num == 3 || num == 4 || num == 5) System.out.println("��");
		else if(num == 6 || num == 7 || num == 8) System.out.println("����");
		else System.out.println("�߸��Է�");
		scanner.close();
	}
}