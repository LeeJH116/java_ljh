package chap3_practice;

public class Prac3_10 {

	public static void main(String[] args) {
		int n[][] = new int[4][4];

		int count = 0;

		while (count < 10) {
			int i = (int) (Math.random() * 4);
			int j = (int) (Math.random() * 4);

			if (n[i][j] == 0) {
				n[i][j] = (int) (Math.random() * 10 + 1);
				count++;
			}
		}

		for (int r[] : n) {
			for (int c : r)
				System.out.print(c + " ");
			System.out.println();
		}
	}

}
