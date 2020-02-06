import java.util.*;

public class Score {

	public static void main(String[] args) {
		System.out.println("점수를 입력해 주세요");
		
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		int sum=0;
		char grade;
		
//		if(score>0) {
//			System.out.printf("양수");
//		}
//		else if(score<0) {
//			System.out.printf("음수");
//		}
//		
//		else {
//			System.out.printf("0입니다.");
//		}
		
//		if(score>=90) {
//			System.out.printf("A등급");
//			grade = 'A';
//		}
//		else if(score>=80 && score<=89) {
//			System.out.printf("B등급");
//			grade = 'B';
//		}
//		else {
//			System.out.printf("C등급");
//			grade = 'C';
//		}
//		System.out.println(grade);	
		
		for(int i=0; i<=10; i++) {
			sum += i;
			System.out.println(sum);
		}
	}
}
