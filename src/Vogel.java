
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schueler
 */
class Vogel extends Tier{
    int vRingNr;

    protected int vRNr;


    //Konstruktor, um ein Objekt der Klasse Vogel mit Tiernummer, Gebühr, Raumnummer, Name,
    //Rasse, Geschlecht, Geburtstag, Farbe, Futterzeit und Vogelringnummer zu erstellen
    protected Vogel(int tNr, float tGebuehr, int rNr, String tName, String tRasse, String tGeschlecht, String gebDat, String tFarbe, String tFutterzeit, int vRingNr)
    {
    this.tNr=tNr;
    this.tGebuehr=tGebuehr;
    this.rNr=rNr;
    this.tName=tName;
    this.tRasse=tRasse;
    this.tGeschlecht=tGeschlecht;
    this.gebDat=gebDat;
    this.tFarbe=tFarbe;
    this.tFutterzeit=tFutterzeit;
    this.vRingNr=vRingNr;
    }
    protected int getvRNr() {
        return vRingNr;
    }

    @Override
    protected void neuerTag() {}
    
    @Override
    protected void sortiertEinfügen(ArrayList<Tier> liste, Tier element) {
        String a = element.gettRasse();
        for (int i=0;i<liste.size();i++)
       { String vergleich = (liste.get(i)).gettRasse();
        if (a.charAt(0) < vergleich.charAt(0)){
           liste.add(i,element);
           
        }
       }
    }
}
