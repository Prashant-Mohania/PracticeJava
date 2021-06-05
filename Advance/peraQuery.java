import java.sql.*;
import javax.swing.*;

class peraQuery {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "IamPramo");
        PreparedStatement stmt = con.prepareStatement("select * from Emp where empId = ?");
        String id = JOptionPane.showInputDialog("Please Enter Emp Id");
        stmt.setString(1, id);
        ResultSet resultSet = stmt.executeQuery();
        if (resultSet.next()) {
            JOptionPane.showMessageDialog(null, "Valid Employee");
        } else {
            JOptionPane.showMessageDialog(null, "InValid Employee");
        }
    }
}
