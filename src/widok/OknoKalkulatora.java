
package widok;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import javax.swing.JFrame;

public class OknoKalkulatora extends JFrame{
    private final int WYSOKOSC_MENU_BAR=25;
    private final int SZEROKOSC_MENU_BAR=500;
    private final Dimension ROZMIAR_POLA_TEKSTOWEGO = new Dimension(500, 25);
    private final Point POZYCJA_POLA_TEKSTOWEGO = new Point(0, 25);
    private MenuBar menuBar;
    private MyJTextField wynikTF;
    private PanelSystemyPozycyjne systemyPozycyjnePN;
    private PanelKaty katyPN;
    private PanelInvHyp invHypPN;
    private PanelUsuwania usuwaniePN;
    private PanelLewy lewyPN;
    private PanelFunkcji funkcjePN;
    private PanelPamieci pamiecPN;
    private PanelCyfr cyfryPN;
    private PanelOperatorow operatorPN;
    private PanelLiter literyPN;
    public OknoKalkulatora(int x, int y, int szerokosc, int wysokosc) {
        setLayout(null);
        
        inicjalizacjaRamki(x, y, szerokosc, wysokosc);
        inicjalizacjaOrazDodanieMenuBara();
        inicjalizacjaOrazDodaniePolaWyniku();
        inicjalizacjaOrazDodaniePaneluSystemy();
        inicjalizacjaOrazDodaniePaneluKatow();
        inicjalziacjaOrazDodaniePaneluInvHyp();
        inicjalizacjaOrazDodaniePaneluUsuwania();
        inicjalizacjaOrazDodaniePaneluLewego();
        inicjalizacjaOrazDodaniePaneluFunkcji();
        inicjalizacjaOrazDodaniePaneluPamieci();
        inicjalizacjaOrazDodaniePaneluCyfr();
        inicjalizacjaOrazDodaniePaneluOperatorow();
        inicjalizacjaOrazDodaniePaneluLiter();
        setVisible(true);
    }
    private void inicjalizacjaRamki(int x, int y, int szerokosc, int wysokosc) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        Insets insets;
        insets = getInsets();
        setBounds(x, y, szerokosc + insets.left + insets.right, wysokosc + insets.top + insets.bottom);
    }
    private void inicjalizacjaOrazDodanieMenuBara() {
        menuBar = new MenuBar();
        menuBar.setBounds(0, 0, SZEROKOSC_MENU_BAR , WYSOKOSC_MENU_BAR);
        add(menuBar, BorderLayout.NORTH);
    }
    private void inicjalizacjaOrazDodaniePolaWyniku() {
        wynikTF = new MyJTextField();
        wynikTF.setSize(ROZMIAR_POLA_TEKSTOWEGO);
        wynikTF.setLocation(POZYCJA_POLA_TEKSTOWEGO);
        add(wynikTF);
    }
    private void inicjalizacjaOrazDodaniePaneluSystemy () {
        systemyPozycyjnePN = new PanelSystemyPozycyjne();
        add(systemyPozycyjnePN);
        
    }
    private void inicjalizacjaOrazDodaniePaneluKatow() {
        katyPN = new PanelKaty();
        add(katyPN);
    }
    private void inicjalziacjaOrazDodaniePaneluInvHyp() {
        invHypPN = new PanelInvHyp();
        add(invHypPN);
    }
    private void inicjalizacjaOrazDodaniePaneluUsuwania () {
        usuwaniePN = new PanelUsuwania();
        add(usuwaniePN);
    }
    private void inicjalizacjaOrazDodaniePaneluLewego() {
        lewyPN = new PanelLewy();
        add(lewyPN);
    }
    private void inicjalizacjaOrazDodaniePaneluFunkcji() {
        funkcjePN = new PanelFunkcji();
        add(funkcjePN);
    }
    private void inicjalizacjaOrazDodaniePaneluPamieci() {
        pamiecPN = new PanelPamieci();
        add(pamiecPN);
    }
    private void inicjalizacjaOrazDodaniePaneluCyfr() {
        cyfryPN = new PanelCyfr();
        add(cyfryPN);
    }
    private void inicjalizacjaOrazDodaniePaneluOperatorow() {
        operatorPN = new PanelOperatorow();
        add(operatorPN);
    }
    private void inicjalizacjaOrazDodaniePaneluLiter() {
        literyPN = new PanelLiter();
        add(literyPN);
    }
    
}
