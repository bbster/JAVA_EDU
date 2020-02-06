import java.util.*;

public class Score {

	public static void main(String[] args) {
		System.out.println("점수를 입력해 주세요");
		
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if(score>0) {
			System.out.printf("양수");
		}
		else if(score<0) {
			System.out.printf("음수");
		}
		
		else {
			System.out.printf("0입니다.");
		}
	}
}
