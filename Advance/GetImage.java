import java.sql.*;
import java.io.*;

class GetImage {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "IamPramo");
            PreparedStatement stmt = con.prepareStatement("Select * from imageTable");

            ResultSet rs = stmt.executeQuery();
            rs.next();
            Blob b = rs.getBlob(2);
            byte[] barr = new byte[(int) b.length()];

            barr = b.getBytes(1, (int) b.length());

            FileOutputStream fout = new FileOutputStream("e:\\download.jpg");
            fout.write(barr);
            fout.close();
            System.out.println("OKK");
            con.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
