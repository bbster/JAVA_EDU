import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		System.out.printf("점수를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		char grade, plus;
		
		if(score >= 95) {
			grade = 'A';
			plus = '+';
			System.out.printf("점수:%d, 학점:%s%s %n",score, grade, plus);
		}
		else if(score >= 90) {
			grade = 'A';
			plus = '0';
			System.out.printf("점수:%d, 학점:%s%s %n",score, grade, plus);
		}
		else if(score >= 85) {
			grade = 'B';
			plus = '+';
			System.out.printf("점수:%d, 학점:%s%s %n",score, grade, plus);
		}
		else if(score >= 80) {
			grade = 'B';
			plus = '0';
			System.out.printf("점수:%d, 학점:%s%s %n",score, grade, plus);
		}
		else if(score >= 75) {
			grade = 'C';
			plus = '+';
			System.out.printf("점수:%d, 학점:%s%s %n",score, grade, plus);
		}
		else if(score >= 70) {
			grade = 'C';
			plus = '0';
			System.out.printf("점수:%d, 학점:%s%s %n",score, grade, plus);
		}
		else {
				grade = 'F';
				plus = '0';
				System.out.printf("점수:%d, 학점:%s%s %n",score, grade, plus);			
		}
		
	}
}
