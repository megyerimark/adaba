import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sqlite implements Database{
 public Connection tryConnectDb() throws SQLException{
        String url="jdbc:sqlite:adaba.sqlite";
        
        return DriverManager.getConnection(url);
        }


        




    @Override
    public Connection connectDb() throws SQLException {
        Connection con= null;

        try {
            con =tryConnectDb();
        } catch (Exception e) {
            System.err.println("Hiba! Az SQlite fálj nem nyitható meg");
        }
        return con;


       
    }







    @Override
    public void closeDb(Connection con) {
       return null;
        
    }






 
}
