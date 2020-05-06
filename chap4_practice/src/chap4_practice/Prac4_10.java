package chap4_practice;
import java.util.Scanner;
public class Prac4_10 {
	public static void main(String[] args) {
		String word;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {
			System.out.print("�ѱ� �ܾ�? ");
			word=scanner.next();
			if(word.equals("�׸�")) break;
			else if(Dictionary.kor2eng(word)==null) System.out.println(word+"�� ���� ������ �����ϴ�.");
			else System.out.println(word+"�� "+Dictionary.kor2eng(word));
		}
		scanner.close();
	}

}

class Dictionary {
	private static String[] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
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
