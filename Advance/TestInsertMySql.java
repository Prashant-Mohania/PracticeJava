import java.sql.*;

class TestInsertMySql {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College?useSSL=false", "root",
                    "mysql");
            Statement stmt = con.createStatement();
            stmt.execute("insert into Emp values('Z001', 'Nigam', 'Trainee', 7000)");
            // stmt.executeQuery("Select * from Emp");
            System.out.println("Record has been successfull inserted");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}