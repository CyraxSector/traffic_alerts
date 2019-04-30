/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.openstreetmap.gui.jmapviewer;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import org.openstreetmap.gui.jmapviewer.interfaces.MapMarker;

/**
 *
 * @author Prasan
 */
public class MapMarkerCross implements MapMarker{
    double lat;
    double lon;
    String text;
    Color color = Color.GREEN;

    public MapMarkerCross(double lat, double lon) {
        this("", lat, lon);
    }

    public MapMarkerCross(String text, double lat, double lon) {
        super();
        this.text = text;
        this.lat = lat;
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public void paint(Graphics2D g1, Point position) {
        g1.setColor(color);
        g1.setStroke(new BasicStroke(2));
        //g1.drawLine(position.x, position.y-10, position.x, position.y+10);
        //g1.drawLine(position.x-10, position.y, position.x+10, position.y);
        g1.setColor(Color.RED);
        g1.fillRect(position.x-2, position.y-2, 4, 4);
        if(!text.equals("")){
            g1.setColor(new Color(200, 191, 232));
            g1.fillOval(position.x-10, position.y+15, 20, 20);
            g1.setColor(Color.BLACK);
            g1.setStroke(new BasicStroke(1));
            g1.drawOval(position.x-10, position.y+15, 20, 20);
            g1.setColor(Color.WHITE);
            g1.drawString(text, position.x-5, position.y+30);
        }
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
