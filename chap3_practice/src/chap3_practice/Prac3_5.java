package chap3_practice;
import java.util.Scanner;
public class Prac3_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n[] = new int[10];
		
		System.out.print("양의 정수를 10개를 입력하시오>> ");
		
		for(int i = 0; i< n.length; i++) n[i] = scanner.nextInt();
		System.out.print("3의 배수는 ");
		for(int k : n) if((k%3)==0) System.out.print(k+" ");
		scanner.close();
	}
}
