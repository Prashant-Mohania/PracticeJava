import java.sql.*;
import java.io.*;

class SetFile {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "IamPramo");

            PreparedStatement stmt = con.prepareStatement("insert into fileTable values(?,?)");
            String f = "E:\\PRAMO_CD\\Practice C\\file.txt";
            FileReader r = new FileReader(f);
            stmt.setInt(1, 101);
            stmt.setCharacterStream(2, r, (int) f.length());

            int i = stmt.executeUpdate();
            System.out.println(i + " record affected");
            r.close();
            con.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
