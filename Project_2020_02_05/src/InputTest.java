import java.util.*;

public class InputTest {

	public static void main(String[] args) {
		System.out.printf("������� �Է�. \n");
		
		Scanner scanner = new Scanner(System.in);
		String num = scanner.nextLine();
		System.out.printf("��������� : %s", num);
		scanner.close();
	}
}