package chap2_practice;
import java.util.Scanner;
public class Prac2_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		
		System.out.print("2자리수 정수 입력(10 ~ 99) >> ");
		num=scanner.nextInt();
		if((num/10)==(num%10)) System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		else System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		scanner.close();
	}

}
