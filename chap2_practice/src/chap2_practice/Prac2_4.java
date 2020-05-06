package chap2_practice;
import java.util.Scanner;
public class Prac2_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c;
		System.out.print("정수 3개 입력 >> ");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		if(a>b) {
			if(b>c) System.out.println("중간 값은  "+ b);
			else System.out.println("중간 값은  "+ c);
			
		}
		else {
			if(a>c) System.out.println("중간 값은  "+ a);
			else System.out.println("중간 값은  "+ c);
		}
		
		scanner.close();
	}

}
