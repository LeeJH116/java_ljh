package chap2_practice;
import java.util.Scanner;
public class Prac2_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �߽ɰ� ������ �Է� >> ");
		int x1,y1;
		double radius;
		x1=scanner.nextInt();
		y1=scanner.nextInt();
		radius=scanner.nextDouble();
		
		System.out.print("�� �Է� >> ");
		int x2,y2;
		x2=scanner.nextInt();
		y2=scanner.nextInt();
		
		if(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))<=(radius*radius)) System.out.println("�� ("+x2+", "+y2+")�� �� �ȿ� �ֽ��ϴ�.");
		else System.out.println("�� ("+x2+", "+y2+")�� �� �ȿ� �����ϴ�.");

		scanner.close();
	}
}
