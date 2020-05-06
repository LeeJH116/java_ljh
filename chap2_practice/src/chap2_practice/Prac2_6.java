package chap2_practice;
import java.util.Scanner;
public class Prac2_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		
		System.out.print("1 ~ 99 사이의 정수를 입력하시오 >> ");
		num = scanner.nextInt();
		
		int num_10,num_1;
		num_10 = num/10;
		num_1 = num%10;
		
		if((num_10 % 3) == 0) {
			if((num_1%3) == 0) System.out.println("박수짝짝");
			else System.out.println("박수짝");
		}
		else if((num_1 % 3) == 0) System.out.println("박수짝");
		
		scanner.close();
	}

}
