import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("숫자를 입력하세요");
		
		int score = scanner.nextInt();
		
		int i=2, j;
		
		while(i<=9) {
			j=1;
			while(j<=9) {
				System.out.printf("%d*%d=%d \n", i,j, i*j);
				j++;
			}
			i++;	
		}		
		System.out.println("While문 종료");
	}
}
	