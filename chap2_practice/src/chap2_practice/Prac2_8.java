package chap2_practice;
import java.util.Scanner;

public class Prac2_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x1, x2, y1, y2;
		
		System.out.print("�� �� (x1, y1), (x2, y2)�� �Է��Ͻÿ� >> ");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		
		if(inRect(x1,y1,100,100,200,200) || inRect(x2,y2,100,100,200,200) || inRect(x2,y1,100,100,200,200)
				|| inRect(x1,y2,100,100,200,200)) System.out.println("�� ���簢���� �浹�մϴ�.");
		else System.out.println("�� ���簢���� �浹���� �ʽ��ϴ�.");
		
		scanner.close();
	}
	
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x >= rectx1 && x <= rectx2) &&(y >= recty1 && y<= recty2))
			return true;
		else return false;
	}

}
