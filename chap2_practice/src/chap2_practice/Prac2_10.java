package chap2_practice;
import java.util.Scanner;
public class Prac2_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է� >> ");
		int x1,y1;
		double radius1;
		x1=scanner.nextInt();
		y1=scanner.nextInt();
		radius1=scanner.nextDouble();
		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է� >> ");
		int x2,y2;
		double radius2;
		x2=scanner.nextInt();
		y2=scanner.nextInt();
		radius2=scanner.nextDouble();
		
		if(Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))<=(radius1+radius2)) System.out.println("�� ���� ���� ��ģ��.");
		else System.out.println("�� ���� ��ġ�� �ʴ´�.");

		scanner.close();
	}
}