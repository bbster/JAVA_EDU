package assignment_2020_0304;

import java.sql.SQLException;
import java.util.Scanner;

public class Madang_Bookstore {

	public static void main(String args[]) throws SQLException {
		DB_RUN con_db = new DB_RUN();
		Book_Management book_m = new Book_Management();
		Customer_Management customer_m = new Customer_Management();
//		Sales_Management sales_m = new Sales_Management();
		int choose;
		Scanner scan = new Scanner(System.in);
		loop:
		while (true) {
			System.out.println("작업할 번호를 입력 해주세요.");
			System.out.println("1. 도서 관리");
			System.out.println("2. 고객 관리");
			System.out.println("3. 판매 관리");
			System.out.println("0. 종 료");
			choose = scan.nextInt();

			switch (choose) {
			case 1:
				book_m.BookManagement();
				break;
			case 2:
				customer_m.CustomerManagement();
				break;
			case 3:
//				sales_m.sales_system();
				break;

			case 0:
				try {
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					con_db.con.close();
				}
				System.out.println("종료 되었습니다.");
				System.exit(1);
			}
		}
	}
}