/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author becksusanna yeah!!!
 */
abstract class Raum {
    protected int rNr;
    protected int anzPlaetze;
    
    public void setplaetze(int plaetze) {
        anzPlaetze = plaetze;
    }
    
    public int getNr() {
        return rNr;
    }
    public int getPlaetze() {
        return anzPlaetze;
    }
}