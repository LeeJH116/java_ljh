package chap5_practice;

public class Prac5_14 {

	public static void main(String[] args) {
		Shape2[] list = new Shape2[3];
		list[0] = new Circle2(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect2(10, 40);

		for (int i = 0; i < list.length; i++)
			list[i].redraw();
		for (int i = 0; i < list.length; i++)
			System.out.println("면적은 " + list[i].getArea());

	}

}

class Oval implements Shape2 {
	private int width, height;

	public Oval(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(width + "x" + height + "에 내접하는 타원입니다.");
	}

	@Override
	public double getArea() {
		return width * height * PI / 4;
	}
}

class Rect2 implements Shape2 {
	private int width, height;

	public Rect2(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(width + "x" + height + "크기의 사각형 입니다.");
	}

	@Override
	public double getArea() {
		return width * height;
	}

	public void show() {
		System.out.println("show");
	}
}