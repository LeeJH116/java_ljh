package chap3_practice;
import java.util.Scanner;
public class Prac3_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>> ");
		String s= scanner.next();
		char c = s.charAt(0);
		
		for(int i = c; i >= 'a'; i--){
			for(char j = 'a'; j <= i; j++)
				System.out.print(j);
			System.out.println();
		}
		scanner.close();
	}

}
