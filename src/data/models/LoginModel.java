package data.models;

import java.sql.*;
import data.SQLConnector;
import data.DatabaseEnum;

public class LoginModel
{
    public boolean validateLogin(String user, String password) throws Exception
    {
        boolean loginValid = false;
        if (password != null)
        {
            //add '' to values to allow them to be added to sql queries
            user = "'" + user  + "'";
            password = "'" + password + "'";
            SQLConnector sqlConn = new SQLConnector();
            sqlConn.getConnection(DatabaseEnum.MYSQL);
            String [] columns = {"username", "password"};
            ResultSet rs = sqlConn.select("users", columns, " WHERE username =" + user + " AND PASSWORD =" + password, null );
	        loginValid = rs.next();
            rs.close();
            sqlConn.closeConnection();
        }
        return loginValid;
    }
}

