import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {
public static void main(String [] args) throws ClassNotFoundException, SQLException {
	//step 1: register the driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	// step 2: establish the connection
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newversion","root","root");
	
	System.out.println("Connection created");
	
	Statement st = con.createStatement();
	String sql = "insert into unisoft values(002, 'Jan', 'Karur', 6395834890, 639006, 21)";
	int result = st.executeUpdate(sql);
	con.close();
	System.out.println(result+"no of rows inserted...");
}
}
