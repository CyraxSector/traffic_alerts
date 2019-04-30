/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package traffic_alerts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Prasan
 */
public class DBConnector {

    static String url = "jdbc:mysql://localhost:3306/";
    static String dbName = "traffic";
    static String driver = "com.mysql.jdbc.Driver";
    static String userName = "root";
    static String password = "123";
    static Connection conn = null;

    public static Connection getMyConnection() {


       try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbName, userName, password);

        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;

    }

    public static ResultSet getResultset(String sql) throws Exception {
        if (conn == null) {
            getMyConnection();
        }

        ResultSet rs = (ResultSet) conn.createStatement().executeQuery(sql);

        return rs;
    }

    public static void stexecuteUpdate(String sql) throws Exception {

        if (conn == null) {
            getMyConnection();
        }
        conn.createStatement().executeUpdate(sql);

    }

}
