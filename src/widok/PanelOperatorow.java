package widok;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import javax.swing.JPanel;

public class PanelOperatorow extends JPanel {
    private final Dimension WYMIARY_PANELU = new Dimension(130, 164);
    private final Point POZYCJA_PANELU = new Point(368, 115);
    private MyJButton dziel,mod,and,mnoz,or,xOr,minus,lsh,not,plus,rowne,iNt;
    public PanelOperatorow () {
        setSize(WYMIARY_PANELU);
        setLocation(POZYCJA_PANELU);
        setLayout(new GridLayout(4, 3,2,2));
        inicjalizacjaOrazDodaniePrzyciskow();
    }

    private void inicjalizacjaOrazDodaniePrzyciskow() {
        dziel = new MyJButton("/", Color.RED);
        mod = new MyJButton("MOD", Color.RED);
        and = new MyJButton("And", Color.RED);
        mnoz = new MyJButton("*", Color.RED);
        or = new MyJButton("Or", Color.RED);
        xOr = new MyJButton("Xor", Color.RED);
        minus = new MyJButton("-", Color.RED);
        lsh = new MyJButton("Lsh", Color.RED);
        not = new MyJButton("Not", Color.RED);
        plus = new MyJButton("+", Color.RED);
        rowne = new MyJButton("=", Color.RED);
        iNt = new MyJButton("Int", Color.RED);
        add(dziel);
        add(mod);
        add(and);
        add(mnoz);
        add(or);
        add(xOr);
        add(minus);
        add(lsh);
        add(not);
        add(plus);
        add(rowne);
        add(iNt);
    }
    
}
