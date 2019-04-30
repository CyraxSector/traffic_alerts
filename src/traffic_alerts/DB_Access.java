/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package traffic_alerts;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Prasan
 */
public class DB_Access {
    public static ResultSet getData(String query) throws SQLException, ClassNotFoundException, Exception{
        Connection con = DBConnector.getMyConnection();
        ResultSet rst =  con.createStatement().executeQuery(query);
        con.close();
        return rst;

    }

    public static void setData(String query) throws SQLException, ClassNotFoundException, Exception{
       Connection con = DBConnector.getMyConnection();
       con.createStatement().executeUpdate(query);
        con.close();

    }

    private DB_Access() {
    }

}
