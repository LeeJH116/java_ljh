package chap2_practice;
import java.util.Scanner;
public class Prac2_11_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		System.out.print("달을 입력하세요(1 ~ 12) >> ");
		num = scanner.nextInt();
		switch(num){
		case 12:
		case 1:
		case 2: 
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5: 
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8: 
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11: 
			System.out.println("가을");
			break;
		default:
			System.out.println("잘못입력");
			break;
				
		}
		scanner.close();
	}
}