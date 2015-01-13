package widok;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelLewy extends JPanel {
    private final Dimension WYMIARY_PANELU = new Dimension(41, 205);
    private final Point POZYCJA_PANELU = new Point(0, 115);
    private MyJButton sta,ave,sum,s,dal;
    public PanelLewy() {
        setSize(WYMIARY_PANELU);
        setLocation(POZYCJA_PANELU);
        setLayout(new GridLayout(5, 1,2,2));
        inicjalizacjaOrazDodaniePzyciskow();
        wylaczeniePrzycisku(ave);
        wylaczeniePrzycisku(sum);
        wylaczeniePrzycisku(s);
        wylaczeniePrzycisku(dal);
    }
    private void inicjalizacjaOrazDodaniePzyciskow() {
        sta = new MyJButton("Sta",Color.blue);
        ave = new MyJButton("Ave",Color.black);
        sum = new MyJButton("Sum",Color.black);
        s = new MyJButton("S",Color.black);
        dal = new MyJButton("dal",Color.black);
        add(sta);
        add(ave);
        add(sum);
        add(s);
        add(dal);
    }
    public void wlaczeniePrzycisku(MyJButton przycisk) {
        przycisk.setEnabled(true);
    }
    public void wylaczeniePrzycisku(MyJButton przycisk) {
        przycisk.setEnabled(false);
    }
}
