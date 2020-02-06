
public class Array {

	public static void main(String[] args) {
		int[] score = new int[6];
		int[] test = new int[]{100,90,80,70,60}; 
		
		score[0]=100;
		score[1]=200;
		score[2]=300;
		score[4]=400;
		score[5]=500;
		
		for(int i=0; i<5; i++) 
			System.out.println(score[i]);
		for(int i=0; i<test.length; i++)
			System.out.println(test[i]);
	}
}
