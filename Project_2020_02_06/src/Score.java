import java.util.*;

public class Score {

	public static void main(String[] args) {
		System.out.println("������ �Է��� �ּ���");
		
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		int sum=0;
		char grade;
		
//		if(score>0) {
//			System.out.printf("���");
//		}
//		else if(score<0) {
//			System.out.printf("����");
//		}
//		
//		else {
//			System.out.printf("0�Դϴ�.");
//		}
		
//		if(score>=90) {
//			System.out.printf("A���");
//			grade = 'A';
//		}
//		else if(score>=80 && score<=89) {
//			System.out.printf("B���");
//			grade = 'B';
//		}
//		else {
//			System.out.printf("C���");
//			grade = 'C';
//		}
//		System.out.println(grade);	
		
		for(int i=0; i<=10; i++) {
			sum += i;
			System.out.println(sum);
		}
	}
}
