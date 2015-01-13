package widok;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import javax.swing.JPanel;

public class PanelFunkcji extends JPanel {
    private final Dimension WYMIARY_PANELU = new Dimension(130, 205);
    private final Point POZYCJA_PANELU = new Point(49, 115);
    private MyJButton fe,nawiasL,nawiasP,dms,exp,in,sin,xDoY,log,cos,xDo3,silnia,tan,xDo2,jedenPrzezX;
    public PanelFunkcji () {
        setSize(WYMIARY_PANELU);
        setLocation(POZYCJA_PANELU);
        setLayout(new GridLayout(5, 3,2,2));
        inicjalizacjaOrazDodaniePrzyciskow();
    }
    private void inicjalizacjaOrazDodaniePrzyciskow() {
        fe = new MyJButton("F-E", new Color(153, 0, 153));
        nawiasL = new MyJButton("(", new Color(153, 0, 153));
        nawiasP = new MyJButton(")", new Color(153, 0, 153));
        dms = new MyJButton("dms", new Color(153, 0, 153));
        exp = new MyJButton("Exp", new Color(153, 0, 153));
        in = new MyJButton("In", new Color(153, 0, 153));
        sin = new MyJButton("sin", new Color(153, 0, 153));
        xDoY = new MyJButton("x^y", new Color(153, 0, 153));
        log = new MyJButton("log", new Color(153, 0, 153));
        cos = new MyJButton("cos", new Color(153, 0, 153));
        xDo3 = new MyJButton("x^3", new Color(153, 0, 153));
        silnia = new MyJButton("n!", new Color(153, 0, 153));
        tan = new MyJButton("tan", new Color(153, 0, 153));
        xDo2 = new MyJButton("x^2", new Color(153, 0, 153));
        jedenPrzezX = new MyJButton("1/x", new Color(153, 0, 153));
        add(fe);
        add(nawiasL);
        add(nawiasP);
        add(dms);
        add(exp);
        add(in);
        add(sin);
        add(xDoY);
        add(log);
        add(cos);
        add(xDo3);
        add(silnia);
        add(tan);
        add(xDo2);
        add(jedenPrzezX);
        
    }
}
