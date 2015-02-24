/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author becksusanna
 */
abstract class Raum{
    protected int rNr;
    protected int anzPlaetze;
    
    protected void setplaetze(int plaetze) {
        anzPlaetze = plaetze;
    }
    protected void setRNr(int rNr) {
        this.rNr = rNr;
    }
    
    protected int getNr() {
        return rNr;
    }
    protected int getPlaetze() {
        return anzPlaetze;
    }
}