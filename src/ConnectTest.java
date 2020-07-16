import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectTest {

  private Connection cn;
  private ResultSet rs;
  private Statement st;

  public void connectToDB(){
    try{
      Class.forName("org.sqlite.JDBC");
      cn = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\test.db");

      String createTableSql = "CREATE TABLE IF NOT EXISTS TESTDATA (\n"
          + " name text NOT NULL\n"
          + ");";

      st = cn.createStatement();
      st.execute(createTableSql);

      String sql = "INSERT INTO TESTDATA (NAME) VALUES(?)";
      PreparedStatement pstmt = cn.prepareStatement(sql);
      pstmt.setString(1, "Okay");
      pstmt.executeUpdate();

    }catch (ClassNotFoundException | SQLException e){
      e.printStackTrace();
    }
  }



  public static void main(String[] args) {
    Connection connection = null;
    ResultSet rs = null;
    Statement st = null;

    ConnectTest ct = new ConnectTest();
    ct.connectToDB();

    /*

    try {
      Class.forName("org.sqlite.JDBC");
      connection = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\chinook.db");
      st = connection.createStatement();
      rs = st.executeQuery("SELECT * FROM artists");
      while(rs.next()){
        System.out.println(rs.getString("Name"));
      }
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }


     */
  }
}
