import java.sql.*;
import java.util.Scanner;

class InsertTestMysql {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College?useSSL=false", "root",
                    "mysql");
            PreparedStatement stmt = con.prepareStatement("insert into Emp values(?,?,?,?)");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Employee Id");
            String id = sc.next();

            System.out.println("Enter Employee name");
            String n = sc.next();

            System.out.println("Enter Employee job");
            String job = sc.next();

            System.out.println("Enter Employee Salary");
            int s = sc.nextInt();

            stmt.setString(1, id);
            stmt.setString(2, n);
            stmt.setString(3, job);
            stmt.setInt(4, s);
            stmt.executeUpdate();

            con.close();

            sc.close();

            System.out.println("Record is successfully updated");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
