/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author becksusanna
 */
protected class Tier{
    
    protected int tNr;
    protected float tGebuehr;
    protected int rNr;
    protected String tName;
    protected String tRasse;
    protected  String tGeschlecht;
    protected String gebDat;
    protected String tFarbe;
    protected String tFutterzeit;
    
    protected String getName()
    {
        return tName;
    }
    protected int gettNr()
    {
        return tNr;
    }
    protected String gettRasse()
    {
        return tRasse;
    }
    protected int getrNr()
    {
        return rNr;
    }
    protected String gettGeschlecht()
    {
        return tGeschlecht;
    }
    protected String getgebDat()
    {
        return gebDat;
    }
    protected String gettFarbe()
    {
        return tFarbe;
    }

    protected void setGebuehr(float gebuehr)
    {
        tGebuehr = gebuehr;
    }
    protected void setraumNr(int raumNr)
    {
        rNr=raumNr;
    }
    protected String gettFutterzeit()
    {
        return tFutterzeit;
    }

}