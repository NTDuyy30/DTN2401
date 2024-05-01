package backend;

import java.sql.SQLException;

public class DatabaseConnection {
	public static void main (String[] args) throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/work_project";
		String dbUser = "root";
		String dbPass = "123456";
		String condition = "1 or 1 = 1";
		Connection connecttion = DriverManager.getConnection (dbUrl, dbUser, dbPass);
		if (connecttion != null) {
			System. out.println ("Connection OK") ;
			Statement state = connecttion. createStatement ();
			ResultSet rs = state.executeQuery("select employee_id, name, description from
			int i =1;
			while (rs.next ()) {
				System.out.println (" ------ Project thu: "+i);
				System.out.println ("employee_id:" + rs.getInt ("employee_id") );
				System.out.println ("name:" + rs.getString ("name") );
				System.out.println ("description:" + rs.getString ("description") );
				System.out.println (" ------ End");
				i++;
			}
		}
	}
}
