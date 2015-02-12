/**
 * TRäume  sind Räume(Unterklasse von Raum). In ihnen leben die Tiere in ihren Käfigen/Zwingern/... .
 * @author becksusanna yeah!!!
 */
import java.util.*;

public class TRaum extends Raum{
    public String tierart;
    public int groesseAuslauf;
    public ArrayList<Integer> tiere;
    public ArrayList<Integer> warteliste;

    // Konstruktor für Objekte der Klasse TRaum
    public TRaum(int nr, int anzKaefige, String tierartx, int auslaufGr) {
        rNr = nr;
        anzPlaetze = anzKaefige;
        tierart = tierartx;
        groesseAuslauf = auslaufGr;
    }

    public void setTierart(String nTierart) {
        tierart = nTierart;
    }
    public void setAuslaufGr(int auslaufNeu) {
        groesseAuslauf = auslaufNeu;
    }
    public void addTier(int tier) {
        tiere.add(tier);
    }
    public void add2Warteliste(int tier) {
        warteliste.add(tier);
    }
    
    public String getTierart() {
        return tierart;
    }
    public int getAuslaufGr() {
        return groesseAuslauf;
    }
    public ArrayList<Integer> getTiere() {
        return tiere;
    }
    public ArrayList<Integer> getWarteliste() {
        return warteliste;
    }
}