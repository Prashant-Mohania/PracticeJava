import java.sql.*;

class SelectTest {

       public static void main(String args[]) {

              try {
                     // This is the type 4 driver
                     Class.forName("oracle.jdbc.driver.OracleDriver");
                     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
                                   "IamPramo");
                     Statement stmt = con.createStatement(); // 3
                     ResultSet rs = stmt.executeQuery("select * from Emp"); // 4
                     System.out.println("Details of the Employee are as follows");
                     while (rs.next()) {
                            System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
                                          + rs.getInt(4));
                     }
                     con.close(); // 5
              } catch (Exception e) {
                     System.out.println(e);
              }
       }
}