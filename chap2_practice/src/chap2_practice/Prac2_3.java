package chap2_practice;
import java.util.Scanner;
public class Prac2_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money;
		
		System.out.print("�ݾ��� �Է��Ͻÿ� >> ");
		money = scanner.nextInt();
		
		System.out.println("�������� " + money/50000 + "��");
		money=money%50000;
		System.out.println("������ " + money/10000 + "��");
		money=money%10000;
		System.out.println("õ���� " + money/1000 + "��");
		money=money%1000;
		System.out.println("��� " + money/100 + "��");
		money=money%100;
		System.out.println("�ʿ� " + money/10 + "��");
		money=money%10;
		System.out.println("�Ͽ� " + money + "��");
		
		scanner.close();
	}

}
