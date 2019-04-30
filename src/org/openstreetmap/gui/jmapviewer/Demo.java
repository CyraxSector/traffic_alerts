package org.openstreetmap.gui.jmapviewer;



import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.openstreetmap.gui.jmapviewer.interfaces.MapMarker;

import org.openstreetmap.gui.jmapviewer.interfaces.TileLoader;
import org.openstreetmap.gui.jmapviewer.interfaces.TileSource;
import traffic_alerts.cabSpeed;
import traffic_alerts.mainSystem;


public class Demo extends JFrame {

    private static final long serialVersionUID = 1L;
    

    public Demo() {
        super("JMapViewer Demo");
        setSize(400, 400);
        final JMapViewer map = new JMapViewer();
        // final JMapViewer map = new JMapViewer(new MemoryTileCache(),4);
        // map.setTileLoader(new OsmFileCacheTileLoader(map));
        // new DefaultMapController(map);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        JPanel panel = new JPanel();
        JPanel helpPanel = new JPanel();
        add(panel, BorderLayout.NORTH);
        add(helpPanel, BorderLayout.SOUTH);
        JLabel helpLabel = new JLabel("Use right mouse button to move,\n "
                + "left double click or mouse wheel to zoom.");
        helpPanel.add(helpLabel);
        JButton button = new JButton("setDisplayToFitMapMarkers");
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                map.setDisplayToFitMapMarkers();
            }
        });
        JComboBox tileSourceSelector = new JComboBox(new TileSource[] { new OsmTileSource.Mapnik(),
                new OsmTileSource.TilesAtHome(), new OsmTileSource.CycleMap() });
        tileSourceSelector.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                map.setTileSource((TileSource) e.getItem());
            }
        });
        JComboBox tileLoaderSelector = new JComboBox(new TileLoader[] { new OsmFileCacheTileLoader(map),
                new OsmTileLoader(map) });
        tileLoaderSelector.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                map.setTileLoader((TileLoader) e.getItem());
            }
        });
        map.setTileLoader((TileLoader) tileLoaderSelector.getSelectedItem());
        panel.add(tileSourceSelector);
        panel.add(tileLoaderSelector);
        final JCheckBox showMapMarker = new JCheckBox("Map markers visible");
        showMapMarker.setSelected(map.getMapMarkersVisible());
        showMapMarker.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                map.setMapMarkerVisible(showMapMarker.isSelected());
            }
        });
        panel.add(showMapMarker);
        final JCheckBox showTileGrid = new JCheckBox("Tile grid visible");
        showTileGrid.setSelected(map.isTileGridVisible());
        showTileGrid.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                map.setTileGridVisible(showTileGrid.isSelected());
            }
        });
        panel.add(showTileGrid);
        final JCheckBox showZoomControls = new JCheckBox("Show zoom controls");
        showZoomControls.setSelected(map.getZoomContolsVisible());
        showZoomControls.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                map.setZoomContolsVisible(showZoomControls.isSelected());
            }
        });
        panel.add(showZoomControls);
        panel.add(button);
        add(map, BorderLayout.CENTER);
         map.setDisplayPositionByLatLon(6.794725, 79.887836, 14);   
         String location1 = cabSpeed.locationNo1;         
         String location2 = cabSpeed.locationNo2;
             
         if(location1.equals("1") && location2.equals("2")){
             map.addMapMarker(new MapMarkerCross(6.797367, 79.888544));//katubedda
             map.addMapMarker(new MapMarkerCross(6.801480, 79.888158));
             map.addMapMarker(new MapMarkerCross(6.804548, 79.886785));
             map.addMapMarker(new MapMarkerCross(6.806891, 79.884617));
             map.addMapMarker(new MapMarkerCross(6.806955, 79.884617));             
             map.addMapMarker(new MapMarkerCross(6.810322, 79.890625));
             map.addMapMarker(new MapMarkerCross(6.816011, 79.887729));
             map.addMapMarker(new MapMarkerCross(6.812495, 79.881270));
             map.addMapMarker(new MapMarkerCross(6.814732, 79.878738));
             map.addMapMarker(new MapMarkerCross(6.816905, 79.875820));
             map.addMapMarker(new MapMarkerCross(6.819462, 79.873674));//rathmalana
             map.addMapMarker(new MapMarkerDot(6.809725, 79.883072));
             map.addMapMarker(new MapMarkerDot(6.812815, 79.888780));             
             map.addMapMarker(new MapMarkerDot(6.811408, 79.886205));
             map.repaint();

            }
         else if(location1.equals("2")&& location2.equals("3")){
             map.addMapMarker(new MapMarkerDot(6.819462, 79.873674));//rathmalana
             map.addMapMarker(new MapMarkerCross(6.819462, 79.873674));//rathmalana
             map.addMapMarker(new MapMarkerCross(6.824000, 79.881721));
             map.addMapMarker(new MapMarkerCross(6.832054, 79.880712));
             map.addMapMarker(new MapMarkerCross(6.831798, 79.875348));
             map.addMapMarker(new MapMarkerCross(6.831692, 79.872794));
             map.addMapMarker(new MapMarkerCross(6.831223, 79.871507));             
             map.addMapMarker(new MapMarkerCross(6.830413, 79.867859));
             map.addMapMarker(new MapMarkerCross(6.833012, 79.867344));//mt.lavinia
             map.addMapMarker(new MapMarkerDot(6.829774, 79.880948));
             map.addMapMarker(new MapMarkerDot(6.828304, 79.877880));
             map.addMapMarker(new MapMarkerDot(6.826046, 79.869640));
             map.addMapMarker(new MapMarkerDot(6.827324, 79.875133));
             map.addMapMarker(new MapMarkerDot(6.829199, 79.877880));
             map.addMapMarker(new MapMarkerDot(6.826663, 79.871678));

            }
         else if(location1.equals("3")&& location2.equals("4")){
             map.addMapMarker(new MapMarkerCross(6.833012, 79.867344));//mt.lavinia
             map.addMapMarker(new MapMarkerCross(6.838211, 79.867558));
             map.addMapMarker(new MapMarkerCross(6.839138, 79.871582));
             map.addMapMarker(new MapMarkerCross(6.838914, 79.873095));
             map.addMapMarker(new MapMarkerCross(6.840469, 79.875348));
             map.addMapMarker(new MapMarkerCross(6.842184, 79.876077));
             map.addMapMarker(new MapMarkerCross(6.844176, 79.875594));
             map.addMapMarker(new MapMarkerCross(6.845870, 79.871442));
             map.addMapMarker(new MapMarkerCross(6.845902, 79.871432));
             map.addMapMarker(new MapMarkerCross(6.847777, 79.869275));
             map.addMapMarker(new MapMarkerCross(6.847489, 79.866067));
             map.addMapMarker(new MapMarkerDot(6.839542, 79.867548));
             map.addMapMarker(new MapMarkerDot(6.841939, 79.866904));
             map.addMapMarker(new MapMarkerDot(6.846999, 79.866046));
             map.addMapMarker(new MapMarkerCross(6.851143, 79.866014));//dehiwala
         }
         else if(location1.equals("4")&& location2.equals("5")){
             map.addMapMarker(new MapMarkerCross(6.851143, 79.866014));//dehiwala
             map.addMapMarker(new MapMarkerDot(6.851143, 79.866014));
             map.addMapMarker(new MapMarkerCross(6.855958, 79.865327));
             map.addMapMarker(new MapMarkerDot(6.855958, 79.865327));
             map.addMapMarker(new MapMarkerCross(6.856618, 79.868846));
             map.addMapMarker(new MapMarkerCross(6.854211, 79.872687));
             map.addMapMarker(new MapMarkerCross(6.853572, 79.873331));
             map.addMapMarker(new MapMarkerCross(6.856085, 79.873030));
             map.addMapMarker(new MapMarkerCross(6.858983, 79.868524));
             map.addMapMarker(new MapMarkerCross(6.859686, 79.867237));
             map.addMapMarker(new MapMarkerCross(6.861539, 79.866164));
             map.addMapMarker(new MapMarkerCross(6.862775, 79.865885));
             map.addMapMarker(new MapMarkerCross(6.862391, 79.863911));
             map.addMapMarker(new MapMarkerDot(6.862391, 79.863911));
             map.addMapMarker(new MapMarkerCross(6.865928, 79.863052));
             map.addMapMarker(new MapMarkerDot(6.865928, 79.863052));
             map.addMapMarker(new MapMarkerCross(6.865268, 79.859576));
             map.addMapMarker(new MapMarkerCross(6.874535, 79.857688));
            // map.addMapMarker(new MapMarkerCross(WIDTH, WIDTH));
             map.addMapMarker(new MapMarkerCross(6.875429, 79.861014));//wallawatte
             map.addMapMarker(new MapMarkerDot(6.875429, 79.861014));
         }
         else if(location1.equals("5")&& location2.equals("6")){
             map.addMapMarker(new MapMarkerCross(6.875429, 79.861014));//wallawatte
             map.addMapMarker(new MapMarkerDot(6.875429, 79.861014));
             map.addMapMarker(new MapMarkerCross(6.876622, 79.860649));
             map.addMapMarker(new MapMarkerCross(6.875791, 79.857473));
             map.addMapMarker(new MapMarkerCross(6.884078, 79.855328));
             map.addMapMarker(new MapMarkerCross(6.893111, 79.853375));
             map.addMapMarker(new MapMarkerCross(6.894964, 79.852839));
             map.addMapMarker(new MapMarkerCross(6.895411, 79.854856));//bambalapitiya
             map.addMapMarker(new MapMarkerDot(6.895411, 79.854856));
             map.addMapMarker(new MapMarkerDot(6.890320, 79.856658));
             map.addMapMarker(new MapMarkerDot(6.882523, 79.858911));
         } 
         else if(location1.equals("6")&& location2.equals("5")){
             map.addMapMarker(new MapMarkerCross(6.875429, 79.861014));//wallawatte
             map.addMapMarker(new MapMarkerCross(6.876622, 79.860649));
             map.addMapMarker(new MapMarkerCross(6.879392, 79.859898));
             map.addMapMarker(new MapMarkerCross(6.880095, 79.862258));
             map.addMapMarker(new MapMarkerCross(6.882545, 79.861357));
             map.addMapMarker(new MapMarkerCross(6.886741, 79.859898));
             map.addMapMarker(new MapMarkerCross(6.895923, 79.856894));
             map.addMapMarker(new MapMarkerCross(6.895411, 79.854856));//bambalapitiya
             map.addMapMarker(new MapMarkerDot(6.875429, 79.861014));
             map.addMapMarker(new MapMarkerDot(6.895411, 79.854856));
             map.addMapMarker(new MapMarkerDot(6.890320, 79.856658));
             map.addMapMarker(new MapMarkerDot(6.882523, 79.858911));
         }
         else if(location1.equals("6")&& location2.equals("7")){
             map.addMapMarker(new MapMarkerCross(6.895411, 79.854856));//bambalapitiya
             map.addMapMarker(new MapMarkerCross(6.895497, 79.854877));
             map.addMapMarker(new MapMarkerCross(6.894985, 79.852774));
             map.addMapMarker(new MapMarkerCross(6.897733, 79.851980));
             map.addMapMarker(new MapMarkerCross(6.908725, 79.848912));
             map.addMapMarker(new MapMarkerCross(6.910792, 79.848440));             
             map.addMapMarker(new MapMarkerCross(6.911069, 79.849727));//kollpitiya
             map.addMapMarker(new MapMarkerDot(6.895411, 79.854856));
             map.addMapMarker(new MapMarkerDot(6.911069, 79.849727));
             map.addMapMarker(new MapMarkerDot(6.901355, 79.852967));
             map.addMapMarker(new MapMarkerDot(6.905935, 79.851444));
         }
         else if(location1.equals("7")&& location2.equals("6")){
             map.addMapMarker(new MapMarkerCross(6.895411, 79.854856));//bambalapitiya
             map.addMapMarker(new MapMarkerCross(6.895923, 79.856873));
             map.addMapMarker(new MapMarkerCross(6.904252, 79.854147));
             map.addMapMarker(new MapMarkerCross(6.911921, 79.851530));
             map.addMapMarker(new MapMarkerCross(6.911473, 79.849899));
            // map.addMapMarker(new MapMarkerCross(WIDTH, WIDTH));
             map.addMapMarker(new MapMarkerCross(6.911069, 79.849727));//kollpitiya
             map.addMapMarker(new MapMarkerDot(6.895411, 79.854856));
             map.addMapMarker(new MapMarkerDot(6.911069, 79.849727));
             map.addMapMarker(new MapMarkerDot(6.901355, 79.852967));
             map.addMapMarker(new MapMarkerDot(6.905935, 79.851444));
         }
         else if(location1.equals("1")&& location2.equals("3")){
             map.addMapMarker(new MapMarkerCross(6.797367, 79.888544));//katubedda
             map.addMapMarker(new MapMarkerCross(6.801480, 79.888287));
             map.addMapMarker(new MapMarkerCross(6.804590, 79.886827));
             map.addMapMarker(new MapMarkerCross(6.809832, 79.883029));
             map.addMapMarker(new MapMarkerCross(6.814775, 79.878716));
             map.addMapMarker(new MapMarkerCross(6.819462, 79.873674));//rathmalana
             map.addMapMarker(new MapMarkerCross(6.823894, 79.870477));
             map.addMapMarker(new MapMarkerCross(6.833012, 79.867344));//mt.lavinia

         }

//         map.addMapMarker(new MapMarkerCross(6.809877, 79.883004));//belekkade
//         map.addMapMarker(new MapMarkerCross(6.833012, 79.867344));//mt.lavinia
//         map.addMapMarker(new MapMarkerCross(6.851143, 79.866014));//dehiwala
//         map.addMapMarker(new MapMarkerCross(6.875429, 79.861014));//wallawatte
//         map.addMapMarker(new MapMarkerCross(6.895411, 79.854856));//bambalapitiya
//         map.addMapMarker(new MapMarkerCross(6.911069, 79.849727));//kollpitiya
//         map.addMapMarker(new MapMarkerCross(6.931305, 79.842174));//topettah
//         map.addMapMarker(new MapMarkerCross(6.934755, 79.853976));//pettah
        
         
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // java.util.Properties systemProperties = System.getProperties();
        // systemProperties.setProperty("http.proxyHost", "localhost");
        // systemProperties.setProperty("http.proxyPort", "8008");
        new Demo().setVisible(true);
    }

}
