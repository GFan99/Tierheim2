/**
 * TRäume  sind Räume(Unterklasse von Raum). In ihnen leben die Tiere in ihren Käfigen/Zwingern/... .
 * @author becksusanna yeah!!!
 */
import java.util.*;

class TRaum extends Raum{
    private String tierart;
    private int groesseAuslauf;
    private ArrayList<Tier> tiere;
    private ArrayList<Tier> warteliste;

    // Konstruktor für Objekte der Klasse TRaum
    protected TRaum(int nr, int anzKaefige, String tierartx, int auslaufGr) {
        rNr = nr;
        anzPlaetze = anzKaefige;
        tierart = tierartx;
        groesseAuslauf = auslaufGr;
    }

    protected void setTierart(String nTierart) {
        tierart = nTierart;
    }
    protected void setAuslaufGr(int auslaufNeu) {
        groesseAuslauf = auslaufNeu;
    }
    protected void addTier(Tier tier) {
        tiere.add(tier);
    }
    protected void removeFromTiere(Tier tier) {
        tiere.remove(tier);
    }
    protected void add2Warteliste(Tier tier) {
        warteliste.add(tier);
    }
    protected void removeFromWartel(Tier tier) {
        warteliste.remove(tier);
    }
    
    protected String getTierart() {
        return tierart;
    }
    protected int getAuslaufGr() {
        return groesseAuslauf;
    }
    protected ArrayList<Tier> getTiere() {
        return tiere;
    }
    protected ArrayList<Tier> getWarteliste() {
        return warteliste;
    }
    
    /* protected void neuerTag() {
        for(int i = 0; i <= tiere.size(); i++) {
            tiere.get(i).setGassi(false);
        }
    }*/

    /**
     *
     * @return
     */
    
}