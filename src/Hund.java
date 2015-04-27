/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author becksusanna
 */
import java.util.*;
class Hund extends Tier {

    protected boolean heuteGassi;

    String hMarke = tNr;
    
    //Konstruktor, um ein Objekt der Klasse Hund mit Tiernummer, Gebühr, Raumnummer, Name,
    //Rasse, Geschlecht, Geburtstag,Farbe, Futterzeit und Hundemarke zu erstellen
    protected Hund(float tGebuehr, int rNr, String tName, String tRasse, String tGeschlecht, String gebDat, String tFarbe, String tFutterzeit, String tNr) {
        this.tGebuehr=tGebuehr;
        this.rNr=rNr;
        this.tName=tName;
        this.tRasse=tRasse;
        this.tGeschlecht=tGeschlecht;
        this.gebDat=gebDat;
        this.tFarbe=tFarbe;
        this.tFutterzeit=tFutterzeit;
        this.tNr=tNr;
        heuteGassi = false;
    }
    
    protected boolean getGassi() {
        return heuteGassi;
    }
    protected void setGassi(boolean trueoderfalse) {
        heuteGassi = trueoderfalse;
    }

    protected String gethMarke() {
        return hMarke;
    }
    
    @Override
    protected void neuerTag() {
        if (heuteGassi == false) {
            System.out.println("Der Hund " + getName() + " mit der Marke " + gethMarke() + "wurde gestern nicht ausgeführt.");
        }
        else {
            setGassi(false);
        }
    }

    /** Die Methode sortiertEinfügen von der Superklasse Tier wird überschrieben.
    * In einer Liste werden Tiere als erstes Kriterium nach Rasse und als zweites
    *Kriterium nach Alter sortiert.
    */
    
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