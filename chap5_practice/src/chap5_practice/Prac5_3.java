package chap5_practice;
import java.util.Scanner;
public class Prac5_3 {

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();

	}

}

abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+"�� "+getDestString()+"�� �ٲߴϴ�.");
		System.out.print(getSrcString()+"�� �Է��ϼ���>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ���: "+res+getDestString()+"�Դϴ�");
		scanner.close();
	}
}

class Won2Dollar extends Converter{
	protected double convert(double src) {
		return src/ratio;
	}
	protected String getSrcString() {
		return "��";
	}
	protected String getDestString() {
		return "�޷�";
	}
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}
}