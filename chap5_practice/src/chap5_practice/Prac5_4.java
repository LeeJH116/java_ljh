package chap5_practice;

public class Prac5_4 {

	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}

}

class Km2Mile extends Converter{
	protected double convert(double src) {
		return src/ratio;
	}
	protected String getSrcString() {
		return "Km";
	}
	protected String getDestString() {
		return "Mile";
	}
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}
}