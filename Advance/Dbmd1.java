import java.sql.*;

class dbmd1 {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "IamPramo");
            DatabaseMetaData dbmd = con.getMetaData();

            System.out.println("Driver Name :- " + dbmd.getDriverName());
            System.out.println("Driver Version :- " + dbmd.getDriverVersion());
            System.out.println("User Name :- " + dbmd.getUserName());
            System.out.println("Product Name :- " + dbmd.getDatabaseProductName());
            System.out.println("Product Version :- " + dbmd.getDatabaseProductVersion());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
