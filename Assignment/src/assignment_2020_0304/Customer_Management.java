package assignment_2020_0304;

import java.sql.SQLException;
import java.util.Scanner;

public class Customer_Management {
	
	DB_RUN sql_run = new DB_RUN();
	int choose;

	public void CustomerManagement() throws SQLException {

		while (true) {
			System.out.println("작업할 번호를 입력 해주세요.");
			System.out.println("1. 고객 목록");
			System.out.println("2. 고객 추가");
			System.out.println("3. 고객 정보 수정");
			System.out.println("4. 고객 삭제");
			System.out.println("5. 고객 포인트 조회(미구현)");
			System.out.println("0. 뒤 로");
			Scanner scan = new Scanner(System.in);
			choose = scan.nextInt();
			scan.nextLine();

			switch (choose) {
			case 1:
				sql_run.customerList();
				break;
			case 2:
				sql_run.customerAdd();
				break;
			case 3:
				sql_run.customerUpdate();
				break;
			case 4:
				sql_run.customerDelete();
				break;
			case 5:
				sql_run.customerPoint();
				break;
			case 0:
				return;

			}
		}
	}

}
