package chap3_practice;

public class Prac3_2 {

	public static void main(String[] args) {
		int n[][] = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		
		for(int i[] : n) {
			for(int k : i)
				System.out.print(k + " ");
			System.out.println();
		}
	}
}
