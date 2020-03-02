package assignment_2020_0304;

import java.sql.*;
import java.util.*;

class DB_RUN {
	static Scanner scan = new Scanner(System.in);
	static Connection con;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String username = "c##madang";
	String password = "madang";

	public void bookList() {
		con = null;
		pstmt = null;
		String query = "SELECT * FROM BOOK";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			System.out.print("\t도서번호 \t\t제목 \t출판사 \t가격 \n");
			while (rs.next()) {
				System.out.print("\t" + rs.getInt(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t\t" + rs.getString(3));
				System.out.println("\t" + rs.getInt(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException se) {
			}
		}
	}

	public void bookAdd() {
		con = null;
		pstmt = null;
		String query = "INSERT INTO BOOK(BOOKID,BOOKNAME,PUBLISHER,PRICE) VALUES(?, ?, ?, ?)";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			pstmt = con.prepareStatement(query);

			System.out.print("BOOKID 입력: ");
			int bookid = scan.nextInt();

			System.out.print("BOOKNAME 입력: ");
			String bookname = scan.next();

			System.out.print("PUBLISHER 입력: ");
			String publisher = scan.next();

			System.out.print("PRICE 입력: ");
			int price = scan.nextInt();

			pstmt.setInt(1, bookid);
			pstmt.setString(2, bookname);
			pstmt.setString(3, publisher);
			pstmt.setInt(4, price);
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException se) {
			}

		}
	}

	public void bookDelete() {
		String query = "DELETE FROM BOOK WHERE BOOKID = ?";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			pstmt = con.prepareStatement(query);

			System.out.print("삭제할 책의 도서ID 입력: ");
			int bookid = scan.nextInt();

			pstmt.setInt(1, bookid);

			pstmt.executeUpdate();
			System.out.println(bookid + "번 도서가 삭제되었습니다");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException se) {
			}

		}
	}

	public void bookCount() {
		String query = "SELECT COUNT(*) FROM BOOK";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			int rowcolumn = 0;

			if (rs.next()) {
				rowcolumn = rs.getInt(1);
			}
			System.out.println("Total book count: 총" + rowcolumn + "권");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException se) {
			}

		}
	}

	public void customerList() {
		con = null;
		pstmt = null;
		String query = "SELECT * FROM customer";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			System.out.print("\t고객번호 \t이름 \t주소 \t전화번호 \n");
			while (rs.next()) {
				System.out.print("\t" + rs.getInt(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t" + rs.getString(3));
				System.out.println("\t" + rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException se) {
			}
		}
	}
	
	public void customerAdd() {
		con = null;
		pstmt = null;
		String query = "INSERT INTO CUSTOMER(CUSTID, NAME, ADDRESS, PHONE) VALUES(?, ?, ?, ?)";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			pstmt = con.prepareStatement(query);

			System.out.print("CUSTID 입력: ");
			int custid = scan.nextInt();
			scan.nextLine();

			System.out.print("NAME 입력: ");
			String name = scan.nextLine();

			System.out.print("ADDRESS 입력: ");
			String address = scan.nextLine();

			System.out.print("PHONE 입력: ");
			String phone = scan.nextLine();

			pstmt.setInt(1, custid);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			pstmt.setString(4, phone);
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException se) {
			}

		}
	}



	public void customerUpdate() {
		con = null;
		pstmt = null;
		String query = "SELECT * FROM CUSTOMER WHERE CUSTID=?";
		String query2 = "UPDATE CUSTOMER SET NAME=?, ADDRESS=?, PHONE=? WHERE CUSTID=?";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			pstmt = con.prepareStatement(query);
			
			System.out.print("수정할 고객 ID 입력: ");
			int custid = scan.nextInt();

			pstmt.setInt(1, custid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.print("\t" + rs.getInt(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t" + rs.getString(3));
				System.out.println("\t" + rs.getString(4));
			}

			pstmt = con.prepareStatement(query2);
			scan.nextLine();

			System.out.print("NAME 입력: ");
			String name = scan.nextLine();

			System.out.print("ADDRESS 입력: ");
			String address = scan.nextLine();

			System.out.print("PHONE 입력: ");
			String phone = scan.nextLine();

			pstmt.setString(1, name);
			pstmt.setString(2, address);
			pstmt.setString(3, phone);
			pstmt.setInt(4, custid);
			pstmt.executeUpdate();
		} catch (

		Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException se) {
			}
		}
	}
	
	public void customerDelete() {
		String query = "DELETE FROM CUSTOMER WHERE CUSTID = ?";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			pstmt = con.prepareStatement(query);

			System.out.print("삭제할 고객 ID 입력: ");
			int custid = scan.nextInt();

			pstmt.setInt(1, custid);

			pstmt.executeUpdate();
			System.out.println(custid + "번 고객ㅇ 삭제되었습니다");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException se) {
			}

		}
	}
}