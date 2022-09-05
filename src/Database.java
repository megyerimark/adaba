import java.sql.Connection;
import java.sql.SQLException;

public interface Database {
    public Connection connectDb() throws SQLException;
    public void closeDb(Connection con);
    
    }



