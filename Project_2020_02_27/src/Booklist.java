import java.sql.*;
public class Booklist {
	String driver = "org.mariadb.jdbc.Driver";
	Connection con = null;
	
	public void DBcon() {
		String url = "jdbc:mariadb://localhost:3306/mysql";
		String user= "bbster";
		String password= "dlwlehd12";
		try {
			Class.forName(driver);
		}catch(ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		}
		try {
	
			con = DriverManager.getConnection(url, user, password);
			if (con != null) {
				System.out.println("DB���� ����");
			}
		}catch(Exception e) {
			System.out.println("DB���� ����");
			e.printStackTrace();
		}
		finally {
			if(con != null)
				try {
					con.close();
					System.out.println("DB�� �� �ݾҽ��ϴ�.");
				}catch(Exception cone){}
		}
	}
	
	private void sqlRun() {
		String query = "SELECT * FROM Book";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			System.out.println("Book NO:\tBook Name:\t\tPublisher\tprice");
			
			while(rs.next()) {
				System.out.println("\t+rsgetInt(1)");
			}
		}catch(SQLException e){}
	}
	

	public static void main(String[] args) {
		Booklist dbcon = new Booklist();
//		dbcon.sqlRun();
		dbcon.DBcon();
		// TODO Auto-generated method stub

	}

}
