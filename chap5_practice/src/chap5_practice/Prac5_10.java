package chap5_practice;

public class Prac5_10 {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태","자바");
		dic.put("이재문","파이썬");
		dic.put("이재문","C++");
		dic.put("이재1","C+");
		dic.put("이재2","C+++");

		System.out.println("이재문의 값은 "+dic.get("이재문"));
		System.out.println("황기태의 값은 "+dic.get("황기태"));
		System.out.println("이재1의 값은 "+dic.get("이재1"));
		System.out.println("이재2의 값은 "+dic.get("이재2"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 "+dic.get("황기태"));
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
		return key + "값이 존재하지 않습니다\n";
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
