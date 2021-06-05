import java.sql.*;

class RsMetaData {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "IamPramo");
            Statement stmt = con.createStatement();
            String query = "Select * from " + args[0];

            ResultSet rset = stmt.executeQuery(query);
            System.out.println("Following records are selected");
            ResultSetMetaData rsmd = rset.getMetaData();
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.print(rsmd.getColumnName(i) + "\t");
            }
            while (rset.next()) {
                System.out.println();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    System.out.print(rset.getString(i) + "\t");
                }
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
