import java.sql.*;

class Dbmd2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Connection con =
            // DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
            // "IamPramo");

            // for MySQL db
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College?useSSL=false", "root",
                    "mysql");

            DatabaseMetaData dbmd = con.getMetaData();

            String[] table = { "TABLE" };

            ResultSet rs = dbmd.getTables(null, "SYSTEM", "E%", table);

            while (rs.next()) {
                System.out.println(rs.getString(3));
            }
            con.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
