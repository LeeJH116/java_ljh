package chap5_practice;

public class Prac5_13 {

	public static void main(String[] args) {
		Shape2 dounut = new Circle2(10);
		dounut.redraw();
		System.out.println("������ "+dounut.getArea());
	}

}

interface Shape2 {
	final double PI = 3.14;

	void draw();

	double getArea();

	default public void redraw() {
		System.out.print("--- �ٽ� �׸��ϴ�. ");
		draw();
	}
}

class Circle2 implements Shape2 {
	private int radius;

	@Override
	public void draw() {
		System.out.println("�������� " + radius + "�� ���Դϴ�.");
	}

	@Override
	public double getArea() {
		return radius * radius * PI;
	}

	Circle2(int radius) {
		this.radius = radius;
	}
}