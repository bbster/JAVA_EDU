package assignment_2020_0304;

import java.sql.SQLException;
import java.util.Scanner;

public class Sales_Management {
	DB_RUN sql_run = new DB_RUN();
	int choose;

	public void SalesManagement() throws SQLException {

		while (true) {
			System.out.println("작업할 번호를 입력 해주세요.");
			System.out.println("1. 도서 판매 목록");
			System.out.println("2. 도서 고객별  판매금액 조회");
			System.out.println("3. 도서 출판사별 판매금액 조회");
			System.out.println("0. 뒤 로");
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
