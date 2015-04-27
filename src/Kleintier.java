
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hanna
 */
class Kleintier extends Tier{

    String chipnr;
    //Konstruktor, um ein Objekt der Klasse Kleintier mit Tiernummer, Gebühr, Raumnummer, Name,
    //Rasse, Geschlecht, Geburtstag, Farbe und Futterzeit zu erstellen
    protected Kleintier(String chipnr, float tGebuehr, int rNr, String tName, String tRasse, String tGeschlecht, String gebDat, String tFarbe, String tFutterzeit)
    {
    this.chipnr=chipnr;
    this.tGebuehr=tGebuehr;
    this.rNr=rNr;
    this.tName=tName;
    this.tRasse=tRasse;
    this.tGeschlecht=tGeschlecht;
    this.gebDat=gebDat;
    this.tFarbe=tFarbe;
    this.tFutterzeit=tFutterzeit;
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
