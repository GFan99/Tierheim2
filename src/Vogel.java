/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schueler
 */
class Vogel extends Tier{
    int vRNr;

    protected Vogel(int tNr, float tGebuehr, int rNr, String tName, String tRasse, String tGeschlecht, String gebDat, String tFarbe, String tFutterzeit, int vRNr)
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
    this.vRNr=vRNr;
    }
    protected int getvRNr()
    {
        return vRNr;
    }
//Hallo
}
