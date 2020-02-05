import java.util.*;

public class InputTest {

	public static void main(String[] args) {
		System.out.printf("원하는 숫자를 입력하세요. \n");
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.printf("입력하신 숫자는 : %d", num);

	}

}
