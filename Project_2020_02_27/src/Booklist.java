import java.sql.*;

public class Booklist {
	String driver = "org.mariadb.jdbc.Driver";
	Connection con = null;
	Statement stmt = null;

	public void DBcon() {
		String url = "jdbc:mariadb://localhost:3306/travelers_db";
		String user = "bbster";
		String password = "dlwlehd12";

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		}
		try {

			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();
			if (con != null) {
				System.out.println("DB���� ����");
			}
		} catch (Exception e) {
			System.out.println("DB���� ����");
			e.printStackTrace();
		}
		try {

			String sql = "SELECT * FROM users_user;";
			ResultSet rs = stmt.executeQuery(sql);

			System.out.println("id\t username\t password\t");

			while (rs.next()) {
				System.out
						.println(rs.getInt(1) + "\t  " + rs.getString("username") + "\t\t" + rs.getString("password"));
			}
		} catch (SQLException e) {
		}

		finally {
			if (con != null)
				try {
					con.close();
					System.out.println("DB�� �� �ݾҽ��ϴ�.");
				} catch (Exception cone) {
				}
		}
	}

	public static void main(String[] args) {
		Booklist dbcon = new Booklist();
		dbcon.DBcon();
	}
}
