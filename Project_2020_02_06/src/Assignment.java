import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		System.out.printf("������ �Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		char grade, plus;
		
		if(score >= 95) {
			grade = 'A';
			plus = '+';
			System.out.printf("����:%d, ����:%s%s %n",score, grade, plus);
		}
		else if(score >= 90) {
			grade = 'A';
			plus = '0';
			System.out.printf("����:%d, ����:%s%s %n",score, grade, plus);
		}
		else if(score >= 85) {
			grade = 'B';
			plus = '+';
			System.out.printf("����:%d, ����:%s%s %n",score, grade, plus);
		}
		else if(score >= 80) {
			grade = 'B';
			plus = '0';
			System.out.printf("����:%d, ����:%s%s %n",score, grade, plus);
		}
		else if(score >= 75) {
			grade = 'C';
			plus = '+';
			System.out.printf("����:%d, ����:%s%s %n",score, grade, plus);
		}
		else if(score >= 70) {
			grade = 'C';
			plus = '0';
			System.out.printf("����:%d, ����:%s%s %n",score, grade, plus);
		}
		else {
				grade = 'F';
				plus = '0';
				System.out.printf("����:%d, ����:%s%s %n",score, grade, plus);			
		}
		
	}
}
