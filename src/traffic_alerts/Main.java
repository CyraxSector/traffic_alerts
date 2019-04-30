/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package traffic_alerts;

import javax.swing.UIManager;
import de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel;

/**
 *
 * @author Prasan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new logging().setVisible(true);
         try {

			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                        UIManager.setLookAndFeel(new SyntheticaBlackMoonLookAndFeel());

			} catch (Exception evt) {}
        // TODO code application logic here
    }

}
