/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package traffic_alerts;

import java.text.DecimalFormat;

/**
 *
 * @author Prasan
 */
public class HaversineDistance {


    public static void main(String[] args) {

    final double  R = 6372.8;
   
//    Double FromLatd = Double.parseDouble(args[0]);
//    Double FromLong = Double.parseDouble(args[1]);
//    Double ToLatd = Double.parseDouble(args[2]);
//    Double ToLong = Double.parseDouble(args[3]);
    Double FromLatd = 10.239015;
    Double FromLong = 80.234768;
    Double ToLatd = 13.678543;
    Double ToLong = 80.456734;

    Double latDistance = toRad(ToLatd-FromLatd);
    Double lonDistance = toRad(ToLong-FromLong);

    Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) + Math.cos(toRad(FromLatd)) * Math.cos(toRad(ToLatd)) * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
    Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
    Double distance = (R * c)/77;
    DecimalFormat dataFormat = new DecimalFormat("#.#");
    System.out.println(dataFormat.format(distance));
    }

    private static Double toRad(Double value) {
        
        return value * Math.PI / 180;
    }
}
