package chap2_practice;
import java.util.Scanner;
public class Prac2_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력 >> ");
		int x1,y1;
		double radius1;
		x1=scanner.nextInt();
		y1=scanner.nextInt();
		radius1=scanner.nextDouble();
		
		System.out.print("두번째 원의 중심과 반지름 입력 >> ");
		int x2,y2;
		double radius2;
		x2=scanner.nextInt();
		y2=scanner.nextInt();
		radius2=scanner.nextDouble();
		
		if(Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))<=(radius1+radius2)) System.out.println("두 원은 서로 겹친다.");
		else System.out.println("두 원은 겹치지 않는다.");

		scanner.close();
	}
}