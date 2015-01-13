package widok;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import javax.swing.JPanel;

public class PanelLiter extends JPanel {
    private final Dimension WYMIARY_PANELU = new Dimension(267, 39);
    private final Point POZYCJA_PANELU = new Point(234, 280);
    private MyJButton a,b,c,d,e,f;
    public PanelLiter () {
        setSize(WYMIARY_PANELU);
        setLocation(POZYCJA_PANELU);
        setLayout(new GridLayout(1, 6,2,2));
        inicjalizacjaOrazDodaniePrzyciskow();
        wylaczeniePrzycisku(a);
        wylaczeniePrzycisku(b);
        wylaczeniePrzycisku(c);
        wylaczeniePrzycisku(d);
        wylaczeniePrzycisku(e);
        wylaczeniePrzycisku(f);
    }

    private void inicjalizacjaOrazDodaniePrzyciskow() {
        a = new MyJButton("A", Color.BLACK);
        b = new MyJButton("B", Color.BLACK);
        c = new MyJButton("C", Color.BLACK);
        d = new MyJButton("D", Color.BLACK);
        e = new MyJButton("E", Color.BLACK);
        f = new MyJButton("F", Color.BLACK);
        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(f);
    }
    public void wlaczeniePrzycisku(MyJButton przycisk) {
        przycisk.setEnabled(true);
    }
    public void wylaczeniePrzycisku(MyJButton przycisk) {
        przycisk.setEnabled(false);
    }
    
}
