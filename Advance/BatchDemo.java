import java.util.*;
import java.sql.*;

class BatchDemo {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "IamPramo");
            PreparedStatement stmt = con.prepareStatement("insert into Enquiry values(?,?,?)");

            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("Enter Employee Id");
                String eid = sc.nextLine();

                System.out.println("Enter Employee Name");
                String ename = sc.nextLine();

                System.out.println("Enter Employee Course");
                String ecourse = sc.nextLine();

                stmt.setString(1, eid);
                stmt.setString(2, ename);
                stmt.setString(3, ecourse);
                stmt.addBatch();

                System.out.println("Want to add more record y/n");
                String ans = sc.nextLine();

                if (ans.equals("n")) {
                    break;
                }
            }
            stmt.executeBatch();
            con.close();
            sc.close();
            System.out.println("Successfully inserted");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
