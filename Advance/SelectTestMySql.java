import java.sql.*;

class SelectTestMySql {
    public static void main(String args[]) {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            /*
             * Connection con=DriverManager.getConnection(
             * "jdbc:mysql://localhost:3306/College","root","mysql");
             */

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College?useSSL=false", "root",
                    "mysql");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
            while (rs.next()) {
                System.out.println(
                        rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getInt(4));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
