package chap5_practice;

public class Prac5_10 {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����","�ڹ�");
		dic.put("���繮","���̽�");
		dic.put("���繮","C++");
		dic.put("����1","C+");
		dic.put("����2","C+++");

		System.out.println("���繮�� ���� "+dic.get("���繮"));
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
		System.out.println("����1�� ���� "+dic.get("����1"));
		System.out.println("����2�� ���� "+dic.get("����2"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
		System.out.println(dic.length());

	}

}

abstract class PairMap {
	protected String keyArray[];
	protected String valueArray[];

	abstract String get(String key);

	abstract void put(String key, String value);

	abstract String delete(String key);

	abstract int length();
}

class Dictionary extends PairMap {
	private boolean checkEqual;

	public Dictionary(int n) {
		keyArray = new String[n];
		valueArray = new String[n];
	}

	@Override
	public String get(String key) {
		int index = -1;
		for (int i = 0; i < keyArray.length; i++) {
			if (keyArray[i] != null && keyArray[i].equals(key))
				index = i;
		}
		if (index < 0 || index > keyArray.length)
			return null;
		else
			return valueArray[index];
	}

	@Override
	public void put(String key, String value) {
		checkEqual = true;
		for (int i = 0; i < keyArray.length; i++) {
			if (keyArray[i] != null && keyArray[i].equals(key)) {
				valueArray[i] = value;
				checkEqual = false;
				break;
			}
		}
		if (checkEqual) {
			for (int i = 0; i < keyArray.length; i++) {
				if (keyArray[i] == null) {
					keyArray[i] = key;
					valueArray[i] = value;
					break;
				}
			}
		}
	}

	@Override
	public String delete(String key) {
		for (int i = 0; i < keyArray.length; i++) {
			if (keyArray[i].equals(key)) {
				valueArray[i] = null;
				keyArray[i] = null;
				return valueArray[i];
			}
		}
		return key + "���� �������� �ʽ��ϴ�\n";
	}

	@Override
	public int length() {
		int count = 0;
		for (int i = 0; i < keyArray.length; i++) {
			if (keyArray[i] != null) {
				count++;
			}
		}
		return count;
	}
}
