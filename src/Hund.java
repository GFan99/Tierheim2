/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author becksusanna
 */
class Hund extends Tier {

    protected boolean heuteGassi;

    String hMarke;
    protected Hund(int tNr, float tGebuehr, int rNr, String tName, String tRasse, String tGeschlecht, String gebDat, String tFarbe, String tFutterzeit, String hMarke)
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
    this.hMarke=hMarke;
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
        setGassi(false);
    }
}