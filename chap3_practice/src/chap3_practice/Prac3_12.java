package chap3_practice;

public class Prac3_12 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("명령행 인자가 업습니다.");
			return;
		}
		int sum = 0;
		int i = 0;
		while (true) {
			if (i == args.length)
				break;
			try {
				for (; i < args.length; i++) {
					sum = sum + Integer.parseInt(args[i]);
				}
			}
			catch (NumberFormatException e) {
				i++;
			}
		}

		System.out.println(sum);

	}

}
