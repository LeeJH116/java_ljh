package chap2_practice;
import java.util.Scanner;
public class Prac2_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c;
		System.out.print("���� 3�� �Է� >> ");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		if(a>b) {
			if(b>c) System.out.println("�߰� ����  "+ b);
			else System.out.println("�߰� ����  "+ c);
			
		}
		else {
			if(a>c) System.out.println("�߰� ����  "+ a);
			else System.out.println("�߰� ����  "+ c);
		}
		
		scanner.close();
	}

}
