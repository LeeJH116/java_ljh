package chap2_practice;
import java.util.Scanner;
public class Prac2_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�� (x, y)�� ��ǥ�� �Է��Ͻÿ� >> ");
		int x,y;
		x=scanner.nextInt();
		y=scanner.nextInt();
		
		if(100<=x && x<=200 && y>=100 && y<=200) System.out.println("("+x+", "+y+")�� �簢�� �ȿ� �ֽ��ϴ�.");
		else System.out.println("("+x+", "+y+")�� �簢�� �ȿ� �����ϴ�.");
		
		scanner.close();
	}
}
