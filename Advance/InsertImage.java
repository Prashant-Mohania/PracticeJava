import java.sql.*;
import java.io.*;

class InsertImage {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "IamPramo");

            PreparedStatement stmt = con.prepareStatement("insert into imageTable values(?,?)");
            FileInputStream fin = new FileInputStream("E:\\PRAMO_CD\\download.jpg");
            stmt.setString(1, "I Hate My Life");
            stmt.setBinaryStream(2, fin, fin.available());
            int i = stmt.executeUpdate();
            System.out.println(i + " record affected");
            con.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
