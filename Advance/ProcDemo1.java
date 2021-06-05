import java.sql.*;

class ProcDemo1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "IamPramo");

        CallableStatement stmt = con.prepareCall("{call ProcEmp(?, ?, ?, ?)}");

        stmt.setString(1, "X001");
        stmt.setString(2, "Heema Malini");
        stmt.setString(3, "Leader");
        stmt.setInt(4, 1000);
        stmt.execute();

    }
}

// 9410255010 chaman