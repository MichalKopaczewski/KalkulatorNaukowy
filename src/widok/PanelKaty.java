package widok;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelKaty extends JPanel {
    private final Dimension WYMIARY_PANELU = new Dimension(250, 25);
    private final Point POZYCJA_PANELU = new Point(250, 50);
    private JRadioButton stopnie,gradusy,radiany;
    public PanelKaty () {
        setSize(WYMIARY_PANELU);
        setLocation(POZYCJA_PANELU);
        setLayout(new GridLayout(1, 3));
        inicjalizacjaRadioButtonowOrazDodanieDoGrupy();
        dodanieRadioButtonowDoPanelu();
    }
    private void inicjalizacjaRadioButtonowOrazDodanieDoGrupy() {
        stopnie = new JRadioButton("Stopnie");
        gradusy = new JRadioButton("Gradusy");
        radiany = new JRadioButton("Radiany");
        ButtonGroup grupa = new ButtonGroup();
        grupa.add(stopnie);
        grupa.add(gradusy);
        grupa.add(radiany);
    }
    private void dodanieRadioButtonowDoPanelu() {
        add(stopnie);
        add(gradusy);
        add(radiany);
    }
}
