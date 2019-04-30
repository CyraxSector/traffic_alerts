/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.openstreetmap.gui.jmapviewer;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import org.openstreetmap.gui.jmapviewer.interfaces.MapMarker;

/**
 *
 * @author Tharaka Wijebandara
 */
public class MapMarkerArrow implements MapMarker{

    double lat;
    double lon;
    double theta = Math.PI/2;
    Color color;

    public MapMarkerArrow(double lat, double lon) {
        this(Color.RED, lat, lon);
    }

    public MapMarkerArrow(Color color, double lat, double lon) {
        super();
        this.color = color;
        this.lat = lat;
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public void paint(Graphics2D g, Point position) {
//        g1.setColor(color);
//        int xPoints[] = {position.x,(int)(position.x + 6.7*Math.cos(theta-2*(Math.PI/3))),(int)(position.x + 12*Math.cos(theta)),(int)(position.x + 6.7*Math.cos(theta-4*(Math.PI/3)))};
//        int yPoints[] = {position.y,(int)(position.y-6.7*Math.sin(theta-2*(Math.PI/3))),(int)(position.y-12*Math.sin(theta)),(int)(position.y-6.7*Math.sin(theta-4*(Math.PI/3)))};
//        g1.fillPolygon(xPoints, yPoints, 4);
//        g1.setColor(Color.BLACK);
//        g1.drawPolygon(xPoints, yPoints, 4);
        int size_h = 3;
        int size = size_h * 2;
        g.setColor(color);
        g.fillOval(position.x - size_h, position.y - size_h, size, size);
        g.setColor(Color.BLACK);
        g.drawOval(position.x - size_h, position.y - size_h, size, size);
    }

    public void setPosition(double  latVal, double lonVal){
        this.lat = latVal;
        this.lon = lonVal;
    }

    @Override
    public String toString() {
        return "MapMarker at " + lat + " " + lon;
    }

}
