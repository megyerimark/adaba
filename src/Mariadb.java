import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mariadb implements Database {
    public Connection connectDb()  {
        Connection con = null ;
        try {
           con = tryConnectDb();
        } catch (SQLException e) {
          System.err.println("Hiba a kapcsolódás sikertelen!");
        }
        return con;

    }

   public Connection tryConnectDb() throws SQLException{    
        Connection con = null ;
        String url= "jdb:mariadb://localhost:3366/adaba";
        String user= "adaba";
        String password="Almafa12";

       con=  DriverManager.getConnection(url, user, password);
       return con;
       
        }
        public void closeDb(Connection con){
            
        }
}


     
  

    
    

