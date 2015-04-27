
import java.util.*;

/**
 *
* @author Hanna
 */

class Katze extends Tier{
    
    private String kMarke;

    //Konstruktor, um ein Objekt der Klasse Katze mit Tiernummer, Gebühr, Raumnummer, Name,
    //Rasse, Geschlecht, Geburtstag,Farbe, Futterzeit und Katzenmarke zu erstellen
    protected Katze(float tGebuehr, int rNr, String tName, String tRasse, String tGeschlecht, String gebDat, String tFarbe, String tFutterzeit, String kMarke) {
        this.tGebuehr=tGebuehr;
        this.rNr=rNr;
        this.tName=tName;
        this.tRasse=tRasse;
        this.tGeschlecht=tGeschlecht;
        this.gebDat=gebDat;
        this.tFarbe=tFarbe;
        this.tFutterzeit=tFutterzeit;
        this.kMarke=kMarke;
    }
    
    protected String getkMarke() {
        return kMarke;
    }
    
    @Override
    protected void neuerTag() {}
    

    
    /* Die Methode sortiertEinfügen von der Superklasse Tier wird überschrieben.
    *  In einer Liste werden Tiere als erstes Kriterium nach Rasse und als zweites
    *  Kriterium nach Alter sortiert.
    */
    @Override
    protected void sortiertEinfügen(ArrayList<Tier> liste, Tier element) {
/*  @Override
    protected void sortiertEinfügenTier(ArrayList<Tier> liste, Tier element) {
        String a = element.gettRasse();
        for (int i=0;i<liste.size();i++) {
            String vergleich = (liste.get(i)).gettRasse();
            if (a.charAt(0) < vergleich.charAt(0)){
                liste.add(i,element);
            }
        }
*/
        String rasse=element.gettRasse();
        for (int i=0;i<liste.size();i++)
       {  String vergleich = (liste.get(i)).gettRasse();
          if (rasse.charAt(0) < vergleich.charAt(0))
             liste.add(i,element);
          if (rasse.charAt(i) > vergleich.charAt(i))
             i++;
          if (rasse.charAt(i) == vergleich.charAt(i))
        {

        }
       }
    }
}