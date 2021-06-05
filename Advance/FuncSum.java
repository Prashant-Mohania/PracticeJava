import java.sql.*;

class FuncSum {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "IamPramo");
            CallableStatement stmt = con.prepareCall("{?= call getSum(?,?)}");

            stmt.setInt(2, 10);
            stmt.setInt(3, 20);

            stmt.registerOutParameter(1, Types.INTEGER);
            stmt.execute();

            System.out.println(stmt.getInt(1));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
