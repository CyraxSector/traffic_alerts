/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * mess.java
 *
 * Created on Feb 7, 2012, 12:21:51 PM
 */

package traffic_alerts;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Prasan
 */
public class mess extends javax.swing.JFrame {

    /** Creates new form mess */
    public mess() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("start");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jButton1)
                .addContainerGap(199, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jButton1)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      new Thread(new Runnable() {

            public void run() {
                try {
//                    int a1 = 0;
//                    System.out.println(a1 < 10);
//               while(a1 < 10){
                   for (int a1= 1; a1<10 ; a1 ++){
                    System.out.println("ammo");
                   Thread.sleep(10000);
//                   a1 = a1 + 1;
                   System.out.println(a1);
                   String query = "SELECT * FROM mess WHERE id = '"+a1+"'";
                    Connection conn = DBConnector.getMyConnection();
                     ResultSet rs1 = conn.createStatement().executeQuery(query);
                     System.out.println("ayoo");
                     System.out.println("ann"+rs1.next());
                     while(rs1.next()){
                         System.out.println("ayooaa");
//                        String long1 = rs1.getString("long");
//                        String latd1 = rs1.getString("latd");
//                         String cabNo = rs1.getString("cabno");
//                         System.out.println(long1);
//
//                     String query1 = "UPDATE speed SET long = '"+long1+"' , latd ='"+latd1+"' WHERE cab_no = '"+cabNo+"' ";
//                           conn.createStatement().executeUpdate(query1);
//                         System.out.println("fzgnx");
                     }
                   




               }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

}