package model;

import java.sql.*;

public class StudentDAO {

    // 🔹 1. FETCH STUDENT DETAILS
    public static StudentBean getStudent(int rollNo) {

        StudentBean sb = new StudentBean();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student",
                "root",
                "mansi"
            );

            String query = "SELECT * FROM student WHERE roll_no=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, rollNo);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                sb.setRoll(rs.getInt("roll_no"));
                sb.setName(rs.getString("name"));
                sb.setDept(rs.getString("department"));
                sb.setMarks(rs.getInt("marks"));
                sb.setPercentage(rs.getDouble("percentage"));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return sb;
    }

    // 🔹 2. UPDATE MARKS + PERCENTAGE
    public static void updateStudent(StudentBean sb) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student",
                "root",
                "mansi"
            );

            String query = "UPDATE student SET marks=?, percentage=? WHERE roll_no=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, sb.getMarks());
            ps.setDouble(2, sb.getPercentage());
            ps.setInt(3, sb.getRoll());

            ps.executeUpdate();

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}