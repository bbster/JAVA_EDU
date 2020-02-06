import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("숫자를 입력하세요");
		
		int score = scanner.nextInt();
		int sum=1;
		for(int i=2; i<=score; i++) {
			for(int j=1; j<=9; j++) {
//				System.out.println(i + "*" + j + "=" + i*j);
				System.out.printf("%d*%d=%d \n", i,j, i*j);
			}
		}

	}

}
