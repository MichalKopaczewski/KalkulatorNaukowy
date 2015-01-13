package widok;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class PanelInvHyp extends JPanel {
    private final Dimension WYMIARY_PANELU = new Dimension(125, 25);
    private final Point POZYCJA_PANELU = new Point(0, 80);
    private JCheckBox inv,hyp;
    public PanelInvHyp () {
        setSize(WYMIARY_PANELU);
        setLocation(POZYCJA_PANELU);
        setLayout(new GridLayout(1, 2));
        inicjalizacjaOrazDodanieCheckBoxow();
    }
    private void inicjalizacjaOrazDodanieCheckBoxow() {
        inv = new JCheckBox("Inv");
        hyp = new JCheckBox("Hyp");
        add(inv);
        add(hyp);
    }
}
