package chap4_practice;

public class Prac4_3 {

	public static void main(String[] args) {
		Song s1 = new Song("Dancing Queen","ABAA",1978,"������");
		s1.show();
	}

}

class Song{
	String title, artist,country;
	int year;
	public Song() {}
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	void show() {
		System.out.print(year+"�� "+country+"������ "+artist+"�� �θ� "+title);
	}
}