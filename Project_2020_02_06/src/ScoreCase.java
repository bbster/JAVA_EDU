import java.util.*;

public class ScoreCase {

	public static void main(String[] args) {
		System.out.printf("점수를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		char grade, plus;
		
		switch(score) {
		case 90:
			grade = 'A';
			break;
		case 80:
			grade = 'B';
			break;
		case 70:
			grade = 'C';
			break;
		default:
			grade = 'D';
			break;
		}
		System.out.println(grade);
		
	}
	

}
