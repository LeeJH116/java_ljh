package chap5_practice;

import java.util.Scanner;

public class Prac5_12 {

	public static void main(String[] args) {
		GraphicEditor GE = new GraphicEditor();
		GE.run();
	}

}

abstract class Shape {
	private Shape next;

	public Shape() {
		next = null;
	}

	public void setNext(Shape obj) {
		next = obj;
	}

	public Shape getNext() {
		return next;
	}

	public abstract void draw();
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

class GraphicEditor {
	Scanner scanner = new Scanner(System.in);
	Shape start, end;

	public GraphicEditor() {
		start = null;
		end = null;
	}

	void run() {
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		while (true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				insert();
				continue;
			case 2:
				delete();
				break;
			case 3:
				view();
				break;
			case 4:
				System.out.println("beauty을 종료합니다.");
				return;
			default:
				System.out.println("없는 메뉴 입니다.");
				break;
			}

		}
	}

	void insert() {
		System.out.print("Line(1), Rect(2), Circle(3)>> ");
		int num = scanner.nextInt();
		Shape s;
		switch (num) {
		case 1:
			s = new Line();
			break;
		case 2:
			s = new Rect();
			break;
		case 3:
			s = new Circle();
			break;
		default:
			System.out.println("없는 메뉴 입니다.");
			return;
		}
		if (start == null) {
			start = s;
			end = s;
		} else {
			end.setNext(s);
			end = s;
		}
	}

	void delete() {
		System.out.print("삭제할 도형의 위치>> ");
		int num = scanner.nextInt();
		Shape previous = start, target = start;
		try {
			if (num == 1) {
				if (start == end) {
					start = null;
					end = null;
				} else
					start = start.getNext();
			}

			for (int i = 1; i < num; i++) {
				previous = target;
				target = target.getNext();
				if (target == null) {
					end = previous;
					System.out.println("삭제할 수 없습니다.");
					return;
				}
			}

			if (target.getNext() == null) {
				end = previous;
			} else {
				previous.setNext(target.getNext());
			}
		} catch (NullPointerException e) {
			System.out.println("삭제할 수 없습니다.");
		}
	}

	void view() {
		Shape s = start;
		while (s != null) {
			s.draw();
			s = s.getNext();
		}
	}
}