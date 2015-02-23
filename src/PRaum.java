/**
 * PRAUMe sind Räume (Unterklasse von RAUM), die vom Personal genutzt werden, also z.B. Pausenräume,
 * Arztzimmer, Wartezimmer, Büroräume. In ihnen "wohnen" keine Tiere. (Außer sie befinden sich über einen
 * längeren Zeitraum unter ärztlicher Beobachtung und müssen für längere Zeit im Arztzimmer veweilen. Sie
 * werden jedoch trotzdem als zu ihrem normalen "Wohnraum" gehörig betrachtet.)
 * @author becksusanna
 */
class PRaum extends Raum{
    private String rArt;
    private int anzCom;
    
    // Konstruktor für Objekte der Klasse PRAUM
    protected PRaum(int nr, String art, int plaetze) {
        rNr=nr;
        rArt = art;
        anzPlaetze = plaetze;
        anzCom = 0;
    }
    
    protected void setArt(String art) {
        rArt = art;
    }
    protected void setCom(int com) {
        anzCom = com;
    }
    
    
    protected String getRArt() {
        return rArt;
    }
    protected int getComs() {
        return anzCom;
    }
}