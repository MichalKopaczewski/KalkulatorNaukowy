package widok;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelSystemyPozycyjne extends JPanel {
    private final Dimension WYMIARY_PANELU = new Dimension(230, 25);
    private final Point POZYCJA_PANELU = new Point(0, 50);
    private JRadioButton hex,dec,oct,bin;
    public PanelSystemyPozycyjne () {
        setSize(WYMIARY_PANELU);
        setLocation(POZYCJA_PANELU);
        setLayout(new GridLayout(1, 4));
        inicjalizacjaRadioButtonowDodanieDoGrupy();
        dodanieRadioButtonowDoPanelu();
        
    }
    private void inicjalizacjaRadioButtonowDodanieDoGrupy() {
        hex = new JRadioButton("Hex");
        dec = new JRadioButton("Dec");
        oct = new JRadioButton("Oct");
        bin = new JRadioButton("Bin");
        ButtonGroup grupa = new ButtonGroup();
        grupa.add(hex);
        grupa.add(dec);
        grupa.add(oct);
        grupa.add(bin);
    }
    private void dodanieRadioButtonowDoPanelu() {
        add(hex);
        add(dec);
        add(oct);
        add(bin);
    }
}
