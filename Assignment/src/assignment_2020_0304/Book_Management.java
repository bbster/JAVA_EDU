package assignment_2020_0304;
import java.sql.SQLException;
import java.util.*;

public class Book_Management {
	DB_RUN sql_run = new DB_RUN();
	int choose;

	public void BookManagement() throws SQLException {

		while (true) {
			System.out.println("�۾��� ��ȣ�� �Է� ���ּ���.");
			System.out.println("1. ���� ���");
			System.out.println("2. ���� ���");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� ���");
			System.out.println("0. �� ��");
			Scanner scan = new Scanner(System.in);
			choose = scan.nextInt();
			scan.nextLine();

			switch (choose) {
			case 1:
				sql_run.bookList();
				break;
			case 2:
				sql_run.bookAdd();
				break;
			case 3:
				sql_run.bookDelete();
				break;
			case 4:
				sql_run.bookCount();
				break;
			case 0:
				return;
			}
		}
	}
}