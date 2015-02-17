/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schueler
 */
    class Katze extends Tier{
        String kMarke;

    protected Katze(int tNr, float tGebuehr, int rNr, String tName, String tRasse, String tGeschlecht, String gebDat, String tFarbe, String tFutterzeit, String kMarke)
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
    this.kMarke=kMarke;
    }
    protected String getkMarke()
    {
        return kMarke;
    }
        
}
