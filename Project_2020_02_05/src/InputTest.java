import java.util.*;

public class InputTest {

	public static void main(String[] args) {
		System.out.printf("생년원일 입력. \n");
		
		Scanner scanner = new Scanner(System.in);
		String num = scanner.nextLine();
		System.out.printf("생년월일은 : %s", num);
		scanner.close();
	}
}