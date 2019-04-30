/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package traffic_alerts;

import com.mongodb.BasicDBObject;
import com.mongodb.Mongo;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoException;
import java.net.UnknownHostException;
import com.mongodb.gridfs.GridFS;

/**
 *
 * @author Prasan
 */

// accessing mongoDB in a secure mode

public class mongoDBConnector {

   public static void main(String[]args){

       try {

           Mongo mongo = new Mongo("localhost", 27017);
           DB db = mongo.getDB("trafficMongo");

           boolean auth = db.authenticate("trafficAlerts", "123".toCharArray());
           DBCollection collection = db.getCollection("cabs");

           System.out.println("done");

           BasicDBObject doc = new BasicDBObject();
           doc.put("x", 1);
           doc.put("y", "traffic");


       } catch (UnknownHostException e) {
           e.printStackTrace();
       }
       catch (MongoException e){
            e.printStackTrace();
       }
   }
}
