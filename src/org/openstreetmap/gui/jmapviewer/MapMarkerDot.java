package org.openstreetmap.gui.jmapviewer;

//License: GPL. Copyright 2008 by Jan Peter Stotz

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

import org.openstreetmap.gui.jmapviewer.interfaces.MapMarker;

/**
 * A simple implementation of the {@link MapMarker} interface. Each map marker
 * is painted as a circle with a black border line and filled with a specified
 * color.
 * 
 * @author Jan Peter Stotz
 * 
 */
public class MapMarkerDot implements MapMarker {

    double lat;
    double lon;
    Color color;

    public MapMarkerDot(double lat, double lon) {
        this(Color.RED, lat, lon);
    }

    public MapMarkerDot(Color color, double lat, double lon) {
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
        int size_h = 5;
        int size = size_h * 2;
        g.setColor(color);
        g.setStroke(new BasicStroke(2));
        g.drawLine(position.x, position.y-10, position.x, position.y+10);
        g.drawLine(position.x-10, position.y, position.x+10, position.y);
        g.fillOval(position.x - size_h, position.y - size_h, size, size);
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(1));
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
