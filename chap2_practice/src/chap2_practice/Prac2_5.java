package chap2_practice;
import java.util.Scanner;
public class Prac2_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c;
		System.out.print("���� 3���� �Է��Ͻÿ� >> ");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		if((a+b) <= c || (a+c) <= b || (b+c) <= a) System.out.println("�ﰢ���� �ȵ˴ϴ�.");
		else System.out.println("�ﰢ���� �˴ϴ�.");
		scanner.close();
	}

}
