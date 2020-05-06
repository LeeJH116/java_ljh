package chap5_practice;

public class Prac5_2 {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}

}

class IPTV extends ColorTV {
	private String address;

	public IPTV(String address, int size, int color) {
		super(size, color);
		this.address = address;
	}

	void printProperty() {
		System.out.print("���� IPTV�� " + address + " �ּ��� ");
		super.printProperty();
	}
}