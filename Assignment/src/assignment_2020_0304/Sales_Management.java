package assignment_2020_0304;

import java.sql.SQLException;
import java.util.Scanner;

public class Sales_Management {
	DB_RUN sql_run = new DB_RUN();
	int choose;

	public void SalesManagement() throws SQLException {

		while (true) {
			System.out.println("작업할 번호를 입력 해주세요.");
			System.out.println("1. 도서 고객별  판매금액 조회");
			System.out.println("2. 도서 고객별  판매금액 조회");
			System.out.println("3. 도서 도서별 판매금액 조회");
			System.out.println("0. 뒤 로");
			Scanner scan = new Scanner(System.in);
			choose = scan.nextInt();
			scan.nextLine();

			switch (choose) {
			case 1:
				
				sql_run.salesCustomer();
				break;
			case 2:
				sql_run.salesPublisher();
				break;
			case 3:
				sql_run.salesBybook();
				break;
			case 0:
				return;

			}
		}
	}

}
