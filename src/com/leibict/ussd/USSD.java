/*
 * USSD.java
 *
 * Created on November 24, 2008, 12:50 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.leibict.ussd;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import traffic_alerts.DBConnector;


/**
 *
 * @author Prasan
 */
public class USSD {

    
    /** Creates a new instance of USSD */
     public static native int initialize();
     public static native int connect(String addr,int port);
     public static native int ussd_request(int dialogId,String prompt);
     public static native int ussd_end(int dialogId,String info);
     private static native int pong();
     public static String location1;
     public static String location2;
     public static String location3;
     

     public static void cb_ussd_service(int dialogId,String shortCode,String phoneNumber) {
         System.out.println(dialogId + " " + shortCode + " " + phoneNumber);
         
         int res;
         
        if(shortCode.equals("#119#")){
         res = ussd_end(dialogId, "Enter * for information");
             System.out.println(res);
         }

          if(shortCode.equals("*")){
         res = ussd_end(dialogId, "Enter rout");
             System.out.println(res);
         }

         if(shortCode.equals("100")){
         location2 = "Katubedda to Rathmalana";
             System.out.println(location2);
             res = ussd_end(dialogId, "Enter ** for type");
             System.out.println(res);

         }
         else if(shortCode.equals("101"))
         {
         location2 = "Rathmalana to Mt.lavinia";
             System.out.println(location2);
             res = ussd_end(dialogId, "Enter ** for type");
             System.out.println(res);
             //res = ussd_end(dialogId, "Enter type");
         }
         else if (shortCode.equals("102")) {
         location2 = "Mt.lavinia to Dehiwala";
             System.out.println(location2);
             res = ussd_end(dialogId, "Enter ** for type");
             System.out.println(res);
             //res = ussd_end(dialogId, "Enter type");
         }
         else if(shortCode.equals("103"))
         {
         location2 = "Dehiwala to Wallawatte";
             System.out.println(location2);
             res = ussd_end(dialogId, "Enter ** for type");
             System.out.println(res);
             //res = ussd_end(dialogId, "Enter type");
         }
         else if(shortCode.equals("104"))
         {
         location2 = "Wallawatte to Bambalapitiya";
         //res = ussd_end(dialogId, "Enter type");
             System.out.println(location2);
             res = ussd_end(dialogId, "Enter ** for type");
             System.out.println(res);
         }
         else if(shortCode.equals("105"))
         {
         location2 = "Bambalapitiya to Kollpitiya";
             System.out.println(location2);
             res = ussd_end(dialogId, "Enter ** for type");
             System.out.println(res);

         }
         else if(shortCode.equals("106"))
         {
         location2 = "Kollpitiya to Fort";
             System.out.println(location2);
             res = ussd_end(dialogId, "Enter ** for type");
             System.out.println(res);

         }
          
             if(shortCode.equals("**")){
         res = ussd_end(dialogId, "Enter type");
             System.out.println(res);
         }

             if(shortCode.equals("1")){
            location3 = "Serious";
             System.out.println(location3);
             res = ussd_end(dialogId, "Thank You");
         System.out.println(res);
                      }
             if(shortCode.equals("2")){
            location3 = "Moderate";
             System.out.println(location3);
             res = ussd_end(dialogId, "Thank You");
         System.out.println(res);
                      }
             if(shortCode.equals("3")){
            location3 = "Average";
             System.out.println(location3);
             res = ussd_end(dialogId, "Thank You");
         System.out.println(res);
                      }
             if(shortCode.equals("4")){
            location3 = "Normal";
             System.out.println(location3);
             res = ussd_end(dialogId, "Thank You");
         System.out.println(res);
                      }


         if(shortCode.equals("#123#")){
             res = ussd_end(dialogId, "Enter 0 for traffic alerts");
             System.out.println(res);
         }
         
         if(shortCode.equals("0")){
             res = ussd_end(dialogId, "Select options   1-Moratuwa      2-Katubedda      3-Rathmalana      4-Dehiwala      5-Wallawatte      6-Bambalapitiya      7-Kollpitiya      8-Pettah      9-Fort");
             System.out.println(res);
         }


         if(shortCode.equals("12")){
        
         location1 = "Moratuwa to Katubedda";
             System.out.println(location1);
                      
         }
         else if(shortCode.equals("13")){
         location1 = "Moratuwa to Rathmalana";
                
         }
         else if(shortCode.equals("14")){
         location1 = "Moratuwa to Dehiwala";
            
         }
         else if(shortCode.equals("15")){
         location1= "Moratuwa to Wallawatte";
         
         }
         else if(shortCode.equals("16")){
         location1 = "Moratuwa to Bambalapitiya";
        
         }
         else if(shortCode.equals("17")){
         location1 = "Moratuwa to Kollpitiya";
         
         }
         else if(shortCode.equals("18")){
         location1 = "Moratuwa to Pettah";
         
         }
         else if(shortCode.equals("19")){
         location1 = "Moratuwa to Fort";
         
         }
         else if(shortCode.equals("23")){
         location1 = "Katubedda to Rathmalana";
         
         }
         else if(shortCode.equals("24")){
         location1 = "Katubedda to Dehiwala";

         }
         else if(shortCode.equals("25")){
         location1 = "Katubedda to Wallawatte";

         }
         else if(shortCode.equals("26")){
         location1 = "Katubedda to Bambalapitiya";

         }
         else if(shortCode.equals("27")){
         location1 = "Katubedda to Kollpitiya";

         }
         else if(shortCode.equals("28")){
         location1 = "Katubedda to Pettah";

         }
         else if(shortCode.equals("29")){
         location1 = "Katubedda to Fort";

         }
         else if(shortCode.equals("34")){
         location1 = "Rathmalana to Dehiwala";

         }
         else if(shortCode.equals("35")){
         location1 = "Rathmalana to Wallawatte";

         }
         else if(shortCode.equals("36")){
         location1 = "Rathmalana to Bambalapitiya";

         }
         else if(shortCode.equals("37")){
         location1 = "Rathmalana to Kollpitiya";

         }
         else if(shortCode.equals("38")){
         location1 = "Rathmalana to Pettah";

         }
         else if(shortCode.equals("39")){
         location1 = "Rathmalana to Fort";

         }
         else if(shortCode.equals("45")){
         location1 = "Dehiwala to Wallawatte";

         }
         else if(shortCode.equals("46")){
         location1 = "Dehiwala to Bambalapitiya";

         }
         else if(shortCode.equals("47")){
         location1 = "Dehiwala to Kollpitiya";

         }
         else if(shortCode.equals("48")){
         location1 = "Dehiwala to Pettah";

         }
         else if(shortCode.equals("49")){
         location1 = "Dehiwala to Fort";

         }
         else if(shortCode.equals("56")){
         location1 = "Wallawatte to Bambalapitiya";

         }
         else if(shortCode.equals("57")){
         location1 = "Wallawatte to Kollpitiya";

         }
         else if(shortCode.equals("58")){
         location1 = "Wallawatte to Pettah";

         }
         else if(shortCode.equals("59")){
         location1 = "Wallawatte to Fort";

         }
         else if(shortCode.equals("67")){
         location1 = "Bambalapitiya to Kollpitiya";

         }
         else if(shortCode.equals("68")){
         location1 = "Bambalapitiya to Pettah";

         }
         else if(shortCode.equals("69")){
         location1 = "Bambalapitiya to Fort";

         }
         else if(shortCode.equals("78")){
         location1 = "Kollpitiya to Pettah";

         }
         else if(shortCode.equals("79")){
         location1 = "Kollpitiya to Fort";

         }
         else if(shortCode.equals("89")){
         location1 = "Pettah to Fort";

         }
         res = ussd_end(dialogId, "Wait for alerts...");
         System.out.println(res);

         try {
             Connection conn = DBConnector.getMyConnection();
             Statement stmt = conn.createStatement();
             String query = "INSERT INTO place VALUES(null,'"+location1+"')";
             String query1 = "INSERT INTO accident VALUES(null,'"+location2+"')";
             String query2 = "INSERT INTO type VALUES(null,'"+location3+"')";
             stmt.executeUpdate(query);
             stmt.executeUpdate(query1);
             stmt.executeUpdate(query2);

         } catch (Exception e) {
             e.printStackTrace();
         }       
         
                  
         

     }
     private static void cb_ussd_response(int dialogId,String str) {
         System.out.println("cb_response");
         int rew;
         rew = ussd_end(dialogId, "Select your options");
         System.out.println(rew);
     }
     private static void cb_ussd_end(int dialogId){
	 System.out.println("cb_end"); 
     }
     private static void cb_disconnected(){
	 System.out.println("cb_disconnected"); 
     }
     private static void cb_connected(){
	 System.out.println("cb_connected"); 
     }
     private static void cb_ping(){
	 System.out.println("cb_ping"); 
	 pong();
     }

     static {
         System.loadLibrary("ussdjni");
     }
}

