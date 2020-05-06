package chap3_practice;

import java.util.Scanner;

public class Prac3_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int num = 1; num < 100; num++) {
			int num_10 = num / 10;
			int num_1 = num % 10;
			if ((num_10 % 3) == 0 && num_10 != 0) {
				if ((num_1 % 3) == 0 && num_1 != 0)
					System.out.println(num + "¹Ú¼öÂ¦Â¦");
				else
					System.out.println(num + "¹Ú¼öÂ¦");
			} else if ((num_1 % 3) == 0 && num_1 != 0)
				System.out.println(num + "¹Ú¼öÂ¦");
		}
		scanner.close();
	}

}
