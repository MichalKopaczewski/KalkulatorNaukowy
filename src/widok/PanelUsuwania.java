package widok;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import javax.swing.JPanel;

public class PanelUsuwania extends JPanel {
    private MyJButton backSpace,ce,c;
    private final Dimension WYMIARY_PANELU = new Dimension(220, 30);
    private final Point POZYCJA_PANELU = new Point(279, 80);
    public PanelUsuwania () {
        setSize(WYMIARY_PANELU);
        setLocation(POZYCJA_PANELU);
        setLayout(new GridLayout(1, 3,3,2));
        inicjalizacjaOrazDodaniePrzyciskow();
    }
    private void inicjalizacjaOrazDodaniePrzyciskow() {
        backSpace = new MyJButton("Backspace",Color.red);
        ce = new MyJButton("CE",Color.red);
        c = new MyJButton("C",Color.red);
        add(backSpace);
        add(ce);
        add(c);
    }
}
