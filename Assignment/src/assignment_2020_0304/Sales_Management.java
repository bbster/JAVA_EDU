package assignment_2020_0304;

import java.sql.SQLException;
import java.util.Scanner;

public class Sales_Management {
	DB_RUN sql_run = new DB_RUN();
	int choose;

	public void SalesManagement() throws SQLException {

		while (true) {
			System.out.println("�۾��� ��ȣ�� �Է� ���ּ���.");
			System.out.println("1. ���� �Ǹ� ���");
			System.out.println("2. ���� ����  �Ǹűݾ� ��ȸ");
			System.out.println("3. ���� ���ǻ纰 �Ǹűݾ� ��ȸ");
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
				sql_run.bookCount();
				break;
			case 0:
				return;

			}
		}
	}

}
