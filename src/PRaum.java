/**
 * PRAUMe sind Räume (Unterklasse von RAUM), die vom Personal genutzt werden, also z.B. Pausenräume,
 * Arztzimmer, Wartezimmer, Büroräume. In ihnen "wohnen" keine Tiere. (Außer sie befinden sich über einen
 * längeren Zeitraum unter ärztlicher Beobachtung und müssen für längere Zeit im Arztzimmer veweilen. Sie
 * werden jedoch trotzdem als zu ihrem normalen "Wohnraum" gehörig betrachtet.)
 * @author becksusanna yeah!!!
 */
public class PRaum extends Raum{
    public String rArt;
    public int anzCom;
    
    // Konstruktor für Objekte der Klasse PRAUM
    public PRaum(int nr, String art, int plaetze) {
        rNr=nr;
        String rArt = art;
        anzPlaetze = plaetze;
        anzCom = 0;
    }
    
    public void setArt(String art) {
        rArt = art;
    }
    public void setCom(int com) {
        anzCom = com;
    }
    
    
    public String getRArt() {
        return rArt;
    }
    public int getComs() {
        return anzCom;
    }
}