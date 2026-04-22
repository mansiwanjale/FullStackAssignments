import java.sql.*;
public class ConnectionTest {
	

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student",
					"root","mansi");
			if(con!=null) {
				System.out.println("SUCCESSFULLY CONNECTED");
			}
			
//			String query="Select * from student";
//			PreparedStatement ps=con.prepareStatement(query);
//			
//			ResultSet rs=ps.executeQuery();
			
//			if(rs.next()) {
//				System.out.println("Student List");
//				System.out.println(rs.getString("roll_no"));
//				System.out.println(rs.getString("name"));
//				System.out.println(rs.getString("department"));
//				System.out.println(rs.getString("marks"));
//			}
		}
		catch(Exception e){
			System.out.println("Connection Failed");
			e.printStackTrace();
		}

	}

}
