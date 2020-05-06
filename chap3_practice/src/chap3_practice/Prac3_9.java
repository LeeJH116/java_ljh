package chap3_practice;

public class Prac3_9 {

	public static void main(String[] args) {
		int n[][] = new int[4][4];
		
		for(int i = 0; i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				n[i][j]=(int)(Math.random()*10+1);
			}
		}
		
		for(int r[]: n) {
			for(int c : r)
				System.out.print(c + " ");
			System.out.println();
		}
	}

}
