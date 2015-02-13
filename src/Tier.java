/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author becksusanna
 */
public class Tier{
    
    public int tNr;
    public float tGebuehr;
    public int rNr;
    public String tName;
    public String tRasse;
    public  String tGeschlecht;
    public String gebDat;
    public String tFarbe;
    public String tFutterzeit;
    
    public String getName()
    {
        return tName;
    }
    public int gettNr()
    {
        return tNr;
    }
    public String gettRasse()
    {
        return tRasse;
    }
    public int getrNr()
    {
        return rNr;
    }
    public String gettGeschlecht()
    {
        return tGeschlecht;
    }
    public String getgebDat()
    {
        return gebDat;
    }
    public String gettFarbe()
    {
        return tFarbe;
    }

    public void setGebuehr(float gebuehr)
    {
        tGebuehr = gebuehr;
    }
    public void setraumNr(int raumNr)
    {
        rNr=raumNr;
    }
    public String gettFutterzeit()
    {
        return tFutterzeit;
    }

}