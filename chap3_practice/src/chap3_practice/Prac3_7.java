package chap3_practice;

public class Prac3_7 {

	public static void main(String[] args) {
	
		int n[] = new int[10];
		
		for(int i=0;i<10;i++) {
			n[i]=(int)(Math.random()*10+1);
		}
		int sum=0;
		for(int k : n) {System.out.print(k+" ");sum+=k;}
		System.out.println("\nÆò±ÕÀº "+ (double)sum/10);
		
	}

}
