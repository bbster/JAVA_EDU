import java.util.*;

public class Score {

	public static void main(String[] args) {
		System.out.println("������ �Է��� �ּ���");
		
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if(score>0) {
			System.out.printf("���");
		}
		else if(score<0) {
			System.out.printf("����");
		}
		
		else {
			System.out.printf("0�Դϴ�.");
		}
	}
}
