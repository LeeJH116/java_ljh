package chap5_practice;

public class Prac5_5 {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		String str = cp.toString();
		System.out.println(str + "입니다");
		cp.setXY(10, 20);
		cp.setColor("RED");
		str = cp.toString();
		System.out.println(str + "입니다");

	}

}

class Point {
	private int x = 0, y = 0;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint extends Point {
	private String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	void setXY(int x, int y) {
		move(x, y);
	}

	void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return color + "색의 (" + getX() + "," + getY() + ")의 점";
	}
}