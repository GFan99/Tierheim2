/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * @author becksusanna
 */

import java.util.*;
import java.io.Serializable;
        
abstract class Tier implements Serializable{
    
    protected float tGebuehr;
    protected int rNr;
    protected String tName;
    protected String tRasse;
    protected String tGeschlecht;
    protected String gebDat;
    protected String tFarbe;
    protected String tFutterzeit;
    protected Vorbesitzer vorbesitzer;
    protected String tNr;
    
    protected String getName() {
        return tName;
    }
    protected String gettRasse() {
        return tRasse;
    }
    protected int getrNr() {
        return rNr;
    }
    protected String gettGeschlecht() {
        return tGeschlecht;
    }
    protected String getgebDat() {
        return gebDat;
    }
    protected String gettFarbe() {
        return tFarbe;
    }
    
    protected void setGebuehr(float gebuehr) {
        tGebuehr = gebuehr;
    }
    protected void setraumNr(int raumNr) {
        rNr=raumNr;
    }
    protected String gettFutterzeit() {
        return tFutterzeit;
    }
    protected String gettNr() {
        return tNr;
    }
    
    protected abstract void neuerTag();
    
    protected abstract void sortiertEinfügen(ArrayList<Tier> liste, Tier tier);

}