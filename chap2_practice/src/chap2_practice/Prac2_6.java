package chap2_practice;
import java.util.Scanner;
public class Prac2_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		
		System.out.print("1 ~ 99 ������ ������ �Է��Ͻÿ� >> ");
		num = scanner.nextInt();
		
		int num_10,num_1;
		num_10 = num/10;
		num_1 = num%10;
		
		if((num_10 % 3) == 0) {
			if((num_1%3) == 0) System.out.println("�ڼ�¦¦");
			else System.out.println("�ڼ�¦");
		}
		else if((num_1 % 3) == 0) System.out.println("�ڼ�¦");
		
		scanner.close();
	}

}
