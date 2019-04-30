/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package traffic_alerts;

import javax.swing.UIManager;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 *
 * @author Prasan
 */
public class mainSystemApp extends SingleFrameApplication{
    public static logging   log_frame;


    @Override
    protected void startup() {
        log_frame  =new logging();
        log_frame.setVisible(true);
        
    }

    @Override protected void configureWindow(java.awt.Window root) {
    }

     /**
     * A convenient static getter for the application instance.
     * @return the instance of CardcheckApp
     */
    public static mainSystemApp getApplication() {
        return Application.getInstance(mainSystemApp.class);
    }

    /**
     * Main method launching the application.
     */
     public static void main(String[] args) {

try {

			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

			} catch (Exception evt) {}



         launch(mainSystemApp.class, args);

      //  new logging().setVisible(true);

    }

}
