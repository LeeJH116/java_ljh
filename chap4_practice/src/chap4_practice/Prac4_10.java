package chap4_practice;
import java.util.Scanner;
public class Prac4_10 {
	public static void main(String[] args) {
		String word;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글 단어? ");
			word=scanner.next();
			if(word.equals("그만")) break;
			else if(Dictionary.kor2eng(word)==null) System.out.println(word+"은 저의 사전에 없습니다.");
			else System.out.println(word+"은 "+Dictionary.kor2eng(word));
		}
		scanner.close();
	}

}

class Dictionary {
	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };
	private static int index = -1;

	public static String kor2eng(String word) {
		index = -1;
		for (int i = 0; i < kor.length; i++) {
			if (kor[i].equals(word))
				index = i;
		}
		if (index >= 0)
			return eng[index];
		else
			return null;
	}
}
