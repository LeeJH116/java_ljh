package chap4_practice;

import java.util.Scanner;

public class Prac4_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle1 c[] = new Circle1[3];
		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >> ");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle1(x, y, radius);
		}
		for (int i = 0; i < c.length; i++)
			c[i].show();
		Circle1 bigger = null;
		for (int i = 0; i < (c.length - 1); i++)
			bigger = c[i].large(c[i + 1]);
		System.out.print("가장 면적이 큰 원은 ");
		bigger.show();
		scanner.close();

	}

}

class Circle1 {
	private double x, y;
	private int radius;

	public Circle1(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}

	public Circle1 large(Circle1 r) {
		if (this.radius > r.radius)
			return this;
		else
			return r;
	}
}
